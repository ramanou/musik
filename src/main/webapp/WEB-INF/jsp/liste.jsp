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
					<p>Ecoutez la musique sans limitation avec <a href="">MUZIKLOUD</a></p>
				</header>
				<footer>
					<a href="#first" class="button scrolly">Notre Musique votre plaisir</a><br><br>
					<a href="#first" class="button scrolly">Ecoutez et RE-écouter notre 3 Meilleures Sélection sur MUZIKLOUD</a>
				</footer>
				<br>
				
				<div id="copyright">
					<ul class="menu">
						<c:forEach items="${musics}" var="p">
							<li>
							<p>${p.title} ${p.person} </p>
								<audio controls> 
									<source src="${p.filePath} " />
								</audio>
							<br />

							<p class="commentaire"><b>Biaou</b><br>

						 		Cette Musique est un Choc <br>
						 		---------------------------------------------
						 	</p>

						 	<p class="commentaire"><b>Appréciations</b><br>

						 		POINTPOINTPOINTPOINTPOINT <br>
						 		---------------------------------------------
						 	</p>
						 	</li>

						 	<li>
						 			
									<form:form method="POST" modelAttribute="music" action="commentaire.jsp" name="firstForm">
									<form:input path="duration" style="text-align:center;width:120%;height:5%;margin:auto;" type="text" name="nom" value="Votre nom ici" /> <br> 
									<form:input path="duration" style="text-align:center;width:120%;height:10%;margin:auto;" type="text" name="commentaire" value="Votre commentaire ici" /> <br> 
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
					<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
					<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
					<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
				</ul>

				<div class="copyright">
					<ul class="menu">
						<li><a href="/MusikKloud/"> Accueil </a></li>
						<li><a href="biaou.net">  Liste de Musiques </a></li>
						<li><a HREF="/MusikKloud/login"> Admin-LogIn </a></li>
						<li><a href="biaou.net"> A Propos </a></li>
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