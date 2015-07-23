<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>

</head>
<body>
<nav class="navbar navbar-default">
    <div class="container">
       <div class="navbar-header">
       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    
<a class="navbar-brand" href="/SpringSecurity">Brand</a>
  
  
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    
        <ul class="nav nav-nav">    
      <li><a href="/springSecurity2">Home</a></li>
      
    <security:authorize ifNotGranted="ROLE_ANONYMOUS">
    <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
    <li><a href="/springSecurity2/reports">reports</a></li>
    </security:authorize>
    
    <security:authorize ifAnyGranted="ROLE_DASHBOARD,ROLE_ADMIN">
    <li><a href="/springSecurity2/dashboard">dashboard</a></li>
    </security:authorize>
    
    <security:authorize ifAnyGranted="ROLE_ADMIN">
    <li><a href="/springSecurity2/admin">admin</a></li>
    </security:authorize>
    </security:authorize>
    </ul>
    
    <ul class="nav navbar-nav navbar-right">
    
    <security:authorize ifAnyGranted="ROLE_ANONYMOUS">
    <li><a href="/springSecurity2/login">login</a></li>
    </security:authorize>
    
    
    <security:authorize ifNotGranted="ROLE_ANONYMOUS">
    <li><a href="#">welcome<security:authentication property="principal.userName"/></a></li>
    <li><a href="/springSecurity2/logout">logout</a>
    </security:authorize>
    
    </ul>
    </div>
    </div>
    
 </nav>
<div class="jumbotron">
<h1>Home</h1>
</div>
</body>
</html>