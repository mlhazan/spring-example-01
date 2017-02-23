<%-- 
    Document   : admissionSuccess
    Created on : Feb 13, 2017, 3:06:52 PM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${msg}</h1>
        <h1>${headerMessage}</h1>
        <br/>


        <table>
            <tr>
                <td> Student Name:</td><td> ${student.studentName}</td>
            </tr>
            <tr>
                <td>Student Hobby:</td><td>${student.studentHobby}</td>
            </tr>
            <tr>
                <td>Student Mobile:</td><td>${student.studentMobile}</td>
            </tr>
            <tr>
                <td>Student DOB:</td><td>${student.studentDOB}</td>
            </tr>
            <tr>
                <td>Student Skills:</td><td>${student.studentSkills}</td>
            </tr>
            <tr>
                <td>Student Address:</td>
            </tr>
        </table>
        <table
            <tr>
                <td> Street:</td><td>${student.studentAddress.street}</td>
                <td> City:</td><td>${student.studentAddress.city}</td>
                <td> State:</td><td>${student.studentAddress.state}</td>
                <td> Zip Code:</td><td>${student.studentAddress.zipcode}</td>
                <td>Country:</td><td>${student.studentAddress.country}</td>

            </tr>
        </table>


    </body>
</html>
