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
	<h1>G&eacute;rer les t&acirc;ches</h1> <br><br>
		
			
	<label><i><b>Phase :</b></i></label>
		<select>
			<option selected="selected">- - -</option>
			<option>Phase 1</option>
			<option>Phase 2</option>
			<option>Phase 3</option>
		</select><br /><br />
	<br><br><br>
	
	<table border="1" class="proj">
		<tr>
			<th>T&acirc;che n&ordm;</th>
			<th>Etat</th>
			<th>Avancement</th>
		</tr>
		<tr onclick="document.location = 'ETU_gererTache.php';" class="bluehover">
			<td  class="Proj">1</td>
			<td  class="Proj">Termin&eacute;e</td>
			<td  class="Proj">100%</td>
		</tr>
		<tr onclick="document.location = 'ETU_gererTache.php';" class="bluehover">
			<td  class="Proj">2</td>
			<td  class="Proj">En cours</td>
			<td  class="Proj">60%</td>
		</tr>
		<tr onclick="document.location = 'ETU_gererTache.php';" class="bluehover">
			<td  class="Proj">3</td>
			<td  class="Proj">Termin&eacute;e</td>
			<td  class="Proj">100%</td>
		</tr>
		<tr onclick="document.location = 'ETU_gererTache.php';" class="bluehover">
			<td  class="Proj">4</td>
			<td  class="Proj">Planifi&eacute;e</td>
			<td  class="Proj">0%</td>
		</tr>
	</table>
	<br><br>
	
		<div class="bouton"><input type="button" onClick="document.location = 'ETU_creerTache.php'" value="Ajouter une t&acirc;che"> <br /></div>

		<div class="bouton"><input type="button" value="Retour" onclick="history.go(-1)" /></div>

	</div>
	<div class="hautdroite">
		<a href="unlog.html">D&eacute;connexion</a>
	</div>
	
	</body>
</html>