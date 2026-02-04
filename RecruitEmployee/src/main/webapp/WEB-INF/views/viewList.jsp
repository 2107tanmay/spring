<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body bgcolor="lavender">
<h1><center>Candidate List</center></h1>
<!--  Fill the code -->
<table border="1" align="center">
<tr>
<th>Name</th>
<th>Contact</th>
<th>Gender</th>
<th>Position</th>
<th>Salary</th>
<th>Experience</th>
</tr>

<c:forEach var="c" items="${candidates}">
<tr>
<td>${c.candidateName}</td>
<td>${c.contactNumber}</td>
<td>${c.gender}</td>
<td>${c.positionApplied}</td>
<td>${c.expectedSalary}</td>
<td>${c.yearsOfExperience}</td>
</tr>
</c:forEach>
</table>
<center>	<a href="home">Back to Home</a>	</center>
</body>
</html>	 	  	  		    	   	 	   	 	
