<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN">
<meta content="no-cache" http-equiv="Content-Type" content="text/html;" charset="UTF-8" />
<html>
	<head>
		<title>Projet de Plateforme Orient&eacute;e Gestion de Projets</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<link rel="stylesheet"  href="/jQuery/jquery.mobile.css" />  
		<link rel="stylesheet" href="/jQuery/jqm-docs.css"/>
		<script src="/jQuery/jQuery.js"></script>
		<script src="/jQuery/jQueryMobile.js"></script>
		
	</head>
	
	<body>
		
		<div id="IndexEtudiant" class="Main">
			
			<h1>Accueil Etudiant</h1>
			<br><br><br>
			<h2>Gestion du projet</h2> <br><br>
			<div class="bouton"><input type="button" value="T&eacute;l&eacute;charger le cahier des charges" onClick="window.location='http://......./fichier.zip';"></div> <br />
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_taches.php'" value="G&eacute;rer les t&acirc;ches"></div> <br />
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_affecterActeurs.php'" value="Affecter les &eacute;tudiants aux acteurs"></div>
			
			<br><br><br>
			<h2>Travailler sur le projet</h2> <br><br>
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_gererDoc.php'" value="G&eacute;rer les documents" /></div> <br />
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_demandes.php'" value="G&eacute;rer les demandes" /></div> <br />
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_modifAvancement.php'" value="G&eacute;rer l'&eacute;tat d'avancement du projet" /></div>
		</div>
		
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>

	</body>
</html>