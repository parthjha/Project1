<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome|Travelkhana</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>

<style >
#carousel-example{
margin-top: -20px;
}
</style>
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <li class="active"> <a class="navbar-brand" href="index.jsp">TravelKhana </a></li>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="userMainPage.jsp">Home</a></li>
      <li class="active"><a href="searchTrain.jsp"> Order Food</a></li>
      <li class="active"><a href="foodList.jsp">Food In Popular Trains</a></li>
        <li class="active"><a href="orderList.jsp">Track Order</a></li>
         <li class="active"><a href="groupTravel.jsp">Group Travel</a></li>
        <li class="active"><a href="contact.jsp">Contact Us</a></li>
    </ul>
   
     <ul class="nav navbar-nav navbar-right">

      <li  class="active"><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
     
  </div>
</nav>
  
  <div id="carousel-example" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carousel-example" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example" data-slide-to="1"></li>
    <li data-target="#carousel-example" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="item active">
      <a href="#"><img src="images/food1.jpg" /></a>
      <div class="carousel-caption">
        <h3>Chicken Curi</h3>
        <p>Just Kitten Around</p>
      </div>
    </div>
    <div class="item">
      <a href="#"><img src="images/pizza.jpg" /></a>
      <div class="carousel-caption">
        <h3>Pizza</h3>
        <p>Just Kitten Around</p>
      </div>
    </div>
  
    <div class="item">
      <a href="#"><img src="images/Ice_Cream.jpg" /></a>
      <div class="carousel-caption">
        <h3>Ice Cream</h3>
        <p>Just Kitten Around</p>
      </div>
    </div>
  </div>

  <a class="left carousel-control" href="#carousel-example" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div>

</body>
</html>