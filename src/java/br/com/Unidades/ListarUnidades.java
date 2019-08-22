package br.com.Unidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarUnidades {
   public String status;
   private ArrayList<Unidades> listUnidades;

    public ListarUnidades() {
        this.status = "offline";
        this.listUnidades = new ArrayList<Unidades>();
    }

    public ListarUnidades(ArrayList<Unidades> listUsuario) {
        this.status = "offline";
        this.listUnidades = listUnidades;
    }

    public ArrayList<Unidades> listUnidades() {
        return listUnidades;
    }

    public void setListUsuario(ArrayList<Unidades> listUnidades) {
        this.listUnidades = listUnidades;
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
                getBanco(connection, listUnidades);
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
    
    private void getBanco(Connection conn, ArrayList<Unidades> listItems) throws SQLException {
        String query  = "Select * from tb_unidades"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listUnidades.add(new Unidades(rs.getInt("id_unidade "), rs.getInt("status"),
                            rs.getString("proprietario"), rs.getString("cpf"), rs.getString("telefone"), rs.getInt("id_morador"), rs.getInt("id_vaga")));
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
