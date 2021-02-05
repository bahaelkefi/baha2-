<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@page session="true"%>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form commandName="Reclamation" method="POST" action="reclamationValidation">
<input type="hidden" name="id" />
<table>
	
	<tr>
		<td>E-MAIL</td>
		<td><input type="text" name="email" /></td>
	 </tr>
	<tr>
		<td>Objet</td>
		<td><input type="text" name="objet" /></td>
	 </tr>
	 
	 <tr>
		<td>Description</td>
		<td> <textarea rows="" cols="" name="description" ></textarea> </td>
	 </tr>
	 
	 <tr>
	 	<td><input type="submit"  value="envoyer" /></td>
	 	<td><input type="reset" value="Effacer" /></td>
	 </tr>
	 
</table>
</form>
</body>
</html>