<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"><meta content="no-cache" http-equiv="Content-Type" content="text/html;" charset="UTF-8" /><html>	<head>		<title>Projet de Plateforme Orient&eacute;e Gestion de Projets</title>		<link rel="stylesheet" type="text/css" href="style.css">		<link rel="stylesheet"  href="/jQuery/jquery.mobile.css" />  		<link rel="stylesheet" href="/jQuery/jqm-docs.css"/>		<script src="/jQuery/jQuery.js"></script>		<script src="/jQuery/jQueryMobile.js"></script>	</head>	<body>	<div class="Main">		<h1>Consulter une demande</h1> <br><br><br>		<table class="message" border="none">			<tr>				<td align="right">De :</td><td><?php echo "Jean Roger"; ?></td>			</tr><tr>				<td align="right"><h3>Projet :</h3></td><td><?php echo "Projet 1"; ?></td>			</tr><tr>						<td align="right">Date :</td><td><?php echo "10/11/12"; ?></td>			</tr><tr>						<td align="right">Phase :</td><td><?php echo "Phase 1"; ?></td>			</tr><tr>						<td align="right">T&acirc;che :</td><td><?php echo "T&acirc;che 2" ;?></td>			</tr><tr>						<td align="right">Type :</td><td><?php echo "Pour information";?><br>			</tr><tr>						<td align="right">Sujet :</td><td><?php echo "Probl&egrave;me sur la base"; ?></td>			</tr>		</table>		<h3>Message :</h3>		<textarea cols="40" readonly="true" rows="10" readonly="true">		Bonjour,				Depuis hier, nous sommes dans l'incapacit&eacute; de nous connecter &agrave; la base que vous nous avez octroy&eacute;e.		Pouvez-vous faire le n&eacute;cessaire ?				Merci				Cordialement</textarea>		<h3>Documents li&eacute;s : </h3><?php echo "Preuve.gif"; ?> <div class="bouton"><input type="button" value="T&eacute;l&eacute;charger" /></div>		<br><br><br>		<div class="bouton"><input type="Submit" onClick="document.location = 'creerDemande.php'"value="R&eacute;pondre" /></div>				<div class="bouton"><input type="button" value="Fermer" onclick="history.go(-1)"></div>		</div>				<div class="hautdroite">			<a href="unlog.html">D&eacute;connexion</a>		</div>			</body></html>