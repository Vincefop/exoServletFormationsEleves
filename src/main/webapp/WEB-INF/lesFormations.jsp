<%@page import="java.util.List"%>
<%@page import="models.Formation"%>
<%@ include file='../fragments/header.jsp' %>
	<h1> Bienvenue sur les formations</h1>
	
	<ul>
	<% for (Formation formation : (List<Formation>) request.getAttribute("formations")) { %>
		<li>	
			<a href="/exoFormation/formation?title=<%= formation.getTitre() %>"><%= formation.getTitre() %></a>
		</li>
	<% } %>
</ul>
	
	 
<%@ include file='../fragments/footer.jsp' %>