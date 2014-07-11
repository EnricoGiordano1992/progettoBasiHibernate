<!-- Eseguo gli import necessari -->
<%@page import="bean.Diagnosi"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="dbms.*"%>
<%@page errorPage="error.jsp"%>
<%@page isErrorPage="false"%>
<html>
<% 
    // Genero un oggetto della classe DBMS per gestire l'interzione con la base di dati
    DBMS dbms = new DBMS();

    ArrayList<Diagnosi> patologie = new ArrayList<Diagnosi>();
    patologie = dbms.getPatologie();
%>


<head>

<link href="css/default.css" rel="stylesheet" type="text/css"
	media="all">
<link href="css/font.css" rel="stylesheet" type="text/css" media="all">

</head>

<title>PazientePage</title>

<body>

	<div id="wrapper">
		<div id="header-wrapper">
			<div id="header" class="container">
				<div id="logo">
					<h1>
						<a href="#">Ospedale San Gibbordano</a>
					</h1>
					<p>Divisione ospedaliera di Medicina</p>
				</div>
			</div>
		</div>

		<div id="menu-wrapper">
			<div id="menu" class="container">
				<ul>
					<li><a href="?">Homepage</a></li>
					<li><a href="?ps=info">Info</a></li>
					<li><a href="?ps=personale">Personale</a></li>
					<li class="current_page_item"><a href="?ps=patologie">Patologie</a></li>
					<li><a href="?ps=login">Login</a></li>

				</ul>
			</div>
			<!-- end #menu -->
		</div>
		<br> <br>


		<div align="center">
			<div class="title">
				<h1>PATOLOGIE DIAGNOSTICATE</h1>
			</div>
		</div>



		<div id="page" class="container">
			<div id="content">
				<div class="title">
					<h2>ELENCO DELLE PATOLOGIE</h2>
					<span class="byline">Si riporta il codice ICD10, il nome della patologia <br>
					e il numero di pazienti  a cui tale patologia e' stata diagnosticata
					</span>
				</div>
				
					<% for(int i = 0; i < patologie.size(); i++) { %>
					<p><strong>[ <%= patologie.get(i).getIcd10() %> ] </strong>
					
					(<%= patologie.get(i).getPatologia() %>)
					, <br>pazienti diagnosticati:
						<%= dbms.getCountPatologie( patologie.get(i).getIcd10(), patologie.get(i).getPatologia()) %>
					 </p>
					<%} %>
				
			</div>
		</div>
	</div>


</body>