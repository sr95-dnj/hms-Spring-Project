<%-- 
    Document   : pathology_list
    Created on : Dec 31, 2020, 12:09:51 PM
    Author     : Siddiquer Rahman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
        
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
                        <th>ID</th>
                        <th>Name</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.pList}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>
                            
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
