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
		<span style="text-decoration:underline;"><b>D&eacute;tails du document</b></span> <br><br>
		<b>Document : </b> <input type="text" name="document" value="doc1.doc"> <br><br>
		<b>D&eacute;pos&eacute; le : </b> 22/11/12 <br><br>
		<b>Commentaire : </b> <textarea rows="5" cols="40"><?php echo "blabla";?> </textarea> <br><br>
		<b>D&eacute;poser : </b> <input type="file" name="xxx" id="xxx" /> <br><br>
		<label><b>Etat : </b></label>Non d&eacute;finitif<br /><br />
		<label><b>Avancement : </b></label><input type="number" style="width:5%;" min="0" max="100" step="10" />%<br /><br /><br />
	
		<div class="bouton"><input type="Submit" onClick="document.location = 'ETU_gererDoc.php'" value="Valider" /></div>
		<div class="bouton"><input type="button" value="Annuler" onclick="history.go(-1)" /></div>
	
	
	</div>
	
	<div class="hautdroite">
		<a href="unlog.html">D&eacute;connexion</a>
	</div>
	
		
	</body>
</html>