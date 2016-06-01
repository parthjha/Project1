<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.svist.TravelKhana.utils.OrderUtils"%>
<%@page import="com.svist.TravelKhana.utils.OrderUtilsImp"%>
   <%@ page import="java.util.*" %>
   <%@page import="com.svist.TravelKhana.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >

#me{
height:400px;				
}	
</style>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>


<script>
$(document).ready(function(){
     $("#users").change(function(){
         var value = $(this).val();
         
         $.get("data.jsp",{q:value},function(data){
          $("#javaquery").html(data);
         });
     });
 });
</script>
</head>
<body>
 <select id = "users">
           <option value="">Select Account ID</option>
           <option value="pizza">pizza</option>
           <option value="Biryani">Biryani</option>
            <option value="Chicken Biryani">ChickenBiryani</option>
        </select>
        <br />
        <div id="javaquery"><b>Price will be displayed here</b></div>
    </body>

	
</body>
</html>