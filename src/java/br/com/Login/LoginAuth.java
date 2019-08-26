package br.com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAuth extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
                PreparedStatement ps = c.prepareStatement("select email, senha from tb_usuarios where email=? and senha=?");
                ps.setString(1, usuario);
                ps.setString(2, senha);

                ResultSet rs = ps.executeQuery();
                if (rs.next()){
                    HttpSession sessao = request.getSession();
                    sessao.setAttribute("chave", usuario);
                    response.sendRedirect("pages/index.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
                
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
