package br.com.Encomendas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddEncomendas extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String recebeu = request.getParameter("recebeu");
        String destinatario = request.getParameter("destinatario");
        String remetente = request.getParameter("remetente");
        String cod_rastreio = request.getParameter("cod_rastreio");
        String dtChegada = request.getParameter("dt_chegada");
        String retirada = request.getParameter("dt_retirada");
        String mes = request.getParameter("mes");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_encomendas (recebeu, destinatario, remetente, cod_rastreio, dt_chegada, id_mes, dt_cadastro) "
                    + "VALUES (?, ?, ?, ?, ?, ?, NOW())");
            ps.setString(1, recebeu);
            ps.setString(2, destinatario);
            ps.setString(3, remetente);
            ps.setString(4, cod_rastreio);
            ps.setString(5, dtChegada);
            ps.setString(6, mes);
            ps.executeUpdate();
            response.sendRedirect("pages/encomendas.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/encomendas_cadastro.jsp");
        }
    }
}
