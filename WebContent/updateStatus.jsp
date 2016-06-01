<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update status</title>
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

<%
String id=request.getParameter("id");
String status=request.getParameter("status");

%>


<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close abc" data-dismiss="modal" aria-hidden="true">×</button>
          <h1 class="text-center">Update Order</h1>
      </div>
      <div class="modal-body">
         <form class="form col-md-12 center-block" method="POST" action="doUpdate"> 
          <div class="form-group">
			    <label for="sel1">Order Status:</label>
			      <select class="form-control" id="sel1" name="status" >
			      <option value="Undelivered">Undelivered</option>
			      <option value="Delivered">Delivered</option>
			      <option value="Canceled">Canceled</option>
			      </select>     
    	</div>
    	 <div class="form-group">
    	   
              <input type="hidden" class="form-control input-lg" value="<%=id %>" name="id">
            </div>
         
    		<div class="form-group">
              <button class="btn btn-primary btn-lg btn-block">Update</button>
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
    	window.location="adminMainPage.jsp";
    });
});
</script>
</html>