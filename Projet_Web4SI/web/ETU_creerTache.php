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
			<h1>Ajouter une tache</h1>
			
			<label><i><b>Phase </b></i></label>
			<select>
				<option>Phase 1</option>
				<option>Phase 2</option>
				<option>Phase 3</option>
			</select><br /><br />
			<label><i><b>Acteurs : </b></i></label></body><br />	<!--Affichage dynamique selon nombre d'acteurs & m&agrave;j options disponibles &agrave; chaque choix-->
			<b>Acteur 1</b> (responsable)
			<select>
				<option value="Chlo&eacute; Faure">Chlo&eacute; Faure</option>
				<option value="Jade Caron" selected="selected">Jade Caron</option>
				<option value="Jean Roger">Jean Roger</option>
				<option value="Robin Gaspard">Robin Gaspard</option>
			</select><br />
			<b>Acteur 2</b> (producteur)
			<select>
				<option value="Chlo&eacute; Faure" selected="selected">Chlo&eacute; Faure</option>
				<option value="Jade Caron">Jade Caron</option>
				<option value="Jean Roger">Jean Roger</option>
				<option value="Robin Gaspard">Robin Gaspard</option>
			</select><br />
			<b>Acteur 3</b> (producteur)
			<select>
				<option value="Chlo&eacute; Faure">Chlo&eacute; Faure</option>
				<option value="Jade Caron">Jade Caron</option>
				<option value="Jean Roger" selected="selected">Jean Roger</option>
				<option value="Robin Gaspard">Robin Gaspard</option>
			</select><br />
			<b>Acteur 4</b> (lecteur)
			<select>
				<option value="Chlo&eacute; Faure">Chlo&eacute; Faure</option>
				<option value="Jade Caron">Jade Caron</option>
				<option value="Jean Roger">Jean Roger</option>
				<option value="Robin Gaspard" selected="selected">Robin Gaspard</option>
			</select><br /><br />
			<label><i><b>Objectif : </b></i></label><?php /*phase.objectif*/ echo "Cerner le perimetre du projet.";?><br /><br />
			<label><i><b>Dates : </b></i></label><br />
			<label><i><b>Debut au plus tot </b></i></label><input type="date" name="deb_au_plus_tot"><br />
			<label><i><b>Debut au plus tard </b></i></label><input type="date" name="deb_au_plus_tard"><br />
			<label><i><b>Fin au plus tot </b></i></label><input type="date" name="fin_au_plus_tot"><br />
			<label><i><b>Fin au plus tard </b></i></label><input type="date" name="fin_au_plus_tard"><br /><br />
			<label><i><b>Duree : </b></i></label><input type="number" style="width:5%;" min="1" /> jour(s)<br /><br />
			<label><i><b>Etat : </b></i></label><br /><br /><select>
							<option value="Aucune" selected="selected">- - -</option> 
							<option value="pascommencee">Non debutee</option>
							<option value="En cours">En cours</option>
							<option value="Terminee">Terminee</option>
							</select><br> <br>
			<label><i><b>Avancement : </b></i></label><input type="number" style="width:5%;" step="10" min="0" max="100">%<br /><br /><br />
			
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_taches.php'" value="Valider"></div>
			
			<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_supprTaches.php'" value="Supprimer"></div>
			
			<div class="bouton"><input type="button" value="Retour" onclick="history.go(-1)"></div>
	</div>
	<div class="hautdroite">
		<a href="unlog.html">D&eacute;connexion</a>
	</div>
	
</body>
</html>
