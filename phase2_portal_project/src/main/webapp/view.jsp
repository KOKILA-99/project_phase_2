<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
</head>
<body>
	<div align="center">
		<h2>
			<u>Welcome to View Page</u>
		</h2>
		<form action="search"> 
			Enter the  Class for which you want to view the class report
			<input type="text" name="value"><br />
			<br/>
			<input type="submit" value="View">
		</form>
		<br/><br/>
	<%if(request.getAttribute("error")!=null){ %>
		<span style="color:red;"><%= request.getAttribute("error")%></span>
		<%} %>
		<br/><br/>
	<a href="logoff"> Click here to log out</a>
	</div>	
</body>
</html>