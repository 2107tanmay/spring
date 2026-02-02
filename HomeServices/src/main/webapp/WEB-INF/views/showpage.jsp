<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Online Help Services</title>
</head>
<body style="background-color:lavender">
    <h1><center>Welcome to Online Help Services</center></h1>
    
    <form:form action="helpdesk" method="post" modelAttribute="helper">
        <label>Service Type</label>
        <form:select path="serviceType" name="serviceType" id="serviceType">
            <form:options items="${serviceList}" />
        </form:select>
        
        <br><br>
        
        <label>No Of Hours</label>
        <form:input path="noOfHours" name="noOfHours" id="noOfHours" />
        
        <br><br>
        
        <input type="submit" name="submit" value="TotalCost" />
    </form:form>
</body>
</html>