<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@page session="true"%>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
liste des  reclamations

<table border="1">
										<c:forEach items="${list}" var="abs">
												<tr>
													<td><c:out value="${abs.email}" /></td>
													<td><c:out value="${abs.objet}" /></td>
													<td><c:out value="${abs.description}" /></td>
													
												</tr>
										</c:forEach>
</table>
</body>
</html>