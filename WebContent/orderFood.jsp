<%@page import="com.svist.TravelKhana.beans.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.svist.TravelKhana.beans.Food"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Food</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

 <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>
 <link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700" rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
<style>
#me{
					
height:400px;
					
	}	
.xyz{
	padding: 40%;	
	position: relative;	
				
}
.show_price {
 position:absolute;
 top:100px;
 right:30px;
}

</style>
</head>
<body>

<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading" align="center"><h2>Order Food</h2></div>
        <div class="row">
            <div class="col-lg-7 col-md-7 col-sm-7">
                <div class="panel panel-default">
		            <div class="panel-heading">List Of Food</div>
		               <div class="panel-body" id="me"> 
			 <form  class="form-horizontal" method="post" action="OrderFood">
				 <%
				List<Food> list = new ArrayList() ;
				list=(List)session.getAttribute("listoffood");
			  	User u=(User)session.getAttribute("user");
			  	
				for(Food f:list )
				{
				%>
				
			 <input type="checkbox"  id="food" class="food"  name="food" value="<%= f.getF_name() %>">
					  <%= f.getF_name()%><br>
				<input type="hidden" class="price"  value="<%=f.getF_price()%>" name="price[]">
					 Food Price :<span><%=f.getF_price()%></span><br>
					 
				<input type="hidden" class="name"  value="<%=u.getU_id()%>" name="name">
			
					 
					 Food Type :<span><%=f.getF_type()%></span><br>
					 	
		      
		       <%
		       }
		       
		       %>
	
            </div>
         </div>
      </div>
      
       <div class="col-lg-5 col-md-5 col-sm-5">
                <div class="panel panel-default">
                    <div class="panel-heading"> Food Selected</div>
                       <div class="panel-body" id="me">  
			           	<div id="right">   </div>
			           	
			          <div class="show_price">Total price
			          <div id="left">  </div>
			          </div>
			                   <div class="form-group ">
			                         <div class="col-md-12 text-center xyz">
			                             <button type="submit" class="btn btn-primary btn-lg">Book Now</button>
			                   </div>
			                 
			         		</form>         
			                 </div>
			             </div>
			         </div>
   </div>
</div>
</div>
</div>

</body>
<script >
var count=0;
$(document).ready(function(){
	
	
  
    $("input").change(function () {
     
    
    	var id= $(this).attr('id');
    	 var value = $(this).attr('value');
    	  var price =0;
        if($(this).is(':checked')) {
        	 $.get("data.jsp",{q:value},function(data){
        		 
        		 var p = data;
                 var price=parseInt(p);
                  count=count+price;
                  $("#right").append("<div class="+id+">"+value+"</div>");
                  //$("#right").append("<div class="+id+">"+value+
                         // "<i  onclick='myFunction(" +id +")' class='fa fa-times'> </i> </div>");
                  
                  $("#left").text(count);
        	 });
        	 
        	
        		
        	  
        	  
        }
        
        else{
        	
       	 $.get("data.jsp",{q:value},function(data){
    		 
    		 var p = data;
             var price=parseInt(p);
              count=count-price;
              //$("#right").append("<div class="+id+">"+value+ price+count+"</div>");
             // $("#right").append("<div class="+id+">"+value+ "</div>");
               $("#right div."+id).remove();
              $("#left").text(count);
    	 });
    	 
        	
       }
        
    });
});
/*
function myFunction(id)
{


var id1= $(id).attr('id');
console.log(id1);
document.getElementById(id1).checked = false;
var value = $(id).attr('value');

$.get("data.jsp",{q:value},function(data){
	
	  var p = data;
      var price=parseInt(p);
     // document.getElementById(id1).remove();
       $("#right").remove();
      $("#left").text(count);
     var i=count-price;	
       console.log(count);
       console.log(price);
	
     
       $("#left").text(i);
});
}*/
</script>

</html>