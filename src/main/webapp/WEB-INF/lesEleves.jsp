<%@page import="java.util.ArrayList"%>
<%@page import="models.Eleve"%>
<%@ include file='../fragments/header.jsp' %>
	<h1>  Les Eleves </h1>
	
	<ul>
	<% for (Eleve eleve : (ArrayList<Eleve>) request.getAttribute("eleves")) { %>
		<li>	
			<a href='/exoFormation/eleve?nom=<%= eleve.getNom() %>'><%= eleve.getNom() %></a>
		</li>
	<% } %>
</ul>
<%@ include file='../fragments/footer.jsp' %>