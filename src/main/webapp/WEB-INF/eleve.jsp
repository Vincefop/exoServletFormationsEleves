<%@page import="models.Eleve"%>
<%@page import="models.Formation"%>
<%@ include file='../fragments/header.jsp' %>

	<h1> Un eleve </h1>
	
	<% Eleve eleve = (Eleve) request.getAttribute("eleve"); %>
	<h3> Nom :</h3> 
	<h4> <%= eleve.getNom() %></h4>
	<h5> Prenom :</h5> 
	<h6> <%= eleve.getPrenom() %></h6>
	<h5> Age :</h5> 
	<h6> <%= eleve.getAge() %></h6>
	<h5> Note :</h5> 
	<h6> <%= eleve.getNote() %></h6>
	<h5> Titre Formation :</h5> 
	<h6> <%= eleve.getFormation().getTitre() %></h6>
	<br/>
	<a href='/exoFormation/lesEleves'> Retour à la liste des élèves </a>
	 
<%@ include file='../fragments/footer.jsp' %>