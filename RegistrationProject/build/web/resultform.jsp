<%-- 
    Document   : reg
    Created on : Jul 15, 2016, 8:45:18 PM
    Author     : jajajajamwant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result System</title>
    </head>
    <body style="background-color:lightgrey">
        <h1>Submit all correct information of marks</h1>
        <form method="post"action="marks.jsp">
            <center>
                <table border="1"width="30%"cellpadding="5">
                    
                    <thead>
                        <tbody>
                        <tr>
                            <td>Student Name</td>
                            <td><input type="text"name="sname"value=""/></td>
                        </tr>
                        <tr>
                            <td>Father's Name</td>
                            <td><input type="text"name="fname"value=""/></td>
                        </tr>
                        <tr>
                            <td>Roll Number</td>
                            <td><input type="text"name="roll"value=""/></td>
                        </tr>
                        <tr>
                            <td>Branch</td>
                            <td><input type="text"name="branch"value=""/></td>
                        </tr>
                        <tr>
                            <td>Semester</td>
                            <td><input type="text" name="semester" value=""/></td>
                        </tr>
                        <tr>
                            <td>Subject1</td>
                            <td><input type="text" name="subject1"value=""/></td>
                        </tr>
                        <tr>
                            <td>Subject2</td>
                            <td><input type="text" name="subject2"value=""/></td>
                        </tr>
                        <tr>
                            <td>Subject3</td>
                            <td><input type="text" name="subject3"value=""/></td>
                        </tr>
                        <tr>
                            <td>Subject4</td>
                            <td><input type="text" name="subject4"value=""/></td>
                        </tr>
                        <tr>
                            <td>Subject5</td>
                            <td><input type="text" name="subject5"value=""/></td>
                        </tr>
                        <tr>
                            <td>Subject6</td>
                            <td><input type="text" name="subject6"value=""/></td>
                        </tr>
                        <tr>
                            <td><input type="submit"value="Submit"/></td>
                        </tr>
                        </tbody>
                </table>
            </center>
        </form>
    </body>
</html>
