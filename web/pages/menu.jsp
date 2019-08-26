<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
        </button>
        <a class="navbar-brand" href="index.jsp"><i class="fa fa-building fa-fw"></i> Meu Condomínio</a>
    </div>
    <!-- /.navbar-header -->
    <ul class="nav navbar-top-links navbar-right">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                </li>
                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                </li>
                <li class="divider"></li>
                <li><a href="../index.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                    <%HttpSession session2 = request.getSession(false);
                    if(session2 != null)session2.invalidate();
                    %>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li>
                    <a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-building-o fa-fw"></i> Administração<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="usuarios.jsp"><i class="fa fa-user-plus fa-fw"></i> Usuários</a>
                        </li>
                        <li>
                            <a href="funcionarios.jsp"><i class="fa fa-user-plus fa-fw"></i> Funcionários</a>
                        </li>
                        <li>
                            <a href="unidades.jsp"><i class="fa fa-building fa-fw"></i> Unidades</a>
                        </li>
                        <li>
                            <a href="moradores.jsp"><i class="fa fa-users fa-fw"></i> Moradores</a>
                        </li>
                        <li>
                            <a href="financeiro.jsp"><i class="fa fa-money fa-fw"></i> Financeiro</a>
                        </li>
                        <li>
                            <a href="veiculos.jsp"><i class="fa fa-car fa-fw"></i> Veículos</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-paw fa-fw"></i> Animais</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-warning fa-fw"></i> Infrações</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-shield fa-fw"></i> Portaria<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="visitas.jsp"><i class="fa fa-sign-in fa-fw"></i> Visitas</a>
                        </li>
                        <li>
                            <a href="encomendas.jsp"><i class="fa fa-truck fa-fw"></i> Encomendas</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o fa-users"></i> Moradores<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#"><i class="fa fa-calendar fa-fw"></i> Reservas de espaços</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-comments fa-fw"></i> Eventos</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-file-text-o fa-fw"></i> Comunicados</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>

