<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cardetails</title>
</head>
<body>
<form:form method="POST" action="/Raj/cardetails" modelAttribute="car" >

<form:input type="text" path="carname"/>
<form:input type="text" path="model"/>
<form:input type="text" path="make"/>
<button type="submit">submit</button>

</form:form>
</body>
</html>