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
	<c:forEach items="${musics}" var="p">
		
		<li>
			${p.id} ${p.duration} ${p.title} ${p.person} ${p.filePath} 
		
			<audio controls> 
				<source src="${p.filePath} " />
			</audio>
			<a href="<c:url value="/admin/music/delete/${p.id}"/>">Supprimer cette Musique</a>
			
		</li>
	</c:forEach>
	</ul>
	<form:form method="POST" modelAttribute="music" action="">
	<p>
	Durée<form:input path="duration" />
	 
	Titre<form:input path="title" /> 

	Source<form:input path="filePath" /> 
	<input type="submit" value="Ajouter" />
	</p>
	</form:form>
</body>
</html>
