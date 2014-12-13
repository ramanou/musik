<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Administration</title>
</head>
<body>
	<ul>
	<c:forEach items="${persons}" var="p">
		
		<li>${p.name} ${p.firstname} <a href="<c:url value="/admin/artist/delete/${p.id}"/>">Delete</a></li>
	</c:forEach>
	</ul>
	<form:form method="POST" modelAttribute="person" action="">
		<form:errors path="*" />
		Nom Prénom<form:input path="name" />
		Nom d'artiste<form:input path="firstname" />
		<input type="submit" value="Ajouter" />
	</form:form>
</body>
</html>
