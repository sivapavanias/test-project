<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./Servlet1">
<table>
<tr>
<td>Username :</td><td><input type="text" name="uname"/></td>
</tr>

<tr>
<td>password :</td><td><input type="text" name="pwd"/></td>
</tr>

<tr>
<td><input type="submit" value="login"></td><td><input type="reset"/></td>
</tr>

<tr>
<td></td><td>click here to <a href="register.jsp">register</a></td>
</tr>
</table>
</form>
</body>
</html>