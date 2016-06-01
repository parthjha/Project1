<%@page import="com.svist.TravelKhana.utils.LocationUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtils"%>
  <%@ page import="java.util.*" %>
  <%@page import="com.svist.TravelKhana.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title> Add Food </title>
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
          <h1 class="text-center">Add Food</h1>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block" method="POST" action="AddFood">
            <div class="form-group">
                <label for="sel1">Food Name</label>
              <input type="text" class="form-control input-lg" placeholder="Food Name" name="name">
            </div>
               <div class="form-group">
		      <label for="type" >Food Type :</label>
		      <select class="form-control" id="sel1" name="type">
		        <option value="Dinner">Dinner</option>
		        <option value="Lunch">Lunch</option>
		        <option value="Breakfast">BreakFast</option>
		       
		      </select>
		      </div>
         
            <div class="form-group">
                <label for="sel1">Food Description:</label>
              <input type="text" class="form-control input-lg" placeholder="Food Description" name="desc">
            </div>
            <div class="form-group">
                <label for="sel1">Food Price:</label>
              <input type="text" class="form-control input-lg" placeholder="Food Price" name="price">
            </div>
         
              <div class="form-group">
			    <label for="sel1">Location:</label>
			      <select class="form-control" id="sel1" name="location">
			       <%
					 List<Location> list1 = new ArrayList() ;
					 LocationUtils utils1 =new LocationUtilsImp();
					  list1 =utils1.getAllLocation();
					 for (Location location : list1) {
					%>
						<option value="<%out.print(location.getL_name()); %>"> <%out.print(location.getL_name());%></option>
					<% 
					}
					%>
			      </select>
			     
    			</div>
          
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block">Save</button>
              
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
