<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>
</head>
<body>
<form:form method="POST" action="/Prudhvi/form" modelAttribute="student">
<form:input type="text" path="firstName" />

<form:input type="text" path="lastName" />

<form:input type="text" path="universityName" />

<form:input type="text" path="id" hidden="true"  />

<button type="submit">submit</button>
</form:form>

</body>
</html>