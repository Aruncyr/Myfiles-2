<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error {
	color: red
}
</style>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Viewpage</title>
</head>
<body>

<!--this form is for only custom validation example..  -->
<form:form action="helloagain" modelAttribute="emp">  
        Username: <form:input path="name" />        
        <br><br>  
          
        Password (*): <form:password path="password" />  
        <form:errors path="password" Class="error" />  
        <br><br>  
          
        Age (*): <form:input path="age" />  
        <form:errors path="age" Class="error" />  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
    
    <!--this below form is for 1,2,3,examples only.  -->
	<%-- <form:form action="helloagain" modelAttribute="emp">  
Username: <form:input path="name" />
		<br>
		<br>  
Password: <form:password path="pass" />
		<form:errors path="pass" cssClass="error" />
		<br>
		<br>  
Age: <form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form> --%>
</body>
</html>