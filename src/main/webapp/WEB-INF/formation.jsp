<%@page import="models.Formation"%>
<%@ include file='../fragments/header.jsp' %>
	<h1> Ma formation </h1>
	
	<% Formation formation = (Formation) request.getAttribute("formation"); %>
	<h1><%= formation.getTitre() %></h1>
	<p> Au programme : <br/>
		<%= formation.getProgramme() %>
	</p>
	<p>
	Contiendra : <b><%= formation.getNbreEleve() %> élèves</b>
	</p>
	
	 
<%@ include file='../fragments/footer.jsp' %>