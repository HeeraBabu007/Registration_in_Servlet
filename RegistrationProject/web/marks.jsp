<%-- 
    Document   : registration
    Created on : Jul 15, 2016, 9:09:10 PM
    Author     : jajajajamwant
--%>


<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.*"%>


<%
    
   
    String sname = request.getParameter("sname");
    String fname = request.getParameter("fname");
    String roll = request.getParameter("roll");
    String branch = request.getParameter("branch");
    String semester = request.getParameter("semester");
    String subject1 = request.getParameter("subject1");
    String subject2 = request.getParameter("subject2");
    String subject3 = request.getParameter("subject3");
    String subject4 = request.getParameter("subject4");
    String subject5 = request.getParameter("subject5");
    String subject6 = request.getParameter("subject6");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resultadmin","root","root");
    PreparedStatement ps=con.prepareStatement("insert into marks values(?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,sname);
		ps.setString(2,fname);
		ps.setString(3,roll);
                ps.setString(4,branch);
		ps.setString(5,semester);
                ps.setString(6,subject1);
                ps.setString(7,subject2);
                ps.setString(8,subject3);
                ps.setString(9,subject4);
                ps.setString(10,subject5);
                ps.setString(11,subject6);
		int i=ps.executeUpdate();
    if(i>8)
    {
        //session.setAttribute("userid",user);
        response.sendRedirect("result.jsp");
        //out.print("Registration Successful!"+"<a href='index.jsp'>Go to Login</a>");
    }
    else
    {
        response.sendRedirect("home.jsp");
    }

 %>
    
