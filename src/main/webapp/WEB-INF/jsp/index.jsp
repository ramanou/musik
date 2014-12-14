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
					<p>Ecoutez la musique sans limitation avec <a href="">MUZIKLOUD</a></p>
				</header>
				<footer>
					<a href="#first" class="button scrolly">Notre Musique, votre plaisir</a><br><br>
					<a href="#first" class="button scrolly">Ecoutez et RE-écoutez nos 3 Meilleures Sélection sur MUZIKLOUD</a>
				</footer>
				<br>
				
				<div id="copyright">
					<ul class="menu">
						<li id="slideshow">
							<p>	Savoir+ sur d'autres sites<br />
								<a href="#"><img id="imgSlide" width="400" height="200" /></a>
							
						</li>
						
						<li>
						<c:forEach items="${musics}" var="p">
							<p>${p.title} ${p.person} </p>
							<audio controls> 
								<source src="${p.filePath} " />
							</audio>
							<br />
					 	</c:forEach>
					 	</li>
					</ul>

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