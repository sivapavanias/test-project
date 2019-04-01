<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Rgistration page</title>
</head>
<body>

<form action="./Registration" method ="post"><br>
username     : <input type="text" name="uname"><br><br>
<%=request.getParameter("st")%>
email        : <input type="text" name="email"><br><br>
password     : <input type="password" name="pwd"><br><br>
mobilenumber : <input type="text" name="mno"><br><br>
Address      : <input type="text" name="add"><br><br>
<button type="submit">Register</button></form>

</form>
</body>
</html>