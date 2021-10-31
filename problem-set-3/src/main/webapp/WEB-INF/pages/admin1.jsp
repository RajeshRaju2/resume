<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>ADMIN</h1>
	<form action="search" method="get">
		<div class="form-row">

			<div class="form-group">
				<label for="lbleid">APPLICATION ID </label> 
				<input type="text" class="form-control" id="lbleid" name="eid" value="${param.applicationId}">
					
			</div>
					<button type="submit" value="search" class="btn btn-primary">Search</button>
			
			</div>
			</form>
	<form action="sortEmp" method="post">
		<div class="form-row">

			
					<button type="submit" value="sortEmp" class="btn btn-primary">Sort</button>
			
			</div>
			</form>
	<table class="table">
  <thead class="thead-light">
    <tr>      
      <th scope="col">APPLICATIONID</th>
      <th scope="col">NAME</th>
      <th scope="col">EMAIL</th>
      <th scope="col">QUALIFICATION</th>
      <th scope="col">EXPERIENCE</th>
      <th scope="col">statusOfApplication</th>
      <th colspan="1">ACTION</th>
    </tr>
  </thead>
    <c:forEach var="app" items="${applist}">
  <tr>
  	<td> ${app.applicationId}</td>
      	<td>${app.name}</td>
      	<td>${app.email}</td>
      	<td>${app.qualification}</td>
      	<td>${app.experience}</td>
      	<td>${app.statusOfApplication}</td>
       	<td><a href="edit?applicationId=${app.applicationId}&name=${app.name}&email=${app.email}&qualification=${app.qualification}
       	&experience=${app.experience}&statusOfApplication=${app.statusOfApplication}">Edit</a></td>
      	
  </tr>
  </table>
</body>
</html>