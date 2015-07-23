<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="POST" action="/SpringMVCtrail/submittedForm" modelAttribute="mynews">
<form:input path="mainStory" placeholder="enter mainStory"/>
<br>
<form:input path="headLines" placeholder="enter headLines"/>
<br>
<form:input path="newsType" placeholder="enter newsType"/>
<br>
<button type="submit">Submit</button>
</form:form>

</body>
</html>