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
		<script src="resource/js/jquery.min.js"></script>
		<script src="resource/js/jquery.scrolly.min.js"></script>
		<script src="resource/js/skel.min.js"></script>
		<script src="resource/js/init.js"></script>
		
			<link rel="stylesheet" href="resource/css/skel.css" />
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
				</header>
				<footer>
					<a href="#first" class="button scrolly">Authentification ADMIN</a>
				</footer>
				
				<form  name="f" action="<c:url value='j_spring_security_check' />"
						method="post" style="width:30%;margin:auto;padding-bottom:8px;" >

				<c:if test="${isLoginError}">
					<div class="errorblock">
						Vos informations d'authentifications ne sont pas correct <br /> Raison :
						<span style="color:#E83C1A;"> ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
					</div>
				</c:if>

		<table>
			<tr>
				
				<td><p style="text-align:center;">Utilisateur<input type="text" name="j_username" /></p></td>
			</tr>
			<tr>
				
				<td><p style="text-align:center;">Mot de Passe<input type="password" name="j_password" /></p></td>
			</tr>

			<tr>
				
				<td colspan="2">
					<p style="text-align:center;width:auto;margin:auto;">
					<input name="submit" type="submit" value="Valider" />
					</p>
				</td>
			</tr>
		</table>
</form>
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
						<li><a href="/MusikKloud/"> Accueil </a></li>
						<li><a href="biaou.net">  Liste de Musiques </a></li>
						<li><a HREF="admin.jsp"> Admin-LogIn </a></li>
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
