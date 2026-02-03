<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
<center>
<h1>ZEE-ZEE Web Portal</h1>
<form action="submitlogin" method="post">

    UserName:
    <input type="text" name="userName" id="userName" />
    <br><br>

    Password:
    <input type="password" name="password" id="password" />
    <br><br>

    <input type="submit" name="submit" value="Login" />

</form>

</center>















</body>
</html>