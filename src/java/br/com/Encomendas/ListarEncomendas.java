package br.com.Encomendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarEncomendas {
   public String status;
   private ArrayList<Encomendas> listEncomendas;

    public ListarEncomendas() {
        this.status = "offline";
        this.listEncomendas = new ArrayList<Encomendas>();
    }

    public ListarEncomendas(ArrayList<Encomendas> listEncomendas) {
        this.status = "offline";
        this.listEncomendas = listEncomendas;
    }

    public ArrayList<Encomendas> listEncomendas() {
        return listEncomendas;
    }

    public void setListUsuario(ArrayList<Encomendas> listEncomendas) {
        this.listEncomendas = listEncomendas;
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
                getBanco(connection, listEncomendas);
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
    
    private void getBanco(Connection conn, ArrayList<Encomendas> listItems) throws SQLException {
        String query  = "Select * from tb_encomendas"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listEncomendas.add(new Encomendas(rs.getInt("id"), rs.getString("recebeu"),
                            rs.getString("destinatario"), rs.getString("remetente"), rs.getString("cod_rastreio"), rs.getString("dt_chegada")
                            , rs.getInt("id_mes"), rs.getString("dt_retirada"), rs.getString("dt_cadastro")));
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
