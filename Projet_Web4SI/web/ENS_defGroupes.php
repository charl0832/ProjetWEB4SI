<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN">
<meta content="no-cache" http-equiv="Content-Type" content="text/html;" charset="UTF-8" />
<html>
	<head>
		<title>Projet de Plateforme Orient&eacute;e Gestion de Projets</title>
		<link rel="stylesheet" type="text/css" href="style.css"/>
	</head>
	<body>
	
		<div class="Main">
			<h1>D&eacute;finir les groupes d'&eacute;tudiants</h1> <br /><br /><br />
			<b>Affectation des groupes</b>
			<br /><br /><br />

			<form name="DefGroupe" method="post" action="ENS_recapGroupes.xhtml">
			
				<table class="proj">
					<tr>
						<th colspan="3">Nom de l'&eacute;tudiant</th>
						<th>Groupe</th>
					</tr>
					<tr><td></td><td></td><td></td><td></td></tr>
					<tr>
						<td colspan="3">CARON Jade</td>
						<td>
							<select>
							<option value="Groupe1">Groupe 1</option>
							<option value="Groupe2">Groupe 2</option>
							<option value="Groupe3">Groupe 3</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="3">FAURE Chlo&eacute;</td>
						<td>
							<select>
							<option value="Groupe1">Groupe 1</option>
							<option value="Groupe2">Groupe 2</option>
							<option value="Groupe3">Groupe 3</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="3">GASPARD Robin</td>
						<td>
							<select>
							<option value="Groupe1">Groupe 1</option>
							<option value="Groupe2">Groupe 2</option>
							<option value="Groupe3">Groupe 3</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="3">ROGER Jean</td>
						<td>
							<select>
							<option value="Groupe1">Groupe 1</option>
							<option value="Groupe2">Groupe 2</option>
							<option value="Groupe3">Groupe 3</option>
							</select>
						</td>
					</tr>
				</table>
				<br />
				<br />
				<br />
				<div class="bouton"><input type="submit" value="Valider"/></div>
			
			</form>
			
				<div class="bouton"><button value="Annuler" onclick="document.location='ENS_choixPromo.php';" /></div>

		</div>
		
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
	</body>
</html>
