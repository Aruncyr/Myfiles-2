<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation Form</title>
</head>
<body>
	<h3>Railway Reservation Form</h3>
	<form:form action="submitForm" modelAttribute="reservation">  
        First name: <form:input path="firstName" />
		<br>
		<br>  
        Last name: <form:input path="lastName" />
		<br>
		<br>
		Gender:   
        Male <form:radiobutton path="Gender" value="Male" />  
        Female <form:radiobutton path="Gender" value="Female" />
		<br>
		<br>
		Meals:
		BreakFast<form:checkbox path="Food" value="BreakFast" />
		Lunch<form:checkbox path="Food" value="Lunch" />
		Dinner<form:checkbox path="Food" value="Dinner" />
		<br>
		<br>
		Leaving from:<form:select path="cityFrom">
		<form:option value="Ghaziabad" label="Ghaziabad"/>
		<form:option value="Modinagar" label="Modinagar"/>
		<form:option value="Meerut" label="Meerut"/>
		<form:option value="Amritsar" label="Amritsar"/>
		</form:select><br><br>
		Going to:<form:select path="cityTo">
		<form:option value="Ghaziabad" label="Ghaziabad"/>
		<form:option value="Modinagar" label="Modinagar"/>
		<form:option value="Meerut" label="Meerut"/>
		<form:option value="Amritsar" label="Amritsar"/>
		</form:select><br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>