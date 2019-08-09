package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String serverName = "localhost:3306";
    private final String myDatabase = "db_meucondominio";
    private final String url = "jdbc:mysql://" + serverName + "/" + myDatabase;
    private final String username = "root";
    private final String password = "";

    public ConexaoMySQL() {
        
    }

    public java.sql.Connection getConexaoMySQL() {
        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
            
        } catch (ClassNotFoundException e) {
            System.out.println("The specified driver was not found.");
            return null;
        } catch (SQLException e){
            System.out.println("Could not connect to Database");
            return null;
        }
    }
    
    public boolean CloseConnection(){
        try {
            getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public java.sql.Connection restartConnection(){
        CloseConnection();
        return getConexaoMySQL();
    }
}