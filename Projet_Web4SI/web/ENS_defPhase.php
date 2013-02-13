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
		<h1>Etape 2/3 : d&eacute;finition des phases</h1>
			<b>Projet </b>Projet Omega<br />
			<b>Liste </b>Liste Omega<br />
			<br />
			
			<form name="defPhase" action="ENS_DefPhase.php">	<!-- il faut une page interm&eacute;diaire qui, selon le bouton cliqu&eacute; en fin de formulaire, renverra sur paramPhase.php ou terminera la cr&eacute;ation du projet (page r&eacute;capitulative) -->
				<b><u>D&eacute;finition de la phase</u></b>
				<br /><br />
				<table class="phase">
				<tr><td></td><td></td><td></td><td></td></tr>
				<tr>
					<td align="right"><label><i><b>Nom </b></i></label></td>
					<td colspan="3">&nbsp;<input type="text" /></td>
				</tr>
				<tr>
					<td align="right"><label><i><b>Date de d&eacute;but </b></i></label></td>
					<td colspan="3"><input type="date" name="date_debut" /></td>
				</tr>
				<tr>
					<td align="right"><label><i><b>Date de fin </b></i></label></td>
					<td colspan="3"><input type="date" name="date_fin" /></td>
				</tr>
				<tr>
					<td align="right"><label><i><b>Objectifs </b></i></label></td>
					<td colspan="3"><textarea rows="4" cols="50"></textarea></td>
				</tr>
				</table>
				<br /><br /><br />
				
				<b><u>Documents &agrave; rendre</u></b>
				<br /><br />
				<table class="phase">
					<tr><td></td><td></td><td></td><td></td></tr>
					<tr>
						<td align="right"><label><i><b>Nombre de documents </b></i></label></td>
						<td colspan="3"><input type="number" style="width:5%;" name="howmuch" value="0" min="0" /><br /></td> <!-- affichera dynamiquement le bon nombre de descriptions ensuite -->
					</tr>
					<tr>
						<td align="right"><label><b>Document 1 </b></label></td>
						<td colspan="3"></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Nom </b></i></label></td>
						<td colspan="3"><input type="text" /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Forme </b></i></label></td>
						<td colspan="3"><input type="text" /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Format </b></i></label></td>
						<td colspan="3"><input type="text" /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Descriptif </b></i></label></td>
						<td colspan="3"><input type="text" /></td>
					</tr>
				</table>
				<br /><br />
				
				<b><u>Outils &agrave; utiliser</u></b><br /><br />
				<table class="phase">
				<tr><td></td><td></td><td></td><td></td></tr>
					<tr>
						<td align="right"><label><i><b>Nombre d'outils </b></i></label></td>
						<td colspan="3"><input type="number" style="width:5%;" name="howmuch" value="0" min="0" /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Outil 1 </b></i></label></td>
						<td colspan="3"><input type="text" /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Outil 2 </b></i></label></td>
						<td colspan="3"><input type="text" /></td>
					</tr>
				</table>
				<br /><br />
				
				<b><u>Acteurs</u></b><br /><br />
				<table class="phase">
				<tr><td></td><td></td><td></td><td></td></tr>
					<tr>
						<td align="right"><label><i><b>Nombre d'acteurs </b></i></label></td>
						<td colspan="3"><input type="number" style="width:5%;" name="howmuch" value="0" min="0" /><br /></td> <!-- max = nombre d'&eacute;tudiant du groupe -->
					</tr>
					<tr>
						<td align="right"><label><i><b>Acteur 1 </b></i></label></td>
						<td colspan="3"><input type="text" /><br /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>R&ocirc;le 1 </b></i></label></td>
						<td colspan="3"><input type="text" /><br /><br /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Acteur 2 </b></i></label></td>
						<td colspan="3"><input type="text" /><br /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>R&ocirc;le 2 </b></i></label></td>
						<td colspan="3"><input type="text" /><br /><br /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>Acteur 3 </b></i></label></td>
						<td colspan="3"><input type="text" /><br /></td>
					</tr>
					<tr>
						<td align="right"><label><i><b>R&ocirc;le 3 </b></i></label></td>
						<td colspan="3"><input type="text" /><br /><br /><br /></td>
					</tr>
				</table>	
				<br />
				<div class="bouton"><input type="Submit" value="Valider et ajouter une phase" /></div>
			</form>
			<div class="bouton"><input type="Submit" onClick="document.location = 'ENS_recapNewProjet.php'" value="Valider et terminer" /></div>
			</div>
		
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
		</body>
		</html>