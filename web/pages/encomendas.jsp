<%@page import="br.com.Encomendas.Encomendas"%>
<%@page import="br.com.Encomendas.ListarEncomendas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
                            <a href="encomendas_cadastro.jsp"><button type="submit" class="btn btn-default"> <i class="fa fa-plus"></i> Nova Encomenda</button></a>
                        </div>
                    </div>
                </div>    
                <div class="row">
                    <div class="col-lg-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <i class="fa fa-truck"></i> Encomendas Cadastradas                      
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <table width="100%" class="table table-striped table-bordered table-hover table-condensed" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Recebeu</th>
                                            <th>Destinatário</th>
                                            <th>Remetente</th>
                                            <th>Cod. Rastreio</th>
                                            <th>Data Chegada</th>
                                            <th>Id Mês</th>
                                            <th>Data Retirada</th>
                                            <th>Data Cadastro</th>
                                        </tr>
                                        
                                        <%
                                            ListarEncomendas database = new ListarEncomendas();
                                            database.getConexaoMySQL();
                                            for (Encomendas encomendas : database.listEncomendas()) {
                                        %>
                                        <tr>
                                            <th><%=encomendas.getId()%></th>
                                            <th><%=encomendas.getRecebeu()%></th>
                                            <th><%=encomendas.getDestinatario()%></th>
                                            <th><%=encomendas.getRemetente()%></th>
                                            <th><%=encomendas.getCod_rastreio()%></th>
                                            <th><%=encomendas.getDt_chegada()%></th>
                                            <th><%=encomendas.getId_mes()%></th>
                                            <th><%=encomendas.getDt_retirada()%></th>
                                            <th><%=encomendas.getDt_cadastro()%></th>
                                        </tr>
                                        <%
                                            }
                                        %>
                                        
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>    
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>  
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>    
                                            <td class="odd gradeX" align="center"><a href="encomendas_cadastro.jsp"></a></td>  
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

</html>
