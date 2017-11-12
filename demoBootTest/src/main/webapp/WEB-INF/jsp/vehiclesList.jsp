<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vehicles List</title>
<script src="resources/js/jquery.min.js"></script>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap-theme.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="resources/bootstrap/css/grid.css" type="text/css" media="screen" /> 
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container bs-docs-header">
	<div class="row">
		<div class="col-md-10" style="border: 0px;"><h4 class="highlight">Vehicle List</h4></div>
		<div class="col-md-2" style="border: 0px;">
		<h4>
		<a href="selVehicles.do?id=0" class="btn btn-success" role="button"><span class="glyphicon glyphicon-plus"></span>&nbsp; Add Vehicle</a>		
	  		</h4>
		</div>
	</div>
	<div class="show-grid row">
		<div class="col-md-5">Vehicle</div>
	</div>
	<table>
	${vehiclesList}
	</table>
</div>
</body>
</html>