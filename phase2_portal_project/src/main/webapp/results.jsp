<%@page import="com.student.model.Student"%>
<%@page import="com.student.model.Subject" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="tvs" uri="WEB-INF/studentsTags.tld" %>
     <%@taglib prefix="tvs1" uri="WEB-INF/subjectTags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results Page</title>
</head>
<body>
<%
	List<Student> studentsList=(List<Student>)session.getAttribute("employeesList");
%>
<%!int c=1;%> 
<div align="center">
<h2><u> Search Results</u></h2>
<%
	for(Student student:studentsList) {
	
	out.print("<h2>Class ="+student.getClass_Name()+"</h2>");
%>
			<%if(c==1){
			break;	
			}%>
		<% }%>
<h2>Student Details</h2>		
<tvs:results studentsList="<%=studentsList %>"/>
<br/><br/>
<% 
List<Subject> detailsList=(List<Subject>)session.getAttribute("detailsList");
%>
<h2>Subject and Teacher Details</h2>
<tvs1:results detailsList="<%=detailsList  %>"/>
<br/><br/>
<form action="view.jsp" method="post">
<center><input type="submit" value="Back"></center>
</form>
<br/><br/>
<br/><br/>	
<a href="logoff"> Click here to log out</a>
</div>
</body>
</html>