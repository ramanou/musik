<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>LE MEILLEUR DE LA MUZIK DE TIIR</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="<c:url value="/resource/js/jquery.min.js"/>" ></script>
		<script src="<c:url value="/resource/js/jquery.scrolly.min.js"/>" ></script>
		<script src="<c:url value="/resource/js/skel.min.js"/>" ></script>
		<script src="<c:url value="/resource/js/init.js"/>" ></script>
		
			<link rel="stylesheet" href="<c:url value="/resource/css/skel.css"/>" />
			<link rel="stylesheet" href="<c:url value="/resource/css/style.css"/>" />
			<link rel="stylesheet" href="<c:url value="/resource/css/style-wide.css"/>" />

		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
	</head>

<body>
	
		<!-- Header -->
				<section id="header" class="dark">
				<header>
					<h1><b>MUZIKLOUD</b> LE MEILLEUR DE LA MUZIK DE TIIR</h1>
					<p>Espace de Management des Musiques  </p> 
					<p> <b><a href="<c:url value="/admin/manage" />" ><span class="label">Accueil ADMIN | </span></a>
						<a href="<c:url value="/admin/useradmin" />" ><span class="label">Ajouter Admin | </span></a>
						<a href="<c:url value="/admin/artist" />" ><span class="label">Ajouter Artiste | </span></a>
						<a href="<c:url value="/admin/music" />" ><span class="label">Gérer les Musiques | </span></a>
						<c:url var="logoutUrl" value="/j_spring_security_logout" />
						<a href="${logoutUrl}"><span class="label"> Deconnexion | </span></a></b></p>
			
					<p>Ajoutez ici des Administrateurs pour Muzikloud</p>
				</header>
			</section>
			<section style="margin-left:30%;margin-right:30%;">
				<form:form method="POST" modelAttribute="useradmin" action="">
					<form:errors path="*" />
					User-Name<form:input path="userName" />
					Password<form:input path="password" />
					<input type="submit" value="Ajouter" />
				</form:form>
				<hr>
				<p><b>Liste des Administrateurs</b></p>
				<hr>
				
				<ul>
					<c:forEach items="${usersadmin}" var="p">
						
						<li> * <b>N°</b>${p.id} <b>UserName: </b> ${p.userName} <b>Mot de Passe: </b>*********<a href="<c:url value="/admin/useradmin/delete/${p.id}"/>"> <b style="background:#641A02;"> Supprimer </b> </a></li>
					</c:forEach>
				</ul>
			</section>
<!-- Footer -->
			<section id="footer">
				<ul class="icons">
					<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
				</ul>

				<div class="copyright">
					<ul class="menu">
						<li><a href="<c:url value="/" />"> Accueil </a></li>
						<li><a href="<c:url value="/list" />">  Liste de Musiques </a></li>
						<li><a HREF="<c:url value="/login" />"> Admin-LogIn </a></li>
						<li><a href="<c:url value="/about" />"> A Propos </a></li>
					</ul>
				</div>
				<div class="copyright">
					<ul class="menu">
						<li>&copy; Muzikloud-TIIR-IFI 2014</li>
					</ul>
				</div>
			</section>
	</body>
</html>
