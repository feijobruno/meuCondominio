package br.com.Infracoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarInfracoes {

    public String status;
    public ArrayList<Infracao> listInfracoes;

    public ListarInfracoes() {
        this.status = "offline";
        this.listInfracoes = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Infracao> getListInfracoes() {
        return listInfracoes;
    }

    public void setListInfracoes(ArrayList<Infracao> listInfracoes) {
        this.listInfracoes = listInfracoes;
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
                getBanco(connection, listInfracoes);
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

    private void getBanco(Connection conn, ArrayList<Infracao> listItems) throws SQLException {
        String query = "Select * from tb_infracoes"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null) {
            while (rs.next()) {
                try {
                    listInfracoes.add(new Infracao(rs.getInt("id_infracao"), rs.getString("tipo_infracao"),
                            rs.getString("nome_infrator"), rs.getString("valor_multa"), rs.getString("dt_cadastro"),
                            rs.getString("dt_ocorrido"), rs.getInt("id_apartamento"), rs.getInt("id_animal"), rs.getInt("id_mes")));
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
