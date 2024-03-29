/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Funcionarios;

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

public class AddFuncionario extends HttpServlet {

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
        String funcao = request.getParameter("funcao");
        String status = request.getParameter("status");
        String dt_admicao = request.getParameter("dt_admicao");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_funcionarios (nome, funcao, status, dt_admicao) "
                    + "VALUES (?, ?, ?, ?)");
            ps.setString(1, nome);
            ps.setString(2, funcao);
            ps.setString(3, status);
            ps.setString(4, dt_admicao);
            ps.executeUpdate();
            response.sendRedirect("pages/funcionarios.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/funcionarios_cadastro.jsp");
        }
    }
}
