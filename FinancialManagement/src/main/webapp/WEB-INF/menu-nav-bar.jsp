<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<!-- Sidebar user panel (optional) -->
<div class="user-panel">
	<div class="pull-left image">
		<img src="../dist/img/user2-160x160.jpg" class="img-circle"
			alt="User Image">
	</div>
	<div class="pull-left info">
		<p>Alexander Pierce</p>
		<!-- Status -->
		<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
	</div>
</div>

<!-- search form (Optional) -->
<form action="#" method="get" class="sidebar-form">
	<div class="input-group">
		<input type="text" name="q" class="form-control"
			placeholder="Search..."> <span class="input-group-btn">
			<button type="submit" name="search" id="search-btn"
				class="btn btn-flat">
				<i class="fa fa-search"></i>
			</button>
		</span>
	</div>
</form>
<!-- /.search form -->

<!-- Sidebar Menu -->
<ul class="sidebar-menu">
	<li class="header">HEADER</li>
	<!-- Optionally, you can add icons to the links -->
	<li class="treeview"><a href="#"><i class="fa fa-link"></i> <span><s:message
					code="nav.inputs" /></span> <i class="fa fa-angle-left pull-right"></i></a>
		<ul class="treeview-menu">
			<li><a href="#"><s:message code="nav.add.inputs" /></a></li>
			<li><a href="#"><s:message code="nav.management.inputs" /></a></li>
		</ul></li>
	<li class="treeview"><a href="#"><i class="fa fa-link"></i> <span><s:message
					code="nav.expenses" /></span> <i class="fa fa-angle-left pull-right"></i></a>
		<ul class="treeview-menu">
			<li><a href="#"><s:message code="nav.add.expenses" /></a></li>
			<li><a href="#"><s:message code="nav.management.expenses" /></a></li>
		</ul></li>
	<li><a href="#"><i class="fa fa-link"></i><span><s:message
					code="nav.reporter" /></span></a></li>
</ul>
<!-- /.sidebar-menu -->
