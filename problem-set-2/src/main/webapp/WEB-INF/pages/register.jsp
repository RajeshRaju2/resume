<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Application for XYZ</title>
</head>

<body>
	
	<fieldset>
	
	<form action="addapplicant" method="get">
		<div class="form-row">

			<div class="form-group">
				<label for="lblfname">Name*</label> 
				<input type="text" class="form-control" id="lblfname" name="name"
					placeholder="Enter Name">
			</div>
			
			</div>
			
			<div class="form-group">
				<label for="lblemail">Email</label> 
				<input type="email" class="form-control" id="lblemail" name="email"
					placeholder="Enter Email">
			</div>
			<div class="form-group">
				<label for="lblpass">Qualification*</label> 
				<input type="text" class="form-control" id="lblpass" name="qualification">
			</div>
			<div class="form-group">
				<label for="lblpass">Experience*</label> 
				<input type="text" class="form-control" id="lblpass" name="experience">
			</div>
			
			<div class="form-group">
			
				<label for="lblpass">Resume*</label> 
				<button type="submit" class="btn btn-primary">Browse</button>
			</div>
		<button type="submit" class="btn btn-primary">Apply</button>
	
	</form>

	</fieldset>
	<p>Note :- '*' means the field is must</p> 
	
</body>
</html>