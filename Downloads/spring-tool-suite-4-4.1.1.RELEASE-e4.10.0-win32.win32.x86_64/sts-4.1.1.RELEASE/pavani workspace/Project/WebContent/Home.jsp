<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome  <%=request.getParameter("u")%></title>
</head>
<body>
<center>Welcome To Dxc.Technology <%=request.getParameter("u")%></center><hr>
<form action="update1.jsp?u=<%=request.getParameter("u")%>" method ="post">
<button type="submit">Update</button></form><br>
<form action="index.html" method ="post">
<button type="submit">Logout</button></form>
</body>
</html>