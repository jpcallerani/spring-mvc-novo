<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmação do Estudante</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName} 
<br><br>
Country: ${student.country }
<br><br>
Favorite Language is: ${student.favoriteLanguage}
<br><br>
</body>
</html>