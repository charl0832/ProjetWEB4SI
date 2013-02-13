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
	
		<script language="Javascript">
			function nextPage(){
				nextPage = window.document.getElementById("select").value;
				if (nextPage == "---"){document.location="ENS_defGroupes.php";}
				else {document.location="ENS_defPhase.php";}
			}	
		</script>
	
	</head>
	
	<body>

	<div class="Main">
<h1>Etape 1/3 : nom, promotion et groupes d'&eacute;tudiants</h1>
		
		<div>
		<!-- Si liste sélectionnée : Ens_defPhase.php, sinon ENS_defGroupes.php-->
			<form action="ENS_defPhase.php" method="POST">
			Nom du projet : <input type="text" name="Project" /><br /><br />
			Promo :
				<select>
					<option>- - -</option>
					<option>Promo 1</option>
					<option>Promo 2</option>
					<option>Promo 3</option>
				</select>
			<br />
			Liste des groupes
			Choisir une liste existante :
				<select id="select">
					<option value="---" selected>- - -</option>
					<option value="Liste1">Liste 1</option>
					<option value="Liste2">Liste 2</option>
				<select>
			<br />
			<b>Ou</b><br /><br />
			Cr&eacute;er une liste de groupes : <input type="text" name="Groupe" value="Nom de la liste" />
			<br />
			<div class="bouton"><button onclick="nextPage()" value="Valider et cr&eacute;er les phases" /></div>
			</form>
			<br><br><br>
		</div>
		
		</div>
		
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
		
		</body>
		</html>