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
			<h1>Modification d'une t&acirc;che</h1> <br><br>
			<b>Phase : </b><?php echo "Phase 1";?> <br><br>
			<center>
				<TABLE>
					<TR>
						<TH> Acteurs : </TH>
						<TD> <input type="text" name="User" value="<?php echo "D&eacute;veloppeur";?>"></input> </TD>		
					</TR>
					<TR>
						<TD/>
						<TD> <input type="text" name="User" value="<?php echo "Analyste";?>"></input> </TD>
					</TR>
					<TR>
						<TD/>
						<TD> <input type="text" name="User" value="<?php echo "R&eacute;dacteur";?>"></input> </TD>
					</TR>
					<TR>
						<TD/>
						<TD> <input type="text" name="User"></input> </TD>
					</TR>
				</TABLE> 
			</center>
			<br><br>
			<b>Objectif : </b><input type="text" name="User" value="<?php echo "R&eacute;aliser une diagramme de classes";?>" size=50></input>
			<br><br>
			<center>
				<TABLE class="proj">
					<TR>
						<TH colspan="3"> Dates : </TH>
					</TR>
					<TR>
						<TD> d&eacute;but </TD>
						<TD> au plus t&ocirc;t : </TD>
						<TD> <input type="date" name="deb_au_plus_tot" value="2012-10-10"> </TD>
					</TR>
					<TR>
						<TD/>
						<TD> au plus tard : </TD>
						<TD> <input type="date" name="deb_au_plus_tard" value="2012-10-12"></TD>
					</TR>
					<TR> 
						<TD> fin </TD>
						<TD> au plus t&ocirc;t : </TD>
						<TD> <input type="date" name="fin_au_plus_tot" value="2012-12-10"></TD>
					</TR>
					<TR>
						<TD/>
						<TD> au plus tard : </TD>
						<TD> <input type="date" name="fin_au_plus_tard" value="2012-12-12"></TD>
					</TR>
				</TABLE> 
			</center>
			<br>
			<b>Dur&eacute;e : </b> <input type="text" name="User" value="<?php echo "2 mois";?>"></input>  <br><br>
			<label><b>Etat : </b></label>
				<div class="bouton">
					<select>
					<option value="pascommencee">Non debut&eacute;e</option>
					<option value="En cours" selected="selected">En cours</option>
					<option value="Terminee">Termin&eacute;e</option>
					</select>
				</div><br> <br> <br>
			<b>Avancement : </b> <input type="number" style="width:5%;" step="10" min="0" max="100" value="60">%
			
			<br><br><br>

		<div class="bouton"><input type="Submit" value="Modifier"></div> <br /><br />

		<div class="bouton"><input type="button" value="Retour" onclick="history.go(-1)" /></div>
		
		
		</div>

		<div class="hautdroite">
			<a href="unlog.html">D&eacute;connexion</a>
		</div>

	</body>
</html>