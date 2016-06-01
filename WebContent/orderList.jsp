<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.svist.TravelKhana.utils.*"%>
       <%@page import="com.svist.TravelKhana.beans.*"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order List</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
			<h1 align="center"> Order Status </h1>
   <table class="table table-striped table-hover table-users">
    			<thead>
    				<tr>
    					
    				
    					<th>Food Name</th>
    					<th>Food Type </th>
    					<th>Food Quantity</th>
    					<th>Food Price</th>
    					<th>Order Status</th>
    					<th>Order Date</th>
    				</tr>
    			</thead>
    			<tbody>
					
                        <%
                        User u=(User)session.getAttribute("user");
                      
                    	 List<Order1> list = new ArrayList() ;
                       OrderUtils utils=new OrderUtilsImp();
                       list= utils.getAllOrderById(u.getU_id());
                      
                        for(Order1 o:list)
                        {
                        	
                        %>
                        <tr>
                       <%
                       
                       FoodUtils util=new FoodUtilsImp();
                       int id=o.getFood_id();
                       Food f=(Food)util.getFood(id);
                        
                       %> 
    					<td><%=  f.getF_name() %></td>
    					<td><%= o.getO_type() %></td>
    					<td><%= o.getO_quant() %></td>
    					<td><%= o.getPrice() %></td>
    					<td><%= o.getO_status() %></td>
    					<td><%=  o.getO_date()%></td>
    					 </tr>
                		<%
                        }
                		%>
                		
	               </tbody>

    		</table>
    		</div>



</body>
</html>