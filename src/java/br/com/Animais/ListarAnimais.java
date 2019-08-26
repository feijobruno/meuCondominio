package br.com.Animais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarAnimais {

    public String status;
    public ArrayList<Animal> listAnimais;

    public ListarAnimais() {
        this.status = "offline";
        this.listAnimais = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Animal> getListAnimais() {
        return listAnimais;
    }

    public void setListAnimais(ArrayList<Animal> listAnimais) {
        this.listAnimais = listAnimais;
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
                getBanco(connection, listAnimais);
            }
            return connection;
        } catch (ClassNotFoundException e) {
            status = "offline";
            return null;
        } catch (SQLException e) {
            status = "offline";
            return null;
        }
    }

    private void getBanco(Connection conn, ArrayList<Animal> listAnimais) throws SQLException {
        String query = "Select * from tb_animais"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null) {
            while (rs.next()) {
                try {
                    listAnimais.add(new Animal(rs.getInt("id_animal"), rs.getInt("id_apartamento"),
                            rs.getString("nome"), rs.getString("sexo"), rs.getString("especie"), rs.getString("raca"),
                            rs.getString("porte"), rs.getString("cor"), rs.getString("obs"), rs.getString("dt_cadastro")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            status = "online";
        }
    }

    public String ConnectionStatus() {
        return status;
    }
}
