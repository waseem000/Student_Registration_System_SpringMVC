<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="<c:url value="CSS/main.css" />" />
<title>Insert title here</title>
</head>
<body>
<a id="addUserLink" href="adduser.html" >Add User</a>
 | &nbsp;
 <a id="updateUserLink" href="mainmenu.html">Update User</a>
  | &nbsp;
  <a href="Deleteuser.html">Delete User</a>
<h1> Hello ${login_form.getUser_name()} ID: ${login_form.getReg_id()} </h1>

 <h3 style="color:red;">${Error}</h3>
  

 
</body>
</html>