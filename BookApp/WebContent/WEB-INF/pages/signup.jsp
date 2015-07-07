<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <head>
	<title>Sign up</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Weebly makes it surprisingly easy to create a high-quality website, blog or online store. Over 25 million people use Weebly to bring their unique ideas to life." />

	<meta property="og:title" content="Weebly is the easiest way to create a website, store or blog"/>
	<meta property="og:type" content="company"/>
	<meta property="og:site_name" content="Weebly.com"/>
	<meta property="og:image" content="http://cdn1.editmysite.com/images/theme_contest/screenshots.gif"/>

		


	<script src="//cdn2.editmysite.com/js/vendor/modernizr.js"></script>

	<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700" />
	
		<link rel="stylesheet" type="text/css" href="http://cdn2.editmysite.com/css/public/vertical/carbon.css?buildTime=1436207657" />
		<link rel="stylesheet" type="text/css" href="http://cdn2.editmysite.com/css/public.css?buildTime=1436207657" />
		<link rel="stylesheet" type="text/css" href="http://cdn2.editmysite.com/css/iframe.css?buildTime=1436207657" />



	<script> var loginData = {"use_ssl":true,"redirect":false}; var phone = {"phoneNumber":"1-844-493-3259","showPhoneNumber":false}; var errorMsgs = {"wrongUserPass":"Wrong username or password","loginToAccess":"Please log-in to access that page","loginAgain":"Please log-in again to continue.","accountDeleted":"Your account was previously deleted","accountExists":"You already have an account. Please log-in.","loginInstead":"You already have an account. Please log-in."}; var DISABLE_SIGNUP_CAPTCHA = true; var oauth = {"facebook_app_id":"190291501407","domain":"www.weebly.com","user":false}; </script>


		
		<script type="text/javascript" src="http://cdn2.editmysite.com/js/lang/en/tl.js?buildTime=1436207657"></script>
		
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
		
		<script type="text/javascript" src="http://cdn2.editmysite.com/js/public/header/signup/SignupFrame.js?buildTime=1436207657"></script>


</head>



<body class="vertical w-ui" data-pagename="">
	<div class="signup-overlay">
	<span class="btn-x">&times;</span>
	<div class="logo w-icon-li-weebly-logo"></div>
	<div class="signup-container">
		<h2>Sign Up</h2>
		<div class="left">
			
		</div>
		<div class="right">
		 <form:form method="POST" modelAttribute="signup" action="/BookApp/signup">
			
				<input type="text" id="overlay-signup-form-name" path="fullname" name="fullname" class="signup-name" placeholder="Full Name" autocomplete="off">
				<input type="text" id="overlay-signup-form-email" path="username" name="username" placeholder="username" autocomplete="off">
				<input type="password" id="overlay-signup-form-pass" path="password" name="password" placeholder="Password" autocomplete="off">
<br>
<button type="submit" class="btn btn-success pull-right">sign up</button>
				

			

				
						

				
		</form:form>
		</div>
	</div>
</div>


	
	<script type="text/javascript">
		(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
				m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		if (document.cookie.indexOf('force-automated-segment') == -1) {
			window.ga('create', 'UA-1226418-1',  {
				cookieDomain: '.weebly.com'
			});
			window.ga('send', 'pageview');
		}
	</script>
	
		
	
		<script type="text/javascript">
			_qoptions = { qacct:"p-0dYLvhSGGqUWo" };
			(function() {
				var script = document.createElement('script');
				script.type = 'text/javascript';
				script.async = true; script.defer = true;
				script.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://edge.quantserve.com/quant.js';
				var element = document.getElementsByTagName('script')[0];
				element.parentNode.insertBefore(script, element);
			})();
		</script>
		<noscript>
			<img src="http://pixel.quantserve.com/pixel/p-0dYLvhSGGqUWo.gif" style="display: none;" border="0" height="1" width="1" alt="Quantcast"/>
		</noscript>
	
		 <script type="text/javascript"> 
			var _mTrack = _mTrack || []; 
			_mTrack.push(['trackPage']); 
			(function() {
				var mClientId = 'f52zgtujz0';
				var mProto = ('https:' == document.location.protocol ? 'https://' : 'http://'); 
				var mHost = 'tracker.marinsm.com';
				var mt = document.createElement('script'); mt.type = 'text/javascript';
				mt.async = true; mt.src = mProto + mHost + '/tracker/async/' + mClientId + '.js';
				var fscr = document.getElementsByTagName('script')[0]; fscr.parentNode.insertBefore(mt, fscr);
			})();
		</script>
		<noscript>
			<img src="//tracker.marinsm.com/tp?act=1&cid=f52zgtujz0&script=no" >
		</noscript>
	
	
</body>
</html>
