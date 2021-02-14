<%-- 
    Document   : reception_list
    Created on : Jan 2, 2021, 2:41:33 AM
    Author     : Siddiquer Rahman
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="/resources/vendor/css/bootstrap.css">
    </head>
    <body>

        <div class="container">
            <h2>Bordered Table</h2>
            <p>The .table-bordered class adds borders to a table:</p>            
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Code</th>
                        <th>Department</th>
                        <th>Receptionist</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.receptionList}" var="recep">
                        <tr>
                            <td>${recep.id}</td>
                            <td>${recep.name}</td>
                            <td>${recep.rcode}</td>
                            <td>${recep.department}</td>
                            <td>${recep.receptionist}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
