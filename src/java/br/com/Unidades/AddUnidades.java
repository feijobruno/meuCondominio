
package br.com.Unidades;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marlon
 */
public class AddUnidades extends HttpServlet {
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
        
        String proprietario = request.getParameter("proprietario");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String id_morador = request.getParameter("id_morador");
        String id_vaga = request.getParameter("id_vaga");
        String status = request.getParameter("status");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_unidades (proprietario, cpf, telefone, id_morador, id_vaga, status) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, proprietario);
            ps.setString(2, cpf);
            ps.setString(3, telefone);
            ps.setString(4, id_morador);
            ps.setString(5, id_vaga);
            ps.setString(6, status);
            ps.executeUpdate();
            response.sendRedirect("pages/unidades.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/unidades_cadastro.jsp");
        }
    }
}
