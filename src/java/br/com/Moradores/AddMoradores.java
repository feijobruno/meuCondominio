package br.com.Moradores;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddMoradores extends HttpServlet {
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
        
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String dtNascimento = request.getParameter("dt_nascimento");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String idApartamento = request.getParameter("id_apartamento");
        String status = request.getParameter("status");
        String tipoMorador = request.getParameter("tipo_morador");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_moradores (nome, cpf, rg, dt_nascimento, email, telefone, id_apartamento, status, dt_cadastro, tipo_morador) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NOW(), ?)");
            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, rg);
            ps.setString(4, dtNascimento);
            ps.setString(5, email);
            ps.setString(6, telefone);
            ps.setString(7, idApartamento);
            ps.setString(8, status);
            ps.setString(9, tipoMorador);
            ps.executeUpdate();
            response.sendRedirect("pages/moradores.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/moradores_cadastro.jsp");
        }
    }
}
