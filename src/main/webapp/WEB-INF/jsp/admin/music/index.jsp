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
	<form:form method="POST" modelAttribute="music" action="">
		<p>
			Durée
			<form:input path="duration" />

			Titre
			<form:input path="title" />

			Source
			<form:input path="filePath" />

			Artiste
			<form:select path="person.id">
				<c:forEach var="p" items="${persons}">
					<form:option value="${p.id}">
						<c:out value="${p.name} ${p.firstname}" />
					</form:option>
				</c:forEach>
			</form:select>
			<input type="submit" value="Ajouter" />
		</p>
	</form:form>

	<ul>
		<c:forEach items="${personsWithMusics}" var="p">
			<li>${p.firstname } ${p.name }
				<ul>
					<c:forEach items="${p.musics}" var="m">
					<li>${m.id} ${m.duration} ${m.title} : ${m.filePath} <a href="<c:url value="/admin/music/delete/${m.id}" />" >Supprimer</a></li>
			</c:forEach>
				</ul>
			</li>
		</c:forEach>
	</ul>

</body>
</html>
