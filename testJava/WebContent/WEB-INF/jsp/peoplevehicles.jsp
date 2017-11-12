<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css" type="text/css" media="screen" /> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add a vehicle to people</title>
<script type="text/javascript">
/* $(function(){
	if ($("#hidVehicleId").val()!="0"){
		$("#cmbVehicle").attr('disabled','disabled');
		$("#cmbVehicle").addClass("disabled");
	}
}); */
</script>
</head>
<body>
<div class="container">
  <div class="panel panel-default" id="pnlPeople">
  	 <form:form role="form" class="form-horizontal" method="POST" action="addPeopleVehicles.do" modelAttribute="people">	
  	  <div class="panel-heading">${ name }</div>
	  <div class="panel-body">
	 	<form:hidden path="id" />
	  	<form:select class="form-control" path="vehicleId"  items="${cmbVehicles}" />
    	<div class="form-group">
    	 <div class="panel-footer text-center">
		  		<button type="submit" name = "submit" value="InsertPeopleVehicle" class="btn btn-success"><span class="glyphicon glyphicon-floppy-save"></span>&nbsp;Insert</button>
		  		<button type="submit" name = "submit" value="Cancel" class="btn btn-default" style="margin-left: 20px;"><span class="glyphicon glyphicon-remove"></span>&nbsp;Cancel</button>
	  		</div>	
	  	</div>
    	
	  </div>
	  </form:form>
	</div>
	
</div>
</body>
</html>