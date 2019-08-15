package br.com.Veiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarVeiculos {
   public String status;
   private ArrayList<Veiculos> listVeiculos;

    public ListarVeiculos() {
        this.status = "offline";
        this.listVeiculos = new ArrayList<Veiculos>();
    }

    public ListarVeiculos(ArrayList<Veiculos> listVeiculos) {
        this.status = "offline";
        this.listVeiculos = listVeiculos;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Veiculos> getListVeiculos() {
        return listVeiculos;
    }

    public void setListVeiculos(ArrayList<Veiculos> listVeiculos) {
        this.listVeiculos = listVeiculos;
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
                getBanco(connection, listVeiculos);
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
    
    private void getBanco(Connection conn, ArrayList<Veiculos> listItems) throws SQLException {
        String query  = "Select * from tb_veiculos"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listVeiculos.add(new Veiculos(rs.getInt("id_veiculo"), rs.getString("placa"), rs.getString("marca"), rs.getString("modelo"), rs.getInt("ano"),
                            rs.getString("cor"), rs.getInt("id_apartamento"), rs.getString("dt_cadastro"), rs.getInt("id_cadastro")));
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