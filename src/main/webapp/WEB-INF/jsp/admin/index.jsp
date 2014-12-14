<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

						<c:url value="/logout" var="logoutUrl" />
						<form action="${logoutUrl}" method="post" id="logoutForm" />
		<!-- Header -->
			<section id="header" class="dark">
				<header>
					<h1><b>MUZIKLOUD</b> LE MEILLEUR DE LA MUZIK DE TIIR</h1>
					<p>Espace de Management des Musiques  </p> 
					<p> <b><a href="#" ><span class="label">Ajouter un Admin | </span></a>
						<a href="<c:url value="/admin/artist" />" ><span class="label">Ajouter Artiste | </span></a>
						<a href="<c:url value="/admin/music" />" ><span class="label">Gérer les Musiques | </span></a>
						
						<a href="javascript:formSubmit()"><span class="label"> Deconnexion | </span></a></b></p>
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
						<li><a href="biaou.net"> Accueil | </a></li>
						<li><a href="biaou.net">  Liste de Musiques | </a></li>
						<li><a href="biaou.net"> Admin-LogIn | </a></li>
						<li><a href="biaou.net"> A Propos | </a></li>
					</ul>
				</div>
				<div class="copyright">
					<ul class="menu">
						<li>&copy; Muzikloud-TIIR-IFI 2014</li>
					</ul>
				</div>
			</section>

	</body>
	<script>
	function formSubmit() {
		document.getElementById("logoutForm").submit();
	}
	</script>	
</html>