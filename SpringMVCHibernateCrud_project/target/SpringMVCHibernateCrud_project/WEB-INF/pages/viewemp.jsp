<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view employees</title>
</head>
<body>
	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Education</th>
				<th>Salary</th>
				<th>Edit</th>
				<th>Delete</th>
		</tr>
		<c:forEach var="employee" items="${employeeList}">
			<tr>
				<td>${employee.employeeId}</td>
					<td>${employee.firstName}</td>
					<td>${employee.lastName}</td>
					<td>${employee.age}</td>
					<td>${employee.education}</td>
					<td>${employee.salary}</td>
					<td><a
						href="<c:url value='/employee/edit/${employee.employeeId}' />">Edit</a></td>
					<td><a
						href="<c:url value='employee/remove/${employee.employeeId}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="/SpringMVCPaginationExample/viewemp/1">1</a>
	<a href="/SpringMVCPaginationExample/viewemp/2">2</a>
	<a href="/SpringMVCPaginationExample/viewemp/3">3</a>
</body>
</html>