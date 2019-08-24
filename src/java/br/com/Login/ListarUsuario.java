package br.com.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarUsuario {
   public String status;
   private ArrayList<Usuario> listUsuario;

    public ListarUsuario() {
        this.status = "offline";
        this.listUsuario = new ArrayList<Usuario>();
    }

    public ListarUsuario(ArrayList<Usuario> listUsuario) {
        this.status = "offline";
        this.listUsuario = listUsuario;
    }

    public ArrayList<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(ArrayList<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
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
                getBanco(connection, listUsuario);
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
    
    private void getBanco(Connection conn, ArrayList<Usuario> listItems) throws SQLException {
        String query  = "Select * from tb_usuarios"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listUsuario.add(new Usuario(rs.getInt("id_usuario"), rs.getInt("id_unidade"), rs.getString("status"),
                            rs.getString("nome"), rs.getString("email"), rs.getString("senha"), rs.getString("perfil")));
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
