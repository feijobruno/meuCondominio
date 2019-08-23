package br.com.Moradores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarMoradores {
   public String status;
   private ArrayList<Moradores> listMoradores;

    public ListarMoradores() {
        this.status = "offline";
        this.listMoradores = new ArrayList<Moradores>();
    }

    public ListarMoradores(ArrayList<Moradores> listMoradores) {
        this.status = "offline";
        this.listMoradores = listMoradores;
    }

    public ArrayList<Moradores> listMoradores() {
        return listMoradores;
    }

    public void setListUsuario(ArrayList<Moradores> listMoradores) {
        this.listMoradores = listMoradores;
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
                getBanco(connection, listMoradores);
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
    
    private void getBanco(Connection conn, ArrayList<Moradores> listItems) throws SQLException {
        String query  = "Select * from tb_moradores"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listMoradores.add(new Moradores(rs.getInt("id_morador"), rs.getString("nome"),
                            rs.getString("email"), rs.getString("cpf"), rs.getString("rg"), rs.getString("dt_nascimento"), rs.getString("telefone"),
                    rs.getInt("id_apartamento"), rs.getInt("status"), rs.getString("tipo_morador"), rs.getString("dt_cadastro")));
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
