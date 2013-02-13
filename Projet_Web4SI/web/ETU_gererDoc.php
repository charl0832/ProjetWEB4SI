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
		<h1>G&eacute;rer les documents</h1> <br><br>
		<label><i><b>Phase :</b></i></label>
		<select>
			<option>Phase 1</option>
			<option>Phase 2</option>
			<option>Phase 3</option>
		</select><br /><br />
	
		<table border="1" class="proj">
			<tr>
				<th>Nom</th>
				<th>D&eacute;pos&eacute;</th>
				<th>Etat</th>
				<th>Avancement</th>
				<th>Commentaire</th>	
			</tr>
			<tr onclick="document.location = 'detailsDoc.php';" class="bluehover">
				<td  class="Proj">doc1.doc</td>
				<td  class="Proj">Oui</td>
				<td  class="Proj">D&eacute;finitif</td>
				<td  class="Proj">100%</td>
				<td  class="Proj">Descriptif des processus</td>
			</tr>
			<tr onclick="document.location = 'detailsDoc.php';" class="bluehover">
				<td  class="Proj">doc2.jpg</td>
				<td  class="Proj">Oui</td>
				<td  class="Proj">Non d&eacute;finitif</td>
				<td  class="Proj">60%</td>
				<td  class="Proj">Diagramme provisoire</td>
			</tr>
		</table>
		<br/><br/><br/>

		<div class="bouton"><input type="button" value="Retour" onclick="history.go(-1)" /></div>
		
	</div>
	
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
	</body>
</html>