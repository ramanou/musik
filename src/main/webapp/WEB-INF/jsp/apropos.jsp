<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--

-->
<html>
	<head>
		<title>LE MEILLEUR DE LA MUZIK DE TIIR</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="resource/js/jquery.min.js"></script>
		<script src="resource/js/jquery.scrolly.min.js"></script>
		<script src="resource/js/skel.min.js"></script>
		<script src="resource/js/init.js"></script>
		<script src="resource/js/init.js"></script>
		<script src="resource/js/simpleSlideshow.js"></script>
		
			<link rel="stylesheet" href="resource/css/skel.css" />
			<link rel="stylesheet" href="resource/css/style.css" />
			<link rel="stylesheet" href="resource/css/style-wide.css" />
			<link rel="stylesheet" href="resource/css/styleshow.css" />
			
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
					
					<p><b>A PROPOS DE MUSIKLOUD</b></p>
				</header>
				
				<footer style="margin-left:15%;margin-right:15%">
					<a href="#first" class="button scrolly">
						<i>
							 MUSIKLOUD est un Projet du Module IFI dans le cadres de la formation
							 MasterII TIIR à l'UNiversité des Lille 1. <br>
							 Il vise à créer une application web en J2EE utilisant les dernières
							 technologies en matière de sécurité et de standards JAVA.<br>
							 
							 L'objectif est de faire la promotion de jeunes artistes de la musique en créant un réseau
							d’applications web chargé de mettre en avant les réalisations de jeunes talents. 
							<br>
							L'application web réalisé en J2EE se charge de stocker et de partager des informations
							sur les chanteurs ou groupes d'artiste.
						</i>
					</a><br>
					<br>
					
					<a href="#first" class="button scrolly">Liste des différentes Technologies Utilisées</a>
					<br><a href="#first" class="button scrolly">
						<ul>
							<c:forEach items="${technologies}" var="t">
								<li>${t }</li>
							</c:forEach>
						</ul>
					</a>
					<br><br>
					<a href="<c:url value="/ws"/>" class="button scrolly">Cliquez ici pour accéder au WebService</a>
					<br><br>
					<a href="#first" class="button scrolly">Contributeurs: 
						<ul>
							<li>Ramanou BIAOU</li>
							<li></li>
						</ul>
					</a>
					
				</footer>
				<br>
					
				<div id="copyright">
				
				</div>

			</section>
			
		<!-- First -->
			<section id="first" class="main">

			</section>

		
		<!-- Footer -->
			<section id="footer">
				<ul class="icons">
					<li><a href="https://github.com/ramanou/musik.git" class="icon fa-github"><span class="label">GitHub</span></a></li>
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