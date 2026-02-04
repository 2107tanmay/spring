<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>

<head>
<style>
* {
  box-sizing: border-box;
}

.row {
  margin-left:-5px;
  margin-right:-5px;
}
  
.column {
  float: left;
  width: 60%;
  padding: 3px;
}
.column1 {
  float: left;
  width: 25%;
  padding: 3px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
}

table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;

}

th, td {
  text-align: left;
  padding: 5px;
}

#message{
color:red;
}
</style>
</head>


<body style="background-color:lavender">
<h1><center>Register Candidate</center></h1>

<a href="home">Home</a><br>
<a href="viewAllCandidateList">View All Candidates</a>

<br><br>

<form:form modelAttribute="candidate" action="register" method="post">

<table align="center">

<tr>
<td>Candidate Name</td>
<td>
<form:input path="candidateName" id="candidateName"/>
</td>
<td>
<form:errors path="candidateName" cssClass="error"/>
</td>
</tr>

<tr>
<td>Contact Number</td>
<td>
<form:input path="contactNumber" id="contactNumber"/>
</td>
<td>
<form:errors path="contactNumber" cssClass="error"/>
</td>
</tr>

<tr>
<td>Gender</td>
<td>
<form:radiobutton path="gender" value="M" id="male"/>Male
<form:radiobutton path="gender" value="F" id="female"/>Female
</td>
</tr>

<tr>
<td>Position Applied</td>
<td>
<form:select path="positionApplied" id="positionApplied" items="${positionDtls}"/>
</td>
</tr>

<tr>
<td>Expected Salary</td>
<td>
<form:input path="expectedSalary" id="expectedSalary"/>
</td>
<td>
<form:errors path="expectedSalary" cssClass="error"/>
</td>
</tr>

<tr>
<td>Years of Experience</td>
<td>
<form:input path="yearsOfExperience" id="yearsOfExperience"/>
</td>
<td>
<form:errors path="yearsOfExperience" cssClass="error"/>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" id="submit" value="Register"/>
</td>
</tr>

</table>

</form:form>


</body>
</html>	 	  	    	    	     	      	 	
