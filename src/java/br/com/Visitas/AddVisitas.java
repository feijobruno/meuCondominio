/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Visitas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddVisitas extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String tipoVisita = request.getParameter("tipo");
        String unidade = request.getParameter("unidade");
        String mes = request.getParameter("id_mes");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_visitantes (nome, tipo_visita, rg, id_unidade, id_mes, dt_cadastro) "
                    + "VALUES (?, ?, ?, ?, ?, NOW())");
            ps.setString(1, nome);
            ps.setString(2, tipoVisita);
            ps.setString(3, rg);
            ps.setString(4, unidade);
            ps.setString(5, mes);
            ps.executeUpdate();
            response.sendRedirect("pages/visitas.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/visitas_cadastro.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
