<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result System</title>
    </head>
    <body style="background-color:lightgrey">
        <h1>STUDENT ENTER THEIR NAME, ROLL_NO AND SEMESTER TO WATCH RESULT</h1>
         <form method="post" action="admin.jsp">
            <centre>
                <table border="1"width="30%"cellpadding="3">
                    
                    <tbody>
                        <tr>
                            <td>Admin Name</td>
                            <td><input type="text"name="adminname"value=""/></td>
                        </tr>
                        <tr>
                            <td>Admin ID</td>
                            <td><input type="password"name="adminid"value=""/></td>
                        </tr>
                        <tr>
                            <td>Admin Password</td>
                            <td><input type="password"name="pass"value=""/></td>
                        </tr>
                        <tr>
                            <td><input type="submit"value="Submit"/></td>
                           
                        </tr>
                        
                    </tbody>
                </table>
            </centre>
        </form>
    </body>
</html>
