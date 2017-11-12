<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>People</title>
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css" media="screen" /> 
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css" type="text/css" media="screen" /> 
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<script type="text/javascript">
$(function(){
	if ($("#hidId").val()=="0"){
		$("#btnAddCar").attr('disabled','disabled');
		$("#btnAddCar").addClass("disabled");
	}
});
</script>
<div class="container">
  <div class="panel panel-default" id="pnlPeople">
  	  <div class="panel-heading">People</div>
	  <div class="panel-body">
	    <form:form role="form" id="form1" class="form-horizontal" method="POST" action="people.do" modelAttribute="people">
	    	<div class="form-group">
	    			<form:input type="hidden" id="hidId" path="id" />
	    			<label class="col-md-2 control-label" for="txtNamePeople">Name:</label>
	    		<div class="col-md-4">
    				<form:input type="text" class="form-control " id="txtNamePeople" path="name" />
	    		</div>  			
  			</div>
  			<div class="form-group">
  			 <div class="panel-footer text-center">
		  		<button type="submit" name = "submit" value="Update" class="btn btn-success"><span class="glyphicon glyphicon-floppy-save"></span>&nbsp;Update</button>
		  		<a href="peopleList.do" class="btn btn-default" role="button"><span class="glyphicon glyphicon-remove"></span>&nbsp; Cancel</a>
		  		<button type="submit" name = "submit" value="Delete" class="btn btn-danger" style="margin-left: 20px;"><span class="glyphicon glyphicon-trash"></span>&nbsp;Delete</button>
	  		</div>	
	  		</div>		
	  		<table class="table table table-striped table-bordered">
  			<thead><tr>
  				<th>
  				<div class="row">
  					<div class="col-md-10"><strong>Vehicles</strong></div>
  				</div></th>
  				<th><div class="col-md-2">
  						<button class="btn btn-success" id="btnAddCar" name = "submit" value="AddCarSel" type="submit">
  						<span class="glyphicon glyphicon-plus"></span>&nbsp; Add Car
  				</button>
  					</div></th>
  			</tr>
  			</thead>
  			<tbody>
  			${vehiclesList}
  			</tbody>
  			</table>   
	    </form:form>
	  </div>
  </div>
  </div>
</body>
</html>