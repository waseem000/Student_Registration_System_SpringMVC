<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form id="userForm" commandName="createuser"  name= "createuser" method="post" action="">
  <p>
    <label for="regId">Registration ID</label>
    <form:input path ="regId" type="text" name="regId" id="regId" />
  </p>
  <p>
    <label for="roleId">User type</label>
    <form:select path="roleId" name="roleId" id="roleId">
         <form:option value="1" label="Student"/>
      <form:option value="0" label ="Staff" />
    </form:select>
  </p>
  <p>
    <label for="firstName">First Name</label>
    <form:input path="firstName" type="text" name="firstName" id="firstName" />
  </p>
  <p>
    <label for="lastName">Last Name</label>
    <form:input path="lastName" type="text" name="lastName" id="lastName" />
  </p>
  <p>
    <label for="gender">Gender</label>
    <form:select path="gender" name="gender" id="gender">
         <form:option value="1" label="Male"/>
      <form:option value="0" label ="Female" />
    </form:select>
  </p>
  <p>
    <label for="email">Email</label>
    <form:input path="email" type="text" name="email" id="email" />
  </p>
  <p>
    <label for="userName">User Name</label>
    <form:input path="userName" type="text" name="userName" id="userName" />
  </p>
  <p>
    <label for="password">Password</label>
    <form:input path="password" type="password" name="password" id="password" />
  </p>
  <p>
    <input type="submit" name="submit" id="submit" value="Next" />
    <input name="reset" type="reset" id="reset" value="Reset" />
  </p>
  </form:form>
</body>
</html>