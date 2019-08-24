<%@page import="br.com.Mes.Mes"%>
<%@page import="br.com.Mes.ListarMes"%>
<%@page import="br.com.Funcionarios.Funcionario"%>
<%@page import="br.com.Funcionarios.ListarFuncionario"%>
<%@page import="br.com.Unidades.Unidades"%>
<%@page import="br.com.Unidades.ListarUnidades"%>
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
                <div class="panel panel-default">
                    <div class="panel-heading"><i class="fa fa-truck"></i> Cadastro de Encomendas </div>
                    <div class="panel-body">
                        <div class="row">
                            <form class="form" action="../AddEncomendas" name="formulario" method='post' id="formulario"> 
                                <div class="col-xs-12 col-lg-12">
                                    <div class="form-group">    
                                        <div class="row">
                                            <div class="form-group col-xs-2 col-lg-2">
                                                <label class="control-label" for="recebeu">Recebeu</label>
                                                <select name="recebeu" id="recebeu" class="form-control">
                                                    <%
                                                        ListarFuncionario database = new ListarFuncionario();
                                                        database.getConexaoMySQL();
                                                        for (Funcionario funcionario : database.listFuncionario()) {
                                                    %>
                                                    <option value="<%=funcionario.getId()%>"><%=funcionario.getNome()%></option>
                                                    <%}%>
                                                </select>
                                                </select>
                                            </div>
                                            <div class="form-group col-xs-2 col-lg-2">
                                                <label class="control-label" for="destinatario">Destinatário</label>
                                                <select name="destinatario" id="destinatario" class="form-control">
                                                    <%
                                                        ListarUnidades database1 = new ListarUnidades();
                                                        database1.getConexaoMySQL();
                                                        for (Unidades unidades : database1.listUnidades()) {
                                                    %>
                                                    <option value="<%=unidades.getId()%>"><%=unidades.getCasa()%></option>
                                                    <%}%>
                                                </select>
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="remetente">Remetente</label>
                                                <input name="remetente" id="remetente" class="form-control" placeholder="Remetente">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="cod_rastreio">Cod. Rastreio</label>
                                                <input name="cod_rastreio" id="cod_rastreio" class="form-control" placeholder="Cod. Rastreio">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="dt_chegada">Data Chegada</label>
                                                <input name="dt_chegada" id="dt_chegada" class="form-control" placeholder="Data Chegada" type="date">
                                            </div>
                                            <div class="form-group col-xs-2 col-lg-2">
                                                <label class="control-label" for="mes">Mês</label>
                                                <select name="mes" id="mes" class="form-control">
                                                    <%
                                                        ListarMes database2 = new ListarMes();
                                                        database2.getConexaoMySQL();
                                                        for (Mes mes : database2.listMes()) {
                                                    %>
                                                    <option value="<%=mes.getId()%>"><%=mes.getMes()%></option>
                                                    <%}%>
                                                </select>
                                            </div>
                                        </div>
                                        <!-- FIM LINHA -->
                                        <div class="row">
                                            <div class="form-group col-xs-3 col-lg-3">
                                                <button type="submit" id="submit" value="submit" class="btn btn-primary"> <i class="glyphicon glyphicon-ok"></i> Salvar</button>
                                            </div>                                   
                                        </div>    
                                    </div> <!-- DIV FORM GROUP-->
                                </div>  
                            </form> 
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
