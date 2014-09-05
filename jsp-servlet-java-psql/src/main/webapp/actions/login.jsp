<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="demo.beans.UserBean" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<html>
<body>
<a href="userinfo.jsp">Continue</a>
</body>
</html>