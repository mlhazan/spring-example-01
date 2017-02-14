<%-- 
    Document   : admissionform
    Created on : Feb 13, 2017, 2:57:30 PM
    Author     : Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${headerMessage}</h1>
        <h1>Student Information</h1>

    <form:errors path="student.*"/>

    <form action="/spring-mvc-form-01/submitAdmissionForm.html" method="post">
        <table>
            <tr>
                <td> Student Name:</td><td> <input type="text" name="studentName"/></td>
            </tr>
            <tr>
                <td>Student Hobby:</td><td> <input type="text" name="studentHobby" /></td>
            </tr>
            <tr>
                <td>Student Mobile:</td><td> <input type="text" name="studentMobile" /></td>
            </tr>
            <tr>
                <td>Student DOB</td><td> <input type="text" name="studentDOB" /></td>
            </tr>
            <tr>
                <td>Student Skills:</td><td>    <select name="studentSkills" multiple>
                        <option value="Java Programming">Java Programming</option>
                        <option value="Oracle DB">Oracle DB</option>
                        <option value="Spring">Spring</option>
                    </select></td>
            </tr>
        </table>
        <table>
            <tr>Student Address:</tr>
            <tr>
                <td> Street:</td><td> <input type="text" name="studentAddress.street"/></td>
                <td> City:</td><td> <input type="text" name="studentAddress.city"/></td>
                <td> State:</td><td> <input type="text" name="studentAddress.state"/></td>
                <td> Zip Code:</td><td> <input type="text" name="studentAddress.zipcode"/></td>
                <td>Country:</td><td> <input type="text" name="studentAddress.country"/></td>
            </tr>

            <tr><td><input type="submit" value="submit"/></td></tr>
        </table>

    </form>
</body>
</html>
