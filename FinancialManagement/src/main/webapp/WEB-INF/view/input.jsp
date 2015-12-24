<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<link rel="stylesheet" type="text/css" href="../css/jquery/jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap/bootstrap-3.3.5.css" />
	<link rel="stylesheet" type="text/css" href="../css/bootstrap/bootstrap-theme-3.3.5.css" />
	
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><s:message code="lbl.save.input"/></title>
</head>
<body>
	<div class="container-fluid">
			<div class="col-md-2">
				<ul class="nav nav-pills nav-stacked">
					<li role="presentation" class="active"><a href="#"><s:message code="nav.inputs"/></a></li>
				</ul>
			</div>
			<div class="col-md-10">
				<sf:form id="formInput" method="post" modelAttribute="input" cssClass="form-horizontal">
					<h3><s:message code="lbl.add.input"/></h3>
					<div class="form-group">
						<div class="col-md-4">
							<label><s:message code="lbl.type.input"/>:</label>
							<sf:select path="inputType" cssClass="form-control col-md-4">
								<sf:options items="${inputTypes}" itemLabel="name" />
							</sf:select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-4">
							<label><s:message code="lbl.value" /></label>
							<input id="value" name="value" type="text" class="form-control col-md-4"/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-4">
							<label><s:message code="lbl.date.input" /></label>
<%-- 							<fmt:formatDate value="${input.date}" pattern="dd/mm/yyyy" var="dataFormated" /> --%>
							<input id="date" title="Data" name="date" value="${input.date}" class="form-control"/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-4">
							<div class="checkbox">
								<label>
									<sf:checkbox id="reply" path="reply" title="Replicar" cssClass="form-control"/>
									<s:message code="lbl.reply" />
								</label>
							</div>
						</div>
						<div class="col-md-4">
						    <label><s:message code="lbl.number.months" /></label>
							<input id="numberOfTimes" type="number" max="48"  value="${input.numberOfTimes}" title="<s:message code="lbl.number.months" />" class="form-control" disabled="disabled" />
							<sf:errors path="numberOfTimes" cssStyle="color:red;" />
						</div>
					</div>
					<div class="form-group">
					    <div class="col-md-4">
						    <label for="description"><s:message code="lbl.description"/></label>
							<textarea id="description" rows="4" cols="4" class="form-control" name="description"></textarea>
							<sf:errors path="description" cssStyle="color:red;" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-4">
							<input type="submit" value="Adicionar" class="btn btn-success">
						</div>
					</div>
				</sf:form>
			</div>
		</div>
</body>
<script type="text/javascript" src="../js/jquery/jquery-2.1.4.js"></script>
<script type="text/javascript" src="../js/jquery/jquery-ui.js"></script>
<script type="text/javascript" src="../js/jquery/plugin/maskMoney.js"></script>
<script type="text/javascript" src="../js/bootstrap/bootstrap-3.3.5.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#date').datepicker({
			dateFormat : 'dd/mm/yy'
		});
		$('#value').maskMoney({showSymbol:false, decimal:",", thousands:"."});
	});
	$('#reply').bind("change", function(){
		var isChecked = $(this).is(':checked');
		$('#numberOfTimes').attr('disabled', !isChecked);
	});
	$('#formInput').submit(function(){
		var money = $('#value').val();
		$('#value').val(money.replace('.', "").replace(",","."));
	});
</script>
</html>