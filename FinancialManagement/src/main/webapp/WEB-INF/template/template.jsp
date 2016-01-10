<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>FinancialManagement</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="../css/bootstrap/bootstrap-3.3.5.css">
    <link rel="stylesheet" href="../css/template/AdminLTE.min.css">
    <link rel="stylesheet" href="../css/template/skins/skin-blue.min.css">
  </head>
  <!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |
  |               | sidebar-mini                            |
  |---------------------------------------------------------|
  -->
  <body class="hold-transition skin-blue sidebar-mini">
    <div class="wrapper">
	  <!-- Main Header -->
      <header class="main-header">
			<tiles:insertAttribute name="header"/>
      </header>
      
      <aside class="main-sidebar">
        <section class="sidebar">
			<tiles:insertAttribute name="menu-left"/>
        </section>
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Page Header
            <small>Optional description</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
            <li class="active">Here</li>
          </ol>
        </section>

        <section class="content">
			<tiles:insertAttribute name="body"/>
		</section><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <footer class="main-footer">
         <tiles:insertAttribute name="footer"/>
      </footer>

      <aside class="control-sidebar control-sidebar-dark">
       		<tiles:insertAttribute name="menu-right"/>
       </aside>
      <div class="control-sidebar-bg"></div>
    </div>

    <!-- REQUIRED JS SCRIPTS -->
    <script src="../js/jquery/jquery-2.1.4.js"></script>
    <script src="../js/bootstrap/bootstrap-3.3.5.js"></script>
    <script src="../js/template/app.min.js"></script>
  </body>
</html>
