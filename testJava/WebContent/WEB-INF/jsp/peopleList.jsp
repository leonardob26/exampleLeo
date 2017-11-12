<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="bootstrap/css/grid.css" type="text/css" media="screen" /> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>People List</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-10" style="border: 0px;"><h4 class="highlight">People List</h4></div>
		<div class="col-md-2" style="border: 0px;">
		<h4>
		<a href="selPeople.do?id=0" class="btn btn-success" role="button"><span class="glyphicon glyphicon-plus"></span>&nbsp; Add People</a>
			
	  		</h4>
		</div>
	</div>
	<div class="show-grid row">
		<div class="col-md-3">People</div>
		<div class="col-md-9">Vehicle</div>
	</div>

	${peopleList}

</div>


</body>
</html>