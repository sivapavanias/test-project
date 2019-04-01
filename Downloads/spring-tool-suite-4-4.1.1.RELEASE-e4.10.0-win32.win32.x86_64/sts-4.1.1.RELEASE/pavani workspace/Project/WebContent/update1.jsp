<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Dxc.Technology</title>
</head>
<body>
<marquee>Welcome to Dxc.Technology <%=request.getParameter("u")%></marquee>
<table>
<form action="./Update" method ="post"><br>
<tr><td>Enter Current email : </td><td> <input type="text" name="email"></td></tr>
<tr><td>New username     : </td><td> <input type="text" name="uname"></td></tr>
<tr><td>New password     : </td><td> <input type="password" name="pwd"></td></tr>
<tr><td>New mobilenumber :  </td><td><input type="text" name="mno"></td></tr>
<tr><td>New Address      : </td><td> <input type="text" name="add"></td></tr>
<tr><td><button type="submit">Update</button></form></td></tr>
<tr><td><form action="Home.jsp" method ="post">
<button type="submit">Back</button></form></td></tr>
</table>
</body>
</html>
