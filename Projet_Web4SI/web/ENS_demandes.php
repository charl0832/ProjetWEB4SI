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
	
	<!-- Pas de bouton de création de demande : aller dans un projet -->
	
		<div class="Main">
			<h1>Demandes des &eacute;tudiants</h1> <br><br>
			<table border="1" class="proj">
				<tr>
					<th>Lue/Non lue</th>
					<th>Date</th>
					<th>Projet</th>
					<th>Type de la demande</th>
					<th>Groupe</th>
					<th>Titre</th>	
				</tr>
				<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
					<td  class="Proj"> <img src="/img/Mail.png">  </td>
					<td  class="Proj"> 18/04/12 18:02 </td>
					<td  class="Proj"> Projet 1 </td>
					<td  class="Proj"> Pour information </td>
					<td  class="Proj"> G1 </td>
					<td  class="Proj"> Modif docA.jpg </td>
				</tr>
				<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
					<td  class="Proj"> <img src="/img/Mail.png">  </td>
					<td  class="Proj"> 16/04/12 16:54 </td>
					<td  class="Proj"> Projet 3 </td>
					<td  class="Proj"> Pour avis </td>
					<td  class="Proj"> G7 </td>
					<td  class="Proj"> Probl&egrave;me sur diagramme </td>
				</tr>
				<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
					<td  class="Proj"> <img src="/img/UnreadMail.png">  </td>
					<td  class="Proj"> 01/04/12 09:04 </td>
					<td  class="Proj"> Projet 1 </td>
					<td  class="Proj"> Pour information </td>
					<td  class="Proj"> G2 </td>
					<td  class="Proj"> Incompatibilit&eacute; </td>
				</tr>
			</table>
			<br><br>

				<div class="bouton"><input type="button" value="Retour" onclick="history.go(-1)" /></div>

		</div>
		
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
	</body>
</html>
