<%@page import="com.svist.TravelKhana.utils.OrderUtils"%>
<%@page import="com.svist.TravelKhana.utils.OrderUtilsImp"%>
   <%@ page import="java.util.*" %>
   <%@page import="com.svist.TravelKhana.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Order</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>

</head>
<body>
			<div class="container">
			<h1 align="center"> Order Details</h1>
   <table class="table table-striped table-hover table-users">
    			<thead>
    				<tr>
    					
    					<th>Order Id</th>
    					<th>Order Price</th>
    					<th>Food Id </th>
    					<th>User Id</th>
    					<th>Order Date</th>
    					<th>Order Status</th>
    				</tr>
    			</thead>

    			<tbody>



					<tr>
                        <%
                   	 List<Order1> list = new ArrayList() ;
                        OrderUtils utils= new OrderUtilsImp();
                       list= utils.getAllOrder();
                        for(Order1 order:list)
                        {
                        %>
                        
    					<td><%= order.getO_id() %></td>
    					<td><%= order.getPrice() %></td>
    					<td><%= order.getFood_id()%></td>
    					<td><%= order.getUser_id() %></td>
    					<td><%= order.getO_date() %></td>
    					<td><%= order.getO_status()%></td>
    					<% session.setAttribute("list",list);%>
    					
  
    <td>
    <a class="btn mini blue-stripe"href="updateStatus.jsp?id=<%=order.getO_id() %>&status= <%=order.getO_status()%>" >
    
    Update Status</a></td>

                    </tr>
                		<%
                        }
                		%>
	               </tbody>

    		</table>
    		</div>
</body>

<script>
$('#myModal').on('show', function() {
    var tit = $('.confirm-delete').data('title');

    $('#myModal .modal-body p').html("Desea eliminar al usuario " + '<b>' + tit +'</b>' + ' ?');
    var id = $(this).data('id'),
    removeBtn = $(this).find('.danger');
})

$('.confirm-delete').on('click', function(e) {
    e.preventDefault();

    var id = $(this).data('id');
    $('#myModal').data('id', id).modal('show');
});

$('#btnYes').click(function() {
    // handle deletion here
    var id = $('#myModal').data('id');
    $('[data-id='+id+']').parents('tr').remove();
    $('#myModal').modal('hide');
    
});
</script>
</html>