<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result System</title>
    </head>
    <body style="background-color:lightgrey">
        <h1>STUDENT ENTER THEIR NAME, ROLL_NO AND SEMESTER TO WATCH RESULT</h1>
         <form method="post" action="result.jsp">
            <centre>
                <table border="1"width="30%"cellpadding="3">
                    
                    <tbody>
                        <tr>
                            <td>Name</td>
                            <td><input type="text"name="sname"value=""/></td>
                        </tr>
                        <tr>
                            <td>Roll Number</td>
                            <td><input type="text"name="roll"value=""/></td>
                        </tr>
                        <tr>
                            <td>Semester</td>
                            <td><input type="text"name="semester"value=""/></td>
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
