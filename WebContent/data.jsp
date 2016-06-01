<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
int price = 0;
String q = request.getParameter("q");
try {
     Class.forName("com.mysql.jdbc.Driver");
     Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/travelkhana", "root", "");
     Statement smt =  (Statement)con.createStatement(); //Create Statement to interact
     ResultSet r = smt.executeQuery("select * from food where(f_name='" + q + "');");
     while (r.next()) {
       price = r.getInt("f_price");
     }
     con.close();
} catch (Exception e) {
     e.printStackTrace();
}

%>

<%out.print(price);%>
