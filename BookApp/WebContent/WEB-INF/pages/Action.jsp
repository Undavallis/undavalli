<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Action</title>
<link href="/BookApp/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href= "/BookApp/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/BookApp/resources/bootstrap/css/justified.css" rel="stylesheet">
<link href ="BookApp/resources/bootstrap/css/carousel.css" rel = "stylesheet">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
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
        <li><a href="/BookApp/add">Add Book <span class="sr-only"></span></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


<div class="container" >
<div class="col-md-12" align="middle">
  <br>
  <div id="myCarousel" class="carousel slide" data-offset="1000" >
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <div class="carousel-inner">
   <c:forEach items="${specificbooks}" var="n" varStatus="i">
        <c:choose>
        <c:when test="${i.index==0}">
         <div class="item active">
          <img class="first-slide" src="${n.imageUrl}" alt="${n.bookType}">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.bookName}</h1>
            </div>
          </div>
        </div>
        </c:when>
        <c:otherwise>
         <div class="item">
          <img class="first-slide" src="${n.imageUrl}" alt="${n.bookType}">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.bookName}</h1>
            </div>
          </div>
        </div>
        </c:otherwise>
        </c:choose>
        </c:forEach>
    
</div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</div>
</div>
<br>
<div class="row">
<c:forEach items="${specificbooks}" var="n">
<div class="col-md-4">
    <div class="thumbnail">
      <img src="${n.imageUrl}" >
      
     
        
      <div class="caption">
        
         <h3><a href="/BookApp/books?id=${n.bookId}">${n.bookName}</a></h3>
        
      </div>
    </div>
  </div>
</c:forEach>
</div>
</body>
</html>