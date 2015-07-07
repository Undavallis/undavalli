<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
<link href="/BookApp/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href= "/BookApp/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/BookApp/resources/bootstrap/css/justified.css" rel="stylesheet">
<script type="text/javascript" src="/BookApp/resources/jquery/jquery.min.js" rel="stylesheet"></script>
<script type="text/javascript" src="/BookApp/resources/bootstrap/js/bootstrap.min.js" rel="stylesheet"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/BookApp/home">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="add">Add Books <span class="sr-only">(current)</span></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container">

     
  
 

<br>
<br>
<br>
<div class="col-md-8">

<div class="panel panel-primary">
  <div class="panel-heading">
    <h3 class="panel-title">Add Book</h3>
  </div>
  <div class="panel-body">
 <form:form method="POST" modelAttribute="book" action="/BookApp/add">

<div class="input-group">
  <span class="input-group-addon" id="sizing-addon2">BookId</span>
  <form:input type="text" class="form-control" path="bookId" required="true" placeholder="Enter Id" aria-describedby="sizing-addon2"/>
</div>
<br>

 
<div class="input-group">
  <span class="input-group-addon" id="sizing-addon2">Book Name</span>
  <form:input type="text" class="form-control" path="bookName" required="true" placeholder="Enter BookName" aria-describedby="sizing-addon2"/>
</div>
<br>
<div class="input-group">
  <span class="input-group-addon" id="sizing-addon2">Image URL</span>
  <form:input type="text" class="form-control" path="imageUrl" placeholder="Enter image url" aria-describedby="sizing-addon2"/>
</div>
<br>

<div class="input-group">
  <span class="input-group-addon" id="sizing-addon2">Book Type</span>
<form:select class="form-control" path="bookType" id="bookType">


<c:forEach items="${bookType}" var="type">
    <option value="${type}">${type}</option>
   </c:forEach>
  </form:select>
</div>
<br>
<div class="form-group">
  <label for="comment">BookDescription</label>
  <form:textarea class="form-control" rows="5" path="bookDescription" required="true" id="comment"></form:textarea>
</div>
<br>
<button type="submit" class="btn btn-danger pull-right">Add Book</button>
</form:form>
<br>


</body>
</html>