<%@page import="com.svist.TravelKhana.utils.FoodUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.FoodUtils"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtils"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtilsImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
   <%@page import="com.svist.TravelKhana.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Food</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
			<h1 align="center"> Food On Popular Locations</h1>
   <table class="table table-striped table-hover table-users">
    			<thead>
    				<tr>
    					
    				
    					<th>Food Name</th>
    					<th>Food Type </th>
    					<th>Food Description</th>
    					<th>Food Price</th>
    					<th>Location Name</th>
    				
    				</tr>
    			</thead>
    			<tbody>
					
                        <%
                   	 List<Food> list = new ArrayList() ;
                        FoodUtils utils=new FoodUtilsImp();
                       list= utils.getAllFood();
                        for(Food f:list)
                        {
                        %>
                        <tr>
    					<td><%= f.getF_name() %></td>
    					<td><%= f.getF_type() %></td>
    					<td><%= f.getF_desc() %></td>
    					<td><%= f.getF_price() %></td>
    					<% LocationUtils util=new LocationUtilsImp();
    					int id =f.getL_id();
    				Location l=	util.getLocation(id);
    					%>
    					<td><%= l.getL_name() %></td>
    					 </tr>
                		<%
                        }
                		%>
                		
	               </tbody>

    		</table>
    		</div>


</body>
</html>