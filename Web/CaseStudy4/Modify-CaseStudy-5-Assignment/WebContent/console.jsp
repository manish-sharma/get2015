<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Dekho</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-switch.min.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-switch.min.js"></script>
<script>
	$(document).ready(function() {$(".switch").bootstrapSwitch()
	});
</script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a href="Home" class="navbar-brand">myFirstCar</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span> 
      			</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="Home">Home</a></li>
					<li><a href="#">Account Settings</a></li>
					<li><a href="#">Create User</a></li>
					<li><a href="#">Contact Us</a></li>
					<li>
						<a href="#" data-toggle="dropdown" role="button" class="dropdown-toggle">Search Vehicle</a>
						<ul class="dropdown-menu">
							<li><input type="text" placeholder="Search By Modal" class="form-control" name="modal"></li>
						</ul>
					</li>
				</ul>
				
				<ul class="nav navbar-nav navbar-right right">
					<li><a href="#" data-toggle="modal" data-target="#createvehicle"><span	class="glyphicon glyphicon-plus"></span> Create Vehicle</a></li>
					<li><a href="Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<div id="createvehicle" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" data-dismiss="modal" class="close">&times;</button>
					<h4 class="modal-title">Create / Edit</h4>
				</div>
				<form action="InsertVehicle"  method="post" class="form">
					<div class="modal-body">
						<div class="form-group">
							<label for="make" class="control-label">Enter Make</label>
							<input type="text" name="make" class="form-control" placeholder ="Making Year" id="make" required>
						</div>
						<div class="form-group">
							<label for="modal" class="control-label">Modal Name</label>
							<input type="text" name="model" class="form-control"  placeholder ="Modal Name" id="modal" required>
						</div>
						<div class="form-group">
							<label class="control-label" for="milage">Milage</label>
							<input type="number" name="milage" class="form-control"  step="Any" placeholder ="Enter Milage" id="milage" required>
						</div>
						<div class="row">
							<div class="form-group col-lg-6 col-md-6 col-sm-6">
								<label for="enginecapacity" class="control-label">Engine Capacity (C.C.)</label>
								<input type="number" step="any" class="form-control"  name="engineInCC" placeholder ="Engine Capacity" class="enginecapacity" required>
							</div>
							<div class="form-group col-lg-6 col-md-6 col-sm-6">
								<label for="fuelcapacity" class="control-label">Fuel Capacity</label>
								<input type="number" step="any"  class="form-control" id="fuelcapacity" name="fuelCapacity" placeholder ="Enter Fuel Capacity" required>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-lg-6 col-md-6 col-sm-6">
								<label class="control-label" for="price">Price</label>
								<input type="number" name="price" class="form-control"  placeholder ="Price" id="price" required>
							</div>
							<div class="form-group col-lg-6 col-md-6 col-sm-6">
								<label class="control-label" for="roadtax">Road Tax</label>
								<input type="number" name="roadTax"  class="form-control" placeholder ="Road Tax" id="roadtax" required>
							</div>
						</div>
						<div class="row">
							<div class="form-group">
								<label class="control-label col-lg-offset-1">AC</label>
								<input type="checkbox" class="switch" name="hasAC"data-on-text="Yes" data-off-text="No" checked>
								<label class="control-label col-lg-offset-1">Steering</label>
								<input type="checkbox" class="switch" name="powerSteering" data-on-text="Power" data-off-text="Normal" checked>
								<label class="control-label col-lg-offset-4">accessory kit</label>
								<input type="checkbox" class="switch" name="hasaccessoryKit" data-on-text="Yes" data-off-text="No" checked>
							</div>
						</div>
						<div class="form-group col-lg-offset-3 col-md-offset-3 col-sm-offset-3">						
							<button type="submit" class="btn btn-success">
								Submit Data <span class=" glyphicon glyphicon-ok"></span>
							</button>
							<button type="reset" class="btn btn-warning">
								Reset Form <span class=" glyphicon glyphicon-refresh"></span>
							</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
