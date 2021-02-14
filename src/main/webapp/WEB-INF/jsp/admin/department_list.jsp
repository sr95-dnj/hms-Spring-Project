<%-- 
    Document   : department_list
    Created on : Dec 31, 2020, 12:10:09 PM
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

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.depList}" var="dep">
                        <tr>
                            <td>${dep.id}</td>
                            <td>${dep.name}</td>
                            
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
