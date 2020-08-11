<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
double a = Math.random();
double b = Math.random();
int num1 = (int) Math.floor(a*100);
int num2 = (int) Math.floor(b*100);
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adder File</title>
</head>
<body>
	<form action="./adder.htm" method="GET">
		<input type="number" name="num1" value=<%=num1 %> placeholder="First Number" readonly="readonly">
		
		<input type="number" name="num2" value=<%=num2 %> placeholder="Second Number" readonly="readonly">
		<input type="number" name="added" placeholder="Result here">
		<input type="submit" 
		value="ADD">	
	</form>
</body>
</html>