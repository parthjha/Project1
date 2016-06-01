<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.svist.TravelKhana.utils.LocationUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.LocationUtils"%>
<%@page import="com.svist.TravelKhana.utils.TrainUtilsImp"%>
<%@page import="com.svist.TravelKhana.utils.TrainUtils"%>
<%@page import="com.svist.TravelKhana.beans.*"%>
    <%@ page import="java.util.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group Travel</title>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script src="bootstrap/jquery.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>

</head>
<body>

 <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="well well-sm">
                <form class="form-horizontal" method="post" action="groupTravel">
                    <fieldset>
                        <legend class="text-center header">Request a Call Back</legend>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="name" name="name" type="text" placeholder=" Name*" class="form-control">
                            </div>
                        </div>
                      

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="email" name="email" type="text" placeholder="Email Address *" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="phone" name="phone" type="text" placeholder="Phone*" class="form-control">
                            </div>
                        </div>



                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="persons" name="persons" type="text" placeholder=" No of Persons *" class="form-control">
                            </div>
                        </div>
                        
                            <div class="form-group">
			                        <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
			                            <div class="col-md-8">
			                           <div><h4>Meal*</h4></div>
									    <label class="checkbox-inline">
									      <input type="checkbox" value="">Break Fast
									    </label>
									    <label class="checkbox-inline">
									      <input type="checkbox" value="">Lunch
									    </label>
									    <label class="checkbox-inline">
									      <input type="checkbox" value="">Dinner
									    </label>
									    </div>
									 
					    	</div>
					    	
					    	
					    	
								    	
							 
			          <div class="form-group">
			          <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
						     <div class="col-md-8">
						    <label for="sel1">Train*</label>
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
			    	</div>
			    	
			    	
			          <div class="form-group">
			          <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
						   <div class="col-md-8">
						    <label for="sel1">Location*</label>
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
			    			</div>
		
                        <div class="form-group">
                          <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                            <div class="col-md-8">
								  <label for="sel1">Tour *</label>
								  <select class="form-control" id="sel1">
								    <option>Religious Tour</option>
								    <option>School Tour</option>
								    <option>Corporate Tour</option>
								    <option>Domestic Tour</option>
								     <option>Family Tour</option> 
								     <option>Wedding Tour</option>
								  </select>
								</div>
						</div>
								
								
		
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="date" name="date" type="text" placeholder=" Journey Date *[DD-MM-YYYY]" class="form-control">
                            </div>
                        </div>
    	
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                            <div class="col-md-8">
                                <textarea class="form-control" id="message" name="message" placeholder="Enter your massage for us here. We will get back to you within 1 business days." rows="7"></textarea>
                            </div>
                        </div>
                        
                        <div class="form-group">
                        <p class="text-center"> * Fields are required</p>
                            <div class="col-md-12 text-center">
                                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>


</body>
</html>