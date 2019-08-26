/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Infracoes;

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

public class AddInfracao extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipoInfracao = request.getParameter("tipoInfracao");
        String nomeInfrator = request.getParameter("nomeInfrator");
        String valorMulta = request.getParameter("valorMulta");
        String idApartamento = request.getParameter("idApartamento");
        String idMes = request.getParameter("idMes");
        String idAnimal = request.getParameter("idAnimal");
        String dt_ocorrido = request.getParameter("dtOcorrido");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_meucondominio", "root", "");
            PreparedStatement ps = c.prepareStatement("INSERT INTO tb_infracoes "
                    + "(tipo_infracao, nome_infrator, valor_multa, id_apartamento, id_mes, dt_ocorrido, dt_cadastro)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, NOW())");
            ps.setString(1, tipoInfracao);
            ps.setString(2, nomeInfrator);
            ps.setString(3, valorMulta);
            ps.setString(4, idApartamento);
            ps.setString(5, idMes);
            ps.setString(6, idAnimal);
            ps.setString(7, dt_ocorrido);
            ps.executeUpdate();
            response.sendRedirect("pages/infracoes.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pages/animais_cadastro.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
