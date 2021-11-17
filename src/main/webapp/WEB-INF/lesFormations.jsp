²<%@page import="java.util.ArrayList"%>
<%@page import="models.Formation"%>
<%@ include file='../fragments/header.jsp' %>
	<h1> Bienvenue sur les formations</h1>
	
	<ul>
	<% for (Formation formation : (ArrayList<Formation>) request.getAttribute("formations")) { %>
		<li>	
			<a href='/exoFormation/formation?titre=<%= formation.getTitre() %>'><%= formation.getTitre() %></a>
		</li>
	<% } %>
	</ul>
	
	 <br/>
	<br/>
	<a href='/exoFormation/accueil'> Retour à l'accueil </a>
	
<%@ include file='../fragments/footer.jsp' %>