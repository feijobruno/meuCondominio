package br.com.Financeiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarBoletos {
   public String status;
   private ArrayList<Financeiro> listBoletos;

    public ListarBoletos() {
        this.status = "offline";
        this.listBoletos = new ArrayList<Financeiro>();
    }

    public ListarBoletos(ArrayList<Financeiro> listBoletos) {
        this.status = "offline";
        this.listBoletos = listBoletos;
    }

    public ArrayList<Financeiro> listBoletos() {
        return listBoletos;
    }

    public void setListUsuario(ArrayList<Financeiro> listBoletos) {
        this.listBoletos = listBoletos;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.sql.Connection getConexaoMySQL() {
        Connection connection = null;
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String serverName = "localhost:3306";
            String myDatabase = "db_meucondominio";
            String url = "jdbc:mysql://" + serverName + "/" + myDatabase;
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
                getBanco(connection, listBoletos);
            }
            return connection;
        } catch (ClassNotFoundException e) {
            status = "offline";
            return null;
        } catch (SQLException e){
            status = "offline";
            return null;
        }
    }
    
    private void getBanco(Connection conn, ArrayList<Financeiro> listItems) throws SQLException {
        String query  = "Select * from tb_boletos"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listBoletos.add(new Financeiro(rs.getInt("id"), rs.getInt("id_unidade"),
                            rs.getInt("id_mes"), rs.getDouble("valor"), rs.getString("status")));
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
            status = "online";
        }
    }
   
    public String ConnectionStatus(){
        return status;
    }
}
