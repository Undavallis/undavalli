<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to NewsXY</title>
<link href = "/NewsSearching/resources/bootstrap/css/bootstrap.min.css" rel = "stylesheet"/>
<link href = "/NewsSearching/resources/bootstrap/css/bootstrap-theme.css" rel = "stylesheet"/>
<link href = "/NewsSearching/resources/bootstrap/css/carousel.css" rel = "stylesheet"/>
<script type = "text/javascript" src = "/NewsSearching/resources/jquery/jquery.min.js"></script>
<script type = "text/javascript" src = "/NewsSearching/resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/Newssearching/resources/js/canvasjs.min.js"></script>
<script type="text/javascript">
	window.onload = function () {
		var chart = new CanvasJS.Chart("chartContainer",
		{
			title:{
				text: "News Categories",
				verticalAlign: 'top',
				horizontalAlign: 'left'
			},
                        animationEnabled: true,
                        
			data: [
			{         click:onClick,
				type: "doughnut",
				startAngle:20,       
				click:onClick,
				toolTipContent: "{label}: {y} - <strong>#percent%</strong>",
				indexLabel: "{label} #percent%",

				dataPoints: ${chartdata} 
			 }
			]
		});

		chart.render();
		function onClick(e)
		{   
			window.location="/NewsSearching/News/"+e.datapoint.label;
		}
	}
	</script>
	
	
	
	
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
      <a class="navbar-brand" href="#"><button type="button">News</button></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/NewsSearching/addnews"><button type="button">Addnews</button><span class="sr-only">(current)</span></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container">
<div class="row">
<div class="col-md-8">
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
     
        <c:forEach items="${carouselnews}" var="n" varStatus="i">
        
        <c:choose>
        <c:when test="${i.index==0}">   
        <div class="item">
          <img class="second-slide" src="${n.imageUrl }" alt="${n.headlines}">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.headlines}</h1>
             </div>
          </div>
        </div>
        
        
        
        
        </c:when>
        </c:choose>
        <c:otherwise>
        <div class="item active">
          <img class="second-slide" src="${n.imageUrl}" alt="${n.headlines}">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.headlines}</h1>
             </div>
          </div>
        </div>  
        
        
        
        </c:otherwise>
            
         <div class="item">
          <img class="second-slide" src="{n.imageUrl}" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.headlines}</h1>
             </div>
          </div>
        </div>
        </c:forEach>
        </div>
        
     
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->

</div>
<div class="col-md-4"><div id="chartContainer" style="height: 300px; width: 100%;">
</div></div>

<br>
<div class="row">

<div class="col-md-8">
<form method="POST" action="/NewsSearching/search">
<div class="input-group">
      <input type="text" class="form-control" placeholder="Search for...">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button">submit</button>
      </span>
    </div><!-- /input-group -->
    </form>
</div>
<div class="col-md-2"></div>
</div>
<br>
<div class="row">
<c:forEach item="${allNews}" var="news">
<div class="col-md-4">
    <div class="thumbnail">
      <img src="..." alt="...">
      <div class="caption">
      <img src="${news.imageUrl} alt="">
        <h3><a href="/NewsSearching/news?id=${news.id}">${news.id}</a></h3>
      </div>
    </div>
  </div>
</c:forEach>
</div>
 </div>

</body>
</html>