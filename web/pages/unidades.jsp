<%@page import="br.com.Unidades.ListarUnidades"%>
<%@page import="br.com.Unidades.Unidades"%>
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
                    <div class="col-lg-4 col-xs-4">
                        <div class="panel panel-heading">
                            <a href="unidades_cadastro.jsp"><button type="submit" class="btn btn-default"> <i class="fa fa-plus"></i> Nova Unidade</button></a>
                        </div>
                    </div>
                </div>    
                <div class="row">
                    <div class="col-lg-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <i class="fa fa-building"></i> Unidades Cadastradas                      
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <table width="100%" class="table table-striped table-bordered table-hover table-condensed" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Status</th>
                                            <th>Proprietário</th>
                                            <th>Cpf</th>
                                            <th>Telefone</th>
                                            <th>Id do Morador</th>
                                            <th>Id da Vaga</th>
                                        </tr>
                                        <%
                                            ListarUnidades database = new ListarUnidades();
                                            database.getConexaoMySQL();
                                            for (Unidades unidades : database.listUnidades()) {
                                        %>
                                        <tr>
                                            <th><%=unidades.getId()%></th>
                                            <th><%=unidades.getStatus()%></th>
                                            <th><%=unidades.getProprietario()%></th>
                                            <th><%=unidades.getCpf()%></th>
                                            <th><%=unidades.getTelefone()%></th>
                                            <th><%=unidades.getId_morador()%></th>
                                            <th><%=unidades.getId_vaga()%></th>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>    
                                            <td class="odd gradeX" align="center"><a href="unidades_cadastro.jsp"></a></td>  
                                        </tr>
                                    </tbody>
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
