<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<marquee>Welcome to Dxc.Technology</marquee><br><hr>
<%=request.getParameter("st")%>
<form action="./HttpServletEx" method ="post"><br>
username:<input type="text" name="uname"><br><br>
password:<input type="password" name="pwd"><br><br>
<button type="submit">Login</button></form><br>
<form action="Registration.html"><button type="submit">Register</button></a>
</form>
</body>
</html>
