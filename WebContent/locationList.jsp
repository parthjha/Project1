<%@page import="java.util.ArrayList"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtils"%>
<%@page import="com.svist.TravelKhana.beans.Location"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location List</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
			<h1 align="center"> List of Locations</h1>
   <table class="table table-striped table-hover table-users">
    			<thead>
    				<tr>
    					
    				
    					<th>Location Id</th>
    					<th>Location Name</th>
    				
    				</tr>
    			</thead>
    			<tbody>
					
                        <%
                   	 List<Location> list = new ArrayList() ;
                       LocationUtils utils=new LocationUtilsImp();
                       list= utils.getAllLocation();
                        for(Location l:list)
                        {
                        %>
                       <tr>
    					<td><%= l.getL_id() %></td>
    					<td><%= l.getL_name()%></td>
    	
    					 
                		<%
                        }
                		%>
                		</tr>
	               </tbody>

    		</table>
    		</div>



</body>
</html>