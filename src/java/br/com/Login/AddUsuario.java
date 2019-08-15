/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class AddUsuario extends HttpServlet {
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
        String email = request.getParameter("email");
        String id_unidade = request.getParameter("unidade");
        String senha = request.getParameter("senha");
        String perfil = request.getParameter("perfil");
        String status = request.getParameter("status");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_usuarios (nome, email, id_unidade, senha, perfil, status, dt_cadastro) "
                    + "VALUES (?, ?, ?, ?, ?, ?, NOW())");
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, id_unidade);
            ps.setString(4, senha);
            ps.setString(5, perfil);
            ps.setString(6, status);
            ps.executeUpdate();
            response.sendRedirect("pages/usuarios.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/usuarios_cadastro.jsp");
        }
    }
}
