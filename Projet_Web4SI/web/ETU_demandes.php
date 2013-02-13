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
			<h1>G&eacute;rer les demandes</h1> <br><br>
			<table border="1" class="proj">
				<tr>
					<th>Lue/Non lue</th>
					<th>Date</th>
					<th>Projet</th>
					<th>Type de la demande</th>
					<th>Par</th>	<!-- c&ocirc;t&eacute; &eacute;tudiant : envoy&eacute; par un autre &eacute;tudiant du même groupe, ou par le prof -->
					<th>Titre</th>	
				</tr>
				<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
					<td  class="Proj"> <img src="/img/Mail.png">  </td>
					<td  class="Proj"> <?php echo "18/04/12 18:02";?> </td>
					<td  class="Proj"> <?php echo "Projet 1";?> </td>
					<td  class="Proj"> <?php echo "Pour information";?> </td>
					<td  class="Proj"> <?php echo "Robin Gaspard";?> </td>
					<td  class="Proj"> <?php echo "Modif docA.jpg";?> </td>
				</tr>
				<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
					<td  class="Proj"> <img src="/img/Mail.png">  </td>
					<td  class="Proj"> <?php echo "16/04/12 16:54";?> </td>
					<td  class="Proj"> <?php echo "Projet 3";?> </td>
					<td  class="Proj"> <?php echo "Pour avis";?> </td>
					<td  class="Proj"> <?php echo "Robin Gaspard";?> </td>
					<td  class="Proj"> <?php echo "Probl&egrave;me sur diagramme";?> </td>
				</tr>
				<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
					<td  class="Proj"> <img src="/img/UnreadMail.png">  </td>
					<td  class="Proj"> <?php echo "01/04/12 09:04";?> </td>
					<td  class="Proj"> <?php echo "Projet 1";?> </td>
					<td  class="Proj"> <?php echo "Pour information";?> </td>
					<td  class="Proj"> <?php echo "Jade Caron";?> </td>
					<td  class="Proj"> <?php echo "Incompatibilit&eacute;";?> </td>
				</tr>
			</table>
			<br><br>
			
			<br><br><br>

				<div class="bouton"><button onClick="document.location = 'ETU_creerDemande.php'" value="Cr&eacute;er une nouvelle demande"></button></div>
				<div class="bouton"><button onclick="history.go(-1)" value="Retour"></button></div>

		</div>
		
		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>
		
	</body>
</html>
