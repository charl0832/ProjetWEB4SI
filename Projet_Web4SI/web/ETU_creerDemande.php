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
			<form name="new_demande" action="recapDemande.php">
			
				<h1>Nouvelle demande</h1></span> <br /><br /><br />
                                   
				<table class="phase">
				
					<tr><td></td><td></td><td></td><td></td></tr>
					
					<tr>
						<td colspan="4">
							<b>Phase :</b>
							<select>
							<option value="Phase 1" selected>Phase 1</option>
							<option value="Phase 2">Phase 2</option>
							<option value="Phase 3">Phase 3</option>
							<option value="Phase 4">Phase 4</option>
							</select>
						</td>
					</tr>
					
					<tr>
						<td colspan="4">
							<b>T&acirc;che (optionnel) : </b>
							<select>
							<option value="Aucune" selected>- - -</option> 
							<option value="Tache 1">Tache 1</option>
							<option value="Tache 2">Tache 2</option>
							<option value="Tache 3">Tache 3</option>
							</select> 
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<br/><br />
							Envoyer &agrave; :
							<br /><br />
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="radio" name="choix" value="tous"> Tous les membres du groupe
							<br /><br />
							<input type="radio" name="choix" value="tous"> A l'enseignant
						</td>
						<td colspan="2">
							<br />
							<input type="radio" name="choix" value="certains"> Certains 
							<br /><br />
							<input type="checkbox" />Chlo&eacute; Faure
							<input type="checkbox" />Jade Caron
							<input type="checkbox" />Jean Roger
							<input type="checkbox" />Robin Gaspard
							<br />
						</td>
					</tr>	
					<tr>
						<br /><br />
						<td colspan="4"><b>Type : </b></td>
						<br /><br />
					</tr>
					<tr>
						<td colspan="2">
						<br />
							<input type="radio" name="choix" value="info" />Pour information
							<input type="radio" name="choix" value="avis" />Pour avis
						<br />
						</td>
						<td colspan="2">
						<br />
							<input type="radio" name="choix" value="validation" />Pour validation
							<input type="radio" name="choix" value="realisation" />Pour r&eacute;alisation
						<br />
						</td>
					</tr>
					<tr>
						<td><b>Sujet : </b></td>
						<td colspan="3"><br /><input type="text" name="sujet" /> <br><br></td>
					</tr>
					<tr>
						<td><b>Message : </b></td>
						<td colspan="3"><textarea rows="5" cols="20"></textarea> <br><br></td>
					</tr>
					<tr>
						<td colspan="2"><b>Documents joints : </b><br></td>
						<td colspan="2">
							<b>Doc 1 : </b><input type="file" name="xxx" id="xxx" /><br />
							<b>Doc 2 : </b><input type="file" name="xxx" id="xxx" /><br /><br />
						</td>
					</tr>
				</table>
				<div class="bouton"><input type="Submit" value="Valider"></div> <br /><br />
			</form>
		<div class="bouton"><input type="button" value="Annuler" onclick="history.go(-1)" /></div>
	</div>
	
	<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
	</div>
		
	</body>
</html>