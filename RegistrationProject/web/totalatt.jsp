<%-- 
    Document   : registration
    Created on : Jul 15, 2016, 9:09:10 PM
    Author     : jajajajamwant
--%>

<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.*"%>


<%
    
   
    String roll = request.getParameter("roll");
    String semester = request.getParameter("semester");
    String date = request.getParameter("date");
    String status = request.getParameter("status");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resultadmin","root","root");
    PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
		
		
		ps.setString(1,roll);
                ps.setString(2,semester);
		ps.setString(3,date);
                ps.setString(4,status);
		int i=ps.executeUpdate();
    if(i>3)
    {
        //session.setAttribute("userid",user);
        response.sendRedirect("checktattendence.jsp");
        //out.print("Registration Successful!"+"<a href='index.jsp'>Go to Login</a>");
    }
    else
    {
        response.sendRedirect("index.jsp");
    }

 %>
    
