<%-- 
    Document   : login
    Created on : Jul 15, 2016, 11:09:02 PM
    Author     : jajajajamwant
--%>

<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.*"%>
<%
    String adminname = request.getParameter("adminname");
    String adminid = request.getParameter("adminid");
    String pass = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resultadmin","root","root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from admin where adminname='"+adminname+"' and adminid='"+adminid+"'");
    if(rs.next())
    {
        session.setAttribute("adminid",adminid);
        //
        response.sendRedirect("resultform.jsp");
    }
    else
    {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>    