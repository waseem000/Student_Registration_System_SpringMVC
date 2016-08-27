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
<form:form id="userForm" commandName="createstudent"  name= "createstudent" method="post" action="">
  <p>
    <label for="regId">Registration ID</label>
    <form:input path ="regId" type="text" name="regId" id="regId" />
  </p>
  <p>
    <label for="studentmajor">Student Major</label>
    <form:select path="studentmajor" name="studentmajor" id="studentmajor">
         <form:option value="1" label="Major 1"/>
      <form:option value="0" label ="Major 2" />
    </form:select>
  </p>
  <p>
    <label for="finishedcredits">Finished Credits</label>
    <form:input path="finishedcredits" type="text" name="finishedcredits" id="finishedcredits" />
  </p>
  <p>
    <label for="gpa">Email</label>
    <form:input path="gpa" type="text" name="gpa" id="gpa" />
  </p>
  <p>
    <label for="dateofjoin">Date of Join</label>
    <form:input path="dateofjoin" type="text" name="dateofjoin" id="dateofjoin" />
  </p>
  <p>
    <label for="status">Status</label>
    <form:input path="status" type="text" name="status" id="status" />
  </p>
  <p>
    <input type="submit" name="submit" id="submit" value="Submit" />
    <input name="reset" type="reset" id="reset" value="Reset" />
  </p>
  </form:form>
</body>
</html>