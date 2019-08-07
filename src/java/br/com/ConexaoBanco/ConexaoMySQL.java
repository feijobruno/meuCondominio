package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    public static String status = "Not connected...";

    public ConexaoMySQL() {
            
    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String serverName = "localhost:3306";
            String myDatabase = "meu_condominio";
            String url = "jdbc:mysql://" + serverName + "/" + myDatabase;
            String username = "root";
            String password = "m31193703";
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
                status = ("STATUS -------> Success!");
            } else {
                status = ("STATUS -------> Failed!");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("The specified driver was not found.");
            return null;
        } catch (SQLException e){
            System.out.println("Could not connect to Database");
            return null;
        }
    }
    
    public static String ConnectionStatus(){
        return status;
    }
    
    public static boolean CloseConnection(){
        try {
            ConexaoMySQL.getConexaoMySQL().close();
            status = "Connection closed!";
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static java.sql.Connection restartConnection(){
        CloseConnection();
        return ConexaoMySQL.getConexaoMySQL();
    }
}
