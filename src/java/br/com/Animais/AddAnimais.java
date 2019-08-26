/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Animais;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddAnimais extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String sexo = request.getParameter("sexo");
        String especie = request.getParameter("especie");
        String raca = request.getParameter("raca");
        String porte = request.getParameter("porte");
        String cor = request.getParameter("cor");
        String obs = request.getParameter("obs");
        String idApartamento = request.getParameter("id_apartamento");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_animais (nome, sexo, especie, raca, porte, cor, obs, id_apartamento, dt_cadastro) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NOW())");
            ps.setString(1, nome);
            ps.setString(2, sexo);
            ps.setString(3, especie);
            ps.setString(4, raca);
            ps.setString(5, porte);
            ps.setString(6, cor);
            ps.setString(7, obs);
            ps.setString(8, idApartamento);
            ps.executeUpdate();
            response.sendRedirect("pages/animais.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/animais_cadastro.jsp");
        }
    }
}
