<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<h1><center> Welcome to Online Help Services </center></h1>
<form:form method="post" action="register" modelAttribute="register">
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
	

<tr>
    <td>User Name</td>
    <td>
        <form:input path="userName" id="userName"/>
    </td>
</tr>

<tr>
    <td>Contact Number</td>
    <td>
        <form:input path="contactNumber" id="contactNumber"/>
    </td>
</tr>

<tr>
    <td>Email ID</td>
    <td>
        <form:input path="emailId" id="emailId"/>
    </td>
</tr>

<tr>
    <td>Confirm Email ID</td>
    <td>
        <form:input path="confirmEmailId" id="confirmEmailId"/>
    </td>
</tr>

<tr>
    <td></td>
    <td>
        <form:checkbox path="status" id="status"/> I agree
    </td>
</tr>

<tr>
    <td colspan="2" align="center">
        <input type="submit" name="submit" value="Register"/>
    </td>
</tr>



</table>
</form:form>


</body>
</html>