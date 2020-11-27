<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div align="center">
<h3><u> Login </u></h3>
<form action="login" method="post">
<table border="1px">
<tr>
<td><input type="text" name="username" placeholder="Enter UserName"></td>
</tr>
<tr>
<td><input type="password" name="password" placeholder="Enter Password"></td>
</tr>
<tr>
<td><center><input type="submit" value="Login"></td></center>
</tr>
</table>

</form>
<%if(request.getAttribute("error")!=null) {%>
<center><span style='color:red;'><%=request.getAttribute("error") %></span></center>
<%} %>
</div>
</body>
</html>