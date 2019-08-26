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
                <div class="panel panel-default">
                    <div class="panel-heading"><i class="fa fa-building"></i> Cadastro de Unidades </div>
                    <div class="panel-body">
                        <div class="row">
                            <form class="form" action="../AddUnidades" name="formulario" method='post' id="formulario"> 
                                <div class="col-xs-12 col-lg-12">
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="form-group col-xs-3 col-md-3 col-lg-3">
                                                <label for="proprietario">Proprietário</label>
                                                <input name="proprietario" id="proprietario" class="form-control" placeholder="Proprietário">
                                            </div>   
                                            <div class="form-group col-xs-2 col-lg-2">
                                                <label class="control-label" for="status">Status</label>
                                                <select name="status" id="status" class="form-control">
                                                    <option value="1">Lotada</option>
                                                    <option value="2">Vazia</option>
                                                </select>
                                            </div>
                                            <div class="form-group col-xs-3 col-md-3 col-lg-3">
                                                <label for="cpf">Cpf</label>
                                                <input name="cpf" id="cpf" class="form-control" placeholder="Cpf" type="number">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="telefone">Telefone</label>
                                                <input name="telefone" id="telefone" class="form-control" placeholder="Telefone" type="tel">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="id_morador">Id do morador</label>
                                                <input name="id_morador" id="id_morador" class="form-control" placeholder="Id do Morador" type="number">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="id_vaga">Id da Vaga</label>
                                                <input name="id_vaga" id="id_vaga" class="form-control" placeholder="Id da Vaga" value="" type="number">
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
    <%} else {
    response.sendRedirect("../index.jsp");
    }%>
</html>
