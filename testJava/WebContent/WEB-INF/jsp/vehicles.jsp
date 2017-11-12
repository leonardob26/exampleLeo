<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css" type="text/css" media="screen" /> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Vehicles</title>
</head>
<body>
<div class="container">
  <div class="panel panel-default" id="pnlVehicles">
  	  <div class="panel-heading">Vehicles</div>
	  <div class="panel-body">
	    <form:form role="form" class="form-horizontal" method="POST" action="vehicles.do" modelAttribute="vehicles" >
	    	<div class="form-group">
	    			<form:input type="hidden" id="hidId" path="id" />
	    			<label class="col-md-2 control-label" for="txtNameVehicles">Name:</label>
	    		<div class="col-md-4">
    				<form:input path="name" type="text" class="form-control " id="txtNameVehicles"  />
	    		</div>  			
  			</div>
  			<div class="form-group">
  			 <div class="panel-footer text-center">
		  		<button type="submit" name = "submit" value="Update" class="btn btn-success"><span class="glyphicon glyphicon-floppy-save"></span>&nbsp;Update</button>
		  		<a href="vehiclesList.do" class="btn btn-default" role="button"><span class="glyphicon glyphicon-remove"></span>&nbsp; Cancel</a>
		  		<button type="submit" name = "submit" value="Delete" class="btn btn-danger" style="margin-left: 20px;"><span class="glyphicon glyphicon-trash"></span>&nbsp;Delete</button>
	  		</div>	
	  		</div>		
	    </form:form>
	  </div>
  </div>
  </div>
</body>
</html>