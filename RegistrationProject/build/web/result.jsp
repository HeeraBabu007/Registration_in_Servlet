<%-- 
    Document   : registration
    Created on : Jul 15, 2016, 9:09:10 PM
    Author     : jajajajamwant
--%>


<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.*"%>

<html>
    <head>
        <title>
            Showing Result
        </title>
    </head>
    <body>
        <h1>RESULT</h1>

<%
    
   
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultadmin","root","root");
            Statement st=con.createStatement();
            String sname=request.getParameter("sname");
            String roll=request.getParameter("roll");
            String semester=request.getParameter("semester");
            ResultSet rs=st.executeQuery("select * from marks where roll='"+roll+"'");
            
            if(!rs.next())
            {
                out.println("sorry couldn't found");
            }
            else{
 %>
    
 <table border="1">
     <tr>
         <th>Name</th>
         <th>Father's Name</th>
         <th>roll</th>
         <th>Branch</th>
         <th>semester</th>
         <th>subject1</th>
         <th>subject2</th>
         <th>subject3</th>
         <th>subject4</th>
         <th>subject5</th>
         <th>subject6</th>
         
     </tr>
     <tr>
         <td><%=rs.getString(1)%></td>
         <td><%=rs.getString(2)%></td>
         <td><%=rs.getString(3)%></td>
         <td><%=rs.getString(4)%></td>
         <td><%=rs.getString(5)%></td>
         <td><%=rs.getString(6)%></td>
         <td><%=rs.getString(7)%></td>
         <td><%=rs.getString(8)%></td>
         <td><%=rs.getString(9)%></td>
         <td><%=rs.getString(10)%></td>
         <td><%=rs.getString(11)%></td>
         
     </tr>
 </table>
         <br>
         <%}%>
  </body>
</html>
