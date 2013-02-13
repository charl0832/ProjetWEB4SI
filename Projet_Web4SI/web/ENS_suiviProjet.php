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
		<h1>Suivi du projet Alpha</h1>
		
		<select>
			<option selected>- - -</option>
			<option>Groupe 1</option>
			<option>Groupe 2</option>
			<option>Groupe 3</option>
		</select>

		<select>
			<option selected>- - -</option>
			<option>Phase 1</option>
			<option>Phase 2</option>
			<option>Phase 3</option>
		</select>
		
		<br /><br /><br />
		
		Avancement : Termin&eacute;e (100%)<br />
		<h3>Documents</h3>
		<a>doc1.doc</a> - D&eacute;finitif (100%)<br />
		<a>doc2.jpg</a> - Non d&eacute;finitif (60%)<br />
		<h3>Acteurs</h3>
		Responsable : Jade Caron<br />
		Producteur : Robin Gaspard<br />
		Producteur : Jean Roger<br />
		Lecteur : Chlo&eacute; Faure<br /><br />
		<h3>Demandes des &eacute;tudiants</h3>
		<table border="1" class="proj">
			<tr>
				<th>Date</th>
				<th>Type de la demande</th>
				<th>Par</th>
				<th>Titre</th>	
			</tr>
			<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
				<td  class="Proj"> <?php echo "18/04/12 18:02";?> </td>
				<td  class="Proj"> <?php echo "Pour information";?> </td>
				<td  class="Proj"> <?php echo "Jade Caron";?> </td>
				<td  class="Proj"> <?php echo "Modif docA.jpg";?> </td>
			</tr>
			<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
				<td  class="Proj"> <?php echo "16/04/12 16:54";?> </td>
				<td  class="Proj"> <?php echo "Pour avis";?> </td>
				<td  class="Proj"> <?php echo "Chlo&eacute; Faure";?> </td>
				<td  class="Proj"> <?php echo "Probl&egrave;me sur diagramme";?> </td>
			</tr>
			<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
				<td  class="Proj"> <?php echo "01/04/12 09:04";?> </td>
				<td  class="Proj"> <?php echo "Pour information";?> </td>
				<td  class="Proj"> <?php echo "Robin Gaspard";?> </td>
				<td  class="Proj"> <?php echo "Incompatibilit&eacute;";?> </td>
			</tr>
		</table>
		<br />
		
		<br /><br /><br />
		<h3>Echanges entre &eacute;tudiants</h3>
		<table border="1" class="proj">
			<tr>
				<th>Date</th>
				<th>Type de la demande</th>
				<th>Par</th>
				<th>Titre</th>	
			</tr>
			<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
				<td  class="Proj"> <?php echo "16/04/12 21:10";?> </td>
				<td  class="Proj"> <?php echo "Pour information";?> </td>
				<td  class="Proj"> <?php echo "Jade Caron";?> </td>
				<td  class="Proj"> <?php echo "Document A : j'ai fait des modifs...";?> </td>
			</tr>
			<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
				<td  class="Proj"> <?php echo "10/04/12 12:54";?> </td>
				<td  class="Proj"> <?php echo "Pour avis";?> </td>
				<td  class="Proj"> <?php echo "Jean Roger";?> </td>
				<td  class="Proj"> <?php echo "Diagramme de classes : ???";?> </td>
			</tr>
			<tr onclick="document.location = 'consulterDemande.php';" class="bluehover">
				<td  class="Proj"> <?php echo "01/04/12 09:04";?> </td>
				<td  class="Proj"> <?php echo "Pour information";?> </td>
				<td  class="Proj"> <?php echo "Robin Gaspard";?> </td>
				<td  class="Proj"> <?php echo "RDV ce weekend pour avancer le projet ? Avec des binouzes ! :)";?> </td>
			</tr>
		</table>
		
		<br />
		<div class="bouton"><input type="button" value="Envoyer une demande aux &eacute;tudiants" onclick="ENS_creerDemande.php" /></div>
	
		<br /><br /><br />
		
		<div class="bouton"><input type="button" value="Retour" onclick="history.go(-1)" /></div>
	
	</div>
	
	<div class="hautdroite">
		<a href="unlog.html">D&eacute;connexion</a>
	</div>
	
		
	</body>
</html>