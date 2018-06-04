<%--
  Created by IntelliJ IDEA.
  User: jenniferwalker
  Date: 6/4/18
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Your current ads" />
    </jsp:include>
</head>
<body>
    <h1>Show all the ads</h1>
    <c:forEach var="ad" items="${ads}">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>
    </c:forEach>
</body>
</html>
