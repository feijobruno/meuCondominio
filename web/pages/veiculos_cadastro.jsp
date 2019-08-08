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
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="../vendor/morrisjs/morris.css" rel="stylesheet">

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
                    <div class="panel-heading"><i class="fa fa-car"></i> Cadastro de Veículos </div>
                    <div class="panel-body">
                        <div class="row">
                            <form class="form" action="" name="formulario" method="POST" enctype="multipart/form-data" id="formulario"> 
                                <div class="col-xs-12 col-lg-12">
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="placa">Placa</label>
                                                <input name="placa" id="placa" class="form-control" placeholder="Placa" value="">
                                            </div>   
                                            <div class="form-group col-xs-2 col-lg-2">
                                                <label class="control-label" for="marca">Marca</label>
                                                <select class="form-control" name="marca" id="marca">
                                                    <option value="">---</option>
                                                    <option value="Audi">Audi</option>
                                                    <option value="BMW">BMW</option>
                                                    <option value="CAOA Chery">CAOA Chery</option>
                                                    <option value="Chevrolet">Chevrolet</option>
                                                    <option value="Citroën">Citroën</option>
                                                    <option value="Fiat">Fiat</option>
                                                    <option value="Ford">Ford</option>
                                                    <option value="Honda">Honda</option>
                                                    <option value="Hyundai">Hyundai</option>
                                                    <option value="Iveco">Iveco</option>
                                                    <option value="JAC">JAC</option>
                                                    <option value="Jeep">Jeep</option>
                                                    <option value="Kia">Kia</option>
                                                    <option value="Land Rover">Land Rover</option>
                                                    <option value="Lifan">Lifan</option>
                                                    <option value="Mercedes-Benz">Mercedes-Benz</option>
                                                    <option value="Mitsubishi">Mitsubishi</option>
                                                    <option value="Nissan">Nissan</option>
                                                    <option value="Peugeot">Peugeot</option>
                                                    <option value="Renault">Renault</option>
                                                    <option value="Suzuki">Suzuki</option>
                                                    <option value="Toyota">Toyota</option>
                                                    <option value="Volkswagen">Volkswagen</option>
                                                </select>
                                            </div> 
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="modelo">Modelo</label>
                                                <input name="modelo" id="modelo" class="form-control" placeholder="Modelo" value="">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="ano">Ano</label>
                                                <input name="ano" id="ano" class="form-control" placeholder="Ano" value="">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="cor">Cor</label>
                                                <input name="cor" id="cor" class="form-control" placeholder="Cor" value="">
                                            </div>
                                            <div class="form-group col-xs-2 col-md-2 col-lg-2">
                                                <label for="cor">Unidade</label>
                                                <input name="unidade" id="unidade" class="form-control" placeholder="Unidade" value="">
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

            <!-- Morris Charts JavaScript -->
            <script src="../vendor/raphael/raphael.min.js"></script>
            <script src="../vendor/morrisjs/morris.min.js"></script>
            <script src="../data/morris-data.js"></script>

            <!-- Custom Theme JavaScript -->
            <script src="../dist/js/sb-admin-2.js"></script>

    </body>

</html>
