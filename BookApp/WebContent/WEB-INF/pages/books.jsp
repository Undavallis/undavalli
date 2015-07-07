<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Book Page</title>
<link href="/BookApp/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/BookApp/resources/bootstrap/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css">
<link href="/BookApp/resources/bootstrap/css/carousel.css" rel="stylesheet"/>
<script type="text/javascript" src="/BookApp/resources/jquery/jquery.min.js"></script>
<script type="text/javascript" src="/BookApp/resources/bootstrap/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
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
      <a class="navbar-brand" href="home">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="add">Add Book <span class="sr-only">(current)</span></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container">
<div class="row">

<div class="col-md-8">

<div class="row">
<div class="panel panel-default">
  <div class="panel-body">
   <h1> 
   <p class = "text-center"> ${books.bookName}</p></h1>
  </div>
</div>
</div>

<div class="row">
<div class="panel panel-default">
  <div class="panel-body" >
 
<img src="${books.imageUrl}" width="500" class="img-responsive center-block" />

  </div>
</div>
</div>
<div class="row">

<div class="panel panel-default">
  <div class="panel-body">
    ${books.bookDescription}
  </div>
</div></div>

</div>
<br>
<div class="col-md-2">
<c:forEach items="${recommendedbooks}" var="n">
      <div class="thumbnail">
      <img src="${n.imageUrl}"  class = "img-circle" alt="Cinque Terre" width = "304" height = "236">
      <div class="caption">
        <h3><a href="/BookApp/books?id=${n.bookId}">${n.bookName}</a></h3>
      </div>
      </div>
   </c:forEach>


</div>
</div>
</div>
</body>
</html>