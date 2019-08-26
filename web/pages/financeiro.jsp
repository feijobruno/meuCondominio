<%@page import="br.com.Financeiro.Financeiro"%>
<%@page import="br.com.Financeiro.ListarBoletos"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="en">
    <% HttpSession session1 = request.getSession(false);
    if(session1 != null){
    %> 
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="../includes/img/favicon.ico" type="image/x-icon" />

        <title>Meu Condomínio</title>
        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="../vendor/sb-admin/css/sb-admin-2.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="wrapper">
            <!-- Navbar e Menu -->
            <%@include file="menu.jsp" %>
            <div id="page-wrapper">
                <!-- /#page-wrapper -->
                <br>  
                <div class="row">
                    <div class="col-lg-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <i class="fa fa-money"></i> Boletos Gerados                      
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <table width="100%" class="table table-striped table-bordered table-hover table-condensed" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Unidade</th>
                                            <th>Mês</th>
                                            <th>Valor</th>
                                            <th>Status</th>
                                            <th>Boleto</th>
                                        </tr>
                                        <%
                                            ListarBoletos database = new ListarBoletos();
                                            database.getConexaoMySQL();
                                            for (Financeiro boletos : database.listBoletos()) {
                                        %>
                                        <tr>
                                            <th><%=boletos.getId()%></th>
                                            <th><%=boletos.getIdUnidade()%></th>
                                            <th><%=boletos.getIdMes()%></th>
                                            <th><%=boletos.getValor()%></th>
                                            <th><%=boletos.getStatus()%></th>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </thead>
                                </table>
                            </div>     <!-- /.table-responsive -->
                        </div> 
                    </div>
                </div>                  
            </div>
            <!-- /#wrapper -->
            <!-- jQuery -->
            <script src="../vendor/jquery/jquery.min.js"></script>
            <!-- Bootstrap Core JavaScript -->
            <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
            <!-- Metis Menu Plugin JavaScript -->
            <script src="../vendor/metisMenu/metisMenu.min.js"></script>
            <!-- Custom Theme JavaScript -->
            <script src="../vendor/sb-admin/js/sb-admin-2.js"></script>
    </body>
    <%} else {
    response.sendRedirect("../index.jsp");
    }%>
</html>
