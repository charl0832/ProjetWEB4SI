
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
	<h1>Visualiser une t&acirc;che</h1>
    
    <b>Phase </b><?php /*phase.nom*/ echo "Analyse";?><br /><br />
    <b>Acteurs</b></body><br />
	<b>Acteur 1 : </b>Robin Gaspard (responsable)<br />
	<b>Acteur 2 : </b>Chlo&eacute; Faure (producteur)<br />
	<b>Acteur 3 : </b>Jade Caron (productrice)<br />
	<b>Acteur 4 : </b>Jean Roger (lecteur)<br /><br />
    <b>Objectif </b><?php /*phase.objectif*/ echo "Cerner le perimetre du projet.";?><br /><br />
    <b>Dates</b><br />
    <b>D&eacute;but au plus t&ocirc;t </b><?php /*phase.datedebut*/echo "24/09/12";?><br />
    <b>D&eacute;but au plus tard </b><?php echo "24/09/2012";?><br />
    <b>Fin au plus t&ocirc;t </b><?php echo "01/10/2012";?><br />
    <b>Fin au plus tard </b><?php /*phase.datefin*/echo "03/10/12";?><br /><br />
    <b>Dur&eacute;e </b><?php /*phase.datefin-phase.datedebut*/ echo "10 jours";?><br /><br />
    <b>Etat </b><?php echo "Termin&eacute;e";?><br /><br />
    <b>Avancement </b><?php echo "100%";?><br /><br /><br />
    <div class="bouton"><input type="button" onClick="document.location='ETU_modifTache.php'" value="Modifier" /></div>
    <div class="bouton"><input type="button" onClick="document.location='ETU_supprTache.php'" value="Supprimer" /></div>
    <div class="bouton"><input type="button" onClick="history.go(-1);" value="Retour" /></div>
	
	</div>
	
	<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
	</div>
		
</body>

</html>
