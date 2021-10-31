<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addMail" method="get">
		<div class="form-group">
				<label for="lblemail">Enter Mail</label> 
				<input type="text" class="form-control" id="lblemail" name="mail"
					placeholder="Mail to be sent">
			</div>
		<button type="submit" class="btn btn-primary">Send</button>
	</form>
</body>
</html>