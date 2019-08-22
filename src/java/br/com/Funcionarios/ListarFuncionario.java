package br.com.Funcionarios;

import br.com.Login.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarFuncionario {
   public String status;
   private ArrayList<Funcionario> listFuncionario;

    public ListarFuncionario() {
        this.status = "offline";
        this.listFuncionario = new ArrayList<Funcionario>();
    }

    public ListarFuncionario(ArrayList<Usuario> listUsuario) {
        this.status = "offline";
        this.listFuncionario = listFuncionario;
    }

    public ArrayList<Funcionario> listFuncionario() {
        return listFuncionario;
    }

    public void setListUsuario(ArrayList<Usuario> listUsuario) {
        this.listFuncionario = listFuncionario;
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
                getBanco(connection, listFuncionario);
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
    
    private void getBanco(Connection conn, ArrayList<Funcionario> listItems) throws SQLException {
        String query  = "Select * from tb_funcionarios"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listFuncionario.add(new Funcionario(rs.getInt("id"), rs.getInt("status"),
                            rs.getString("nome"), rs.getString("funcao"), rs.getString("dt_admicao"), rs.getString("dt_desligamento")));
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
