<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result System</title>
    </head>
    <body style="background-color:lightgrey">
        <h1>MARK THE ATTENDENCE OF STUDENT</h1>
         <form method="post" action="totalatt.jsp">
            <centre>
                <table border="1"width="30%"cellpadding="3">
                    
                    <tbody>
                        <tr>
                            <td>Roll Number</td>
                            <td><input type="text"name="roll"value=""/></td>
                        </tr>
                        <tr>
                            SEMESTER:
                            <select nmae="semester">
                            <option>1</option>
                            <option>2</option>
                 <option>3</option>
                            <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
            </select>
                        </tr>
                        <tr>
                            <td>Date</td>
                            <td><input type="date"name="date"value=""/></td>
                        </tr>
                        <tr>
                            <td>Status</td>
                            <td><input type="radio" name="status" value="P" checked>P</td>
                            <td><input type="radio" name="status" value="A" checked>A</td>
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
