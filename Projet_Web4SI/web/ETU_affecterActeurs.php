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
	
	<div class="Main">
	
	<!-- cr&eacute;er un formulaire -->
	
		<h1>Affecter les acteurs</h1> <br><br>
		<label><i><b>Phase :</b></i></label>
		<select>
			<option>Phase 1</option>
			<option>Phase 2</option>
			<option>Phase 3</option>
		</select><br /><br />
		<label><i><b>T&acirc;che :</b></i></label>
		<select>
			<option>T&acirc;che 1</option>
			<option>T&acirc;che 2</option>
			<option>T&acirc;che 3</option>
			<option>T&acirc;che 4</option>
		</select><br /><br />
		<b> Acteurs : <br> <br>
		D&eacute;veloppeur : </b>
		<select>
			<option>Chlo&eacute; Faure</option>
			<option>Jade Caron</option>
			<option>Jean Roger</option>
		</select><br />
		<b> Analyste : </b>
		<select>
			<option>Jade Caron</option>
			<option>Jean Roger</option>
		</select><br />
		<b> R&eacute;dacteur : </b>
		<select>
			<option>Jean Roger</option>
		</select><br />
		<br><br><br>

			<div class="bouton"><input type="button" onClick="document.location = 'ETU_menuProjet.php'" value="Valider" /></div>

			<div class="bouton"><input type="button" value="Annuler" onclick="history.go(-1)" /></div>
	
	</div>
	
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
	</body>
</html>