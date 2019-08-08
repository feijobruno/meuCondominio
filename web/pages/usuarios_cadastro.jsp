<%-- 
    Document   : index
    Created on : 06/08/2019, 09:21:09
    Author     : BrunoFeijo
--%>

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
                    <div class="panel-heading"><i class="fa fa-user"></i> Cadastro de Usuários </div>
                    <div class="panel-body">
                        <div class="row">
                            <form class="form" action="" name="formulario" method="POST" enctype="multipart/form-data" id="formulario"> 
                                <div class="col-xs-12 col-lg-12">
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="form-group col-xs-3 col-md-3 col-lg-3">
                                                <label for="nome">Nome</label>
                                                <input name="nome" id="nome" class="form-control" placeholder="Nome" value="">
                                            </div>   
                                            <div class="form-group col-xs-3 col-md-3 col-lg-3">
                                                <label for="email">E-mail</label>
                                                <input name="email" id="email" class="form-control" placeholder="E-mail" value="">
                                            </div>   
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="unidade">Unidade</label>
                                                <input name="unidade" id="unidade" class="form-control" placeholder="Unidade" value="">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="senha">Senha</label>
                                                <input name="senha" id="senha" class="form-control" placeholder="Senha" value="">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="perfil">Perfil</label>
                                                <input name="perfil" id="cor" class="form-control" placeholder="perfil" value="">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="status">Status</label>
                                                <input name="status" id="status" class="form-control" placeholder="status" value="">
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
