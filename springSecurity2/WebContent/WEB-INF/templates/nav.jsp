<nav>

<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<div class="container">
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/springSecurity2">Spring Security</a>
        </div>
          <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
          
          <security:authorize access="!isAnonymous()">
          
          <security:authorize access="hasAnyRole('ROLE_USER','ROLE_ADMIN')">
            <li><a href="/springSecurity2/reports">Reports</a></li>
            </security:authorize>
            <security:authorize access="hasAnyRole('ROLE_DASHBOARD','ROLE_ADMIN')">
            <li><a href="/springSecurity2/dashboard">Dashboard</a></li>
            </security:authorize>
            <security:authorize access="hasRole('ROLE_ADMIN')">
            <li><a href="/springSecurity2/admin">Admin</a></li>
            </security:authorize>
            
            
            
            </security:authorize>
            
            
          </ul>
       
          <security:authorize access="!isAnonymous()">
           <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome <security:authentication property="principal.username"/></a></li>
            <li><a href="/springSecurity2/logout">Logout</a></li>
          </ul>
          </security:authorize>
          
          <security:authorize access="isAnonymous()">
          
          
          <form method="post" action="/springSecurity2/login"  class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" name="username" placeholder=" Enter Username" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" name="password" placeholder="Enter Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
          <ul class="nav navbar-nav navbar-right">
          <li><a href="/springSecurity2/register">Register</a></li>
          </ul>
          </security:authorize>
          
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
</div>
</nav>