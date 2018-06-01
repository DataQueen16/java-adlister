<%--
  Created by IntelliJ IDEA.
  User: jenniferwalker
  Date: 6/1/18
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Name" />
    </jsp:include>
</head>
<body>

<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Please Enter Your Name</h1>
    <form action="/nameForm.jsp" method="POST">
        <div class="form-group">
            <label for="username">Name</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>
</body>
</html>
