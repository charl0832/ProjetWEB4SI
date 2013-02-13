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
		
		<h1>R&eacute;capitulatif de la demande</h1><br /><br />
		<table class="message">
			<tr>
				<td align="right">Projet : </td><td><?php echo "Projet A"; ?></td>
			</tr><tr>
			<tr>
				<td align="right">Phase : </td><td><?php echo "Phase 1"; ?></td>
			</tr><tr>
			<tr>
				<td align="right">T&acirc;che (optionnel) : </td><td><?php echo "T&acirc;che 1"; ?></td>
			</tr><tr>
				<td align="right"><h3>A : </h3></td><td><?php echo "Robin Gaspard"; ?></td>
			</tr><tr>		
				<td align="right">Type : </td><td><?php echo "Pour information"; ?></td>
			</tr><tr>		
				<td align="right">Sujet : </td><td><?php echo "Phase 1"; ?></td>	
		</table>
		<h3>Message :</h3>
		<textarea cols="40" rows="10" readonly="true">
		Bonjour,
		
		Depuis hier, nous sommes dans l'incapacit&eacute; de nous connecter &agrave; la base que vous nous avez octroy&eacute;e.
		Pouvez-vous faire le n&eacute;cessaire ?
		
		Merci
		
		Cordialement</textarea>

		<h3>Documents joints : </h3> Aucun
		<br><br><br>
		
		<div class="bouton"><input type="button" onClick="document.location = 'ENS_demandes.php'" value="Valider" /></div>
		
	
	</div>
	
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
	
		
	</body>
</html>