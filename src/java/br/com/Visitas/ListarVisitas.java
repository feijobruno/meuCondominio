package br.com.Visitas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListarVisitas {
   public String status;
   private ArrayList<Visitas> listVisitas;

    public ListarVisitas() {
        this.status = "offline";
        this.listVisitas = new ArrayList<Visitas>();
    }

    public ListarVisitas(ArrayList<Visitas> listVisitas) {
        this.status = "offline";
        this.listVisitas = listVisitas;
    }

    public ArrayList<Visitas> listVisitas() {
        return listVisitas;
    }

    public void setListUsuario(ArrayList<Visitas> listVisitas) {
        this.listVisitas = listVisitas;
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
                getBanco(connection, listVisitas);
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
    
    private void getBanco(Connection conn, ArrayList<Visitas> listItems) throws SQLException {
        String query  = "Select * from tb_visitantes"; //Query do SQL
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs != null){
            while (rs.next()){
                try {
                    listVisitas.add(new Visitas(rs.getInt("id"), rs.getString("tipo_visita"),
                            rs.getString("nome"), rs.getString("rg"), rs.getInt("id_unidade"), rs.getString("dt_cadastro"), rs.getInt("id_mes")));
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
