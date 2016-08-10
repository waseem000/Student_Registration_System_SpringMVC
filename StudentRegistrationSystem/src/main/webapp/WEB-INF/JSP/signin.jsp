<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign in - Student Management System</title>
</head>
<body>
	<h3>Enter user name and password:</h3>
	
	<form:form commandName="login_form" name='login_form' action="" method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><form:input path="user_name"  type='text' name='username' value='' /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" type='password' name='password' /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="submit" /></td>
			</tr>
		</table>
		</form:form>
</body>
</html>