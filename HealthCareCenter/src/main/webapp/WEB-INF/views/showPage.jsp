<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<style>
#message { color:red; text-align:center; margin-bottom:15px; }
body { background-color:lavender; }
table { margin: 0 auto; }
</style>
</head>
<body>

<a href="/showPage?language=en">English</a> | <a href="/showPage?language=fr">French</a>

<h1 style="text-align:center;">Health Care Center</h1>

<form:form modelAttribute="appointment" method="post" action="/consultation">
<table>
     <tr>
        <td><spring:message code="label.patientName"/></td>
        <td><form:input path="patientName" id="patientName"/></td>
    </tr>
    <tr>
        <td><spring:message code="label.age"/></td>
        <td><form:input path="age" id="age"/></td>
    </tr>
    <tr>
        <td><spring:message code="label.phoneNumber"/></td>
        <td><form:input path="phoneNumber" id="phoneNumber"/></td>
    </tr>
    <tr>
        <td><spring:message code="label.consultationFor"/></td>
        <td>
            <form:select path="consultationFor" id="consultationFor">
                <form:options items="${consultationList}"/>
            </form:select>
        </td>
    </tr>
    <tr>
        <td colspan="2" style="text-align:center;">
            <input type="submit" value="Book Appointment" name="submit" id="submit"/>
        </td>
    </tr>
    <tr>
        <td colspan="2"><div id="message">${message}</div></td>
    </tr>
</table>
</form:form>

</body>
</html>
