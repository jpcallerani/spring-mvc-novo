<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário do Estudante</title>
	<style type="text/css">
		.error {color: red}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student"> 
		First name: <form:input path="firstName" maxlength="50" />
		<br>
		<br>
		Last name (*): <form:input path="lastName" maxlength="50" />
					   <form:errors path="lastName" cssClass="error"/>
		<br>
		<br>
		<form:select path="country">
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="India" label="India"></form:option>
		</form:select>
		<br>
		<br>
			JAVA<form:radiobutton path="favoriteLanguage" value="Java" />
			C#<form:radiobutton path="favoriteLanguage" value="C#" />
			PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
			RUBY<form:radiobutton path="favoriteLanguage" value="Ruby" />
		<br>
		<br>
		Idade (*): <form:input path="age" maxlength="3" />
					   <form:errors path="age" cssClass="error"/>		
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>