<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="check" method="get">
	<div class="form-group">
				<label for="lblemail">Admin Id</label> 
				<input type="text" class="form-control" id="lblemail" name="id"
					placeholder="Enter Admin Id">
			</div>
			<div class="form-group">
				<label for="lblpass">Password</label> 
				<input type="password" class="form-control" id="lblpass" name="password"
					placeholder="Enter PassWord">
			</div>
			<button type="submit" class="btn btn-primary">Sign-in</button>
			</form>
</body>
</html>