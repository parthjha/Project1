<%@page import="com.svist.TravelKhana.utils.LocationUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtils"%>
<%@page import="com.svist.TravelKhana.utils.TrainUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.TrainUtils"%>
<%@page import="com.svist.TravelKhana.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Search Food</title>
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
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close abc" data-dismiss="modal" aria-hidden="true">×</button>
          <h1 class="text-center">Search Food</h1>
      </div>
      <div class="modal-body">
         <form class="form col-md-12 center-block" method="POST" action="doSearchFood"> 
          <div class="form-group">
			    <label for="sel1">Train:</label>
			      <select class="form-control" id="sel1" name="train" >
					<%
					 List<Train> list = new ArrayList() ;
					  TrainUtils utils=new TrainUtilsImp();
					  list =utils.getAllTrain();
					 for (Train train : list) {
					%>
						<option > <%out.print(train.getT_name() );%></option>
					<% 
					}
					%>
			      </select>     
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
              <button class="btn btn-primary btn-lg btn-block">Search</button>
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
    	window.location="userMainPage.jsp";
    });
});
</script>
</html>