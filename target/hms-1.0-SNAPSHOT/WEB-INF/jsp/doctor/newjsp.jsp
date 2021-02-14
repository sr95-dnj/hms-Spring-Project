<%-- 
    Document   : newjsp
    Created on : Jan 14, 2021, 6:14:05 PM
    Author     : Siddiquer Rahman
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        dsafj
        <c:forEach items="${map.prescriptionList}" var="pp">
            <h1>${pp.pDate}</h1>
        
    </c:forEach>
    </body>
</html>
