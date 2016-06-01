<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login Form</title>
<style>
.modal-footer {   
border-top: 0px; 
}
</style>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</head>
<body>

<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close abc" data-dismiss="modal" aria-hidden="true">×</button>
          <h1 class="text-center">Admin Login</h1>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block" method="POST" action="AdminLogin">
            <div class="form-group">
              <input type="text" class="form-control input-lg" placeholder="Username" name="email">
            </div>
            <div class="form-group">
              <input type="password" class="form-control input-lg" placeholder="Password" name="password">
            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block">Sign In</button>
              
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <button class="btn abc" data-dismiss="modal" aria-hidden="true">Cancel</button>
		  </div>	
      </div>
  </div>
  </div>
</div>
 
     
</body>
<script>
$(document).ready(function(){
    $(".abc").click(function(){
    	window.location="index.jsp";
    });
});
</script>
</html>
