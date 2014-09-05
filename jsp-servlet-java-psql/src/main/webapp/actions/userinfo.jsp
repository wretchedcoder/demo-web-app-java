<jsp:useBean id="user" class="demo.beans.UserBean" scope="session"/>
<html>
<body>
You Entered<br/>
User Name: <%= user.getUsername() %>
Password : <%= user.getPassword() %>
</body>
</html>