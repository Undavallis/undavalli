<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="/BookApp/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href= "/BookApp/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/BookApp/resources/bootstrap/css/justified.css" rel="stylesheet">
<script type="text/javascript" src="/BookApp/resources/jquery/jquery.min.js" rel="stylesheet"></script>
<script type="text/javascript" src="/BookApp/resources/bootstrap/js/bootstrap.min.js" rel="stylesheet"></script>
</head>
<body style="background-image: url(http://pre01.deviantart.net/1a3a/th/pre/f/2011/259/d/d/dd86abc5211fd9d1c051a18cc44c13fc-d4a04l5.jpg)">

 <div class="container">

      <!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
      <div class="masthead">
      
        <h3 class="text-muted">BOOKFINDER
        
        <p align = "right"><a class="btn btn-danger" href="/BookApp/" role="button">LOG OUT</a></p></h3>

         
        <nav>
          <ul class="nav nav-justified">
            <li class="active"><a href="/BookApp/home">Home</a></li>
            <li><a href="/BookApp/Action/drama">DRAMA</a></li>
            <li><a href="/BookApp/Action/sports">SPORTS</a></li>
            <li><a href="/BookApp/Action/fiction">FICTION</a></li>
            <li><a href="/BookApp/Action/thriller">THRILLER</a></li>
            <li><a href="/BookApp/Action/moneyandbusiness">MONEYANDBUSINESS</a></li>
            <li><a href="add">ADDBOOK</a></li>
          </ul>
        </nav>
      </div>
      </div>
      <br>
      <br>
      
  <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Welcome to an Ebooks World!</h1>
        <p>An ebook is a book in electronic format. It is downloaded to a computer, PC, Mac, laptop, PDA, tablet, smartphone or any other kind of reading device, and is read on the screen. 
        It can have pictures and graphics, exactly like a printed book......</p>
        <p>"A book is a version of the world. If you do not like it, ignore it or offer your own version in return."
        </p>
        <p class = "text-warning">Scroll Down to get Started!!</p>
      </div>
    </div>
    <br>
    
    <div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">
<form method="POST" action="/BookApp/search">
<div class="input-group">
      <input type="text" id="str" name="str"class="form-control" placeholder="Search for...">
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">Go!</button>
      </span>
    </div><!-- /input-group -->
    </form>
</div>
<div class="col-md-2"></div>
</div>
<br>

<div class="col-md-2"></div>
</div>
<br>
<div class="row">
<c:forEach items="${allbooks}" var="books">
<div class="col-md-4">
    <div class="thumbnail">
      <img src="${books.imageUrl}" alt="...">
      <div class="caption">
        <h3><a href="/BookApp/books?id=${books.bookId}">${books.bookName}</a></h3>
      </div>
    </div>
  </div>
</c:forEach>
</div>




</div>



    

</body>
</html>