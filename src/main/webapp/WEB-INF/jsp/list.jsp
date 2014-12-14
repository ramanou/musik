<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--

-->
<html>
	<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<title>MUSIKLOUD Liste</title>
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="resource/js/jquery.min.js"></script>
		<script src="resource/js/jquery.scrolly.min.js"></script>
		<script src="resource/js/skel.min.js"></script>
		<script src="resource/js/init.js"></script>
		
			<link rel="stylesheet" href="resource/css/style.css" />
			<link rel="stylesheet" href="resource/css/style.css" />
			<link rel="stylesheet" href="resource/css/style-wide.css" />
		
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
	</head>
	<body>

		<!-- Header -->
			<section id="header" class="dark">
				<header>
					<h1><b>MUZIKLOUD</b> LE MEILLEUR DE LA MUZIK DE TIIR</h1>
					<a href="<c:url value="/" />" class="button scrolly">Accueil</a>
					<a href="<c:url value="/list" />" class="button scrolly">Liste de Musiques</a>
					<a href="<c:url value="/login" />" class="button scrolly">Admin-LogIn</a>
					<a href="<c:url value="/about" />" class="button scrolly">A Propos</a>
					<p>Ecoutez la musique sans limitation avec <a href="">MUZIKLOUD</a></p>
				</header>
				<footer>
					<a href="#first" class="button scrolly">Notre Musique votre plaisir</a><br><br>
								<c:set var="actionURL"><c:url value="/search" /></c:set>
								<form:form method="POST" modelAttribute="searchMusicWrapper" action="${actionURL}">
									<form:input path="musicTitle" style="text-align:center;width:60%;height:5%;margin:auto;" type="text" name="nom" value="Recherche de musique Ici" /> <br> 
									<input type="submit" style="text-align:center;" type="submit" name="Rechercher" value="Rechercher"/>
								</form:form>
				</footer>
				<hr>
				
				<div id="">
					<ul class="menu"  >
						<c:forEach items="${musics}" var="p">
							<li >
							<p >${p.title} (${p.person.name} ${p.person.firstname}) </p>
								<audio controls> 
									<source src="${p.filePath} " />
								</audio>
							<br />
							<p style="color:#69003F;font-size:10pt;" ><span><i>Les Commentaires de cette Musique</i></span></p>
						<c:forEach items="${p.comments }" var="comment">
							<p class="commentaire">
							<span style="color:#052B30;font-size:9pt;"> Auteur IP: <b>${comment.inetAdress}</b></span><br>
							<span style="color:#CDDE47;font-size:10pt;background:#666;"><i>${comment.content}</i></span><br>
						 		---------------------------------------------
						 	</p>
						 	</c:forEach>
						 	</li>

						 	<li>
						 			
									<c:set var="actionURL"><c:url value="/comment" /></c:set>
								<form:form method="POST" modelAttribute="musicComment" action="${actionURL }" >
									<form:hidden path="music.id" value="${p.id }"/>
									<form:input path="content" style="text-align:center;width:100%;height:20%;margin:auto;" value="Votre commentaire Ici" /> <br> 
									<form:select path="mark" items="${markValues }" class="rating" />
									<input type="submit" style="text-align:center;" type="submit" name="Valider" value="Commentez"/>
								</form:form>
							</li>
							<hr>
						</c:forEach>
					</ul>
				</div>

			</section>
			
		<!-- First -->
			<section id="first" class="main">
				
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