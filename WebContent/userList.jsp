<%@page import="java.util.ArrayList"%>
<%@page import="com.svist.TravelKhana.utils.UserUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.UserUtils"%>
<%@page import="java.util.List"%>
<%@page import="com.svist.TravelKhana.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
			<h1 align="center"> List of User</h1>
   <table class="table table-striped table-hover table-users">
    			<thead>
    				<tr>
    					
    				
    					<th>User Id</th>
    					<th>User Name</th>
	    				<th>User Email</th>
	    				<th>User Mobile No</th>
    				</tr>
    			</thead>
    			<tbody>
					
                        <%
                   	 List<User> list = new ArrayList() ;
                      UserUtils util=new UserUtilsImp();
                       list= util.getAllUser();
                        for(User u:list)
                        {
                        %>
                       <tr>
    					<td><%= u.getU_id() %></td>
    					<td><%= u.getU_name()%></td>
    					<td><%= u.getU_email()%></td>
    					<td><%= u.getU_phn_no()%></td>
    					 
                		<%
                        }
                		%>
                		</tr>
	               </tbody>

    		</table>
    		</div>



</body>
</html>