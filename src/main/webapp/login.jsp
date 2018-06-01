<%--
  Created by IntelliJ IDEA.
  User: jenniferwalker
  Date: 5/31/18
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }

%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/login.jsp" method="post">
        <label for="name">Name</label>
        <input type="text" name="name" id="name" placeholder="Input name" focus required>

        <label for="password">Password</label>
        <input type="text" name="password" id="password" placeholder="Input password" >
    </form>
</body>
</html>
