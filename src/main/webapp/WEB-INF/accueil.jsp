<%@ include file='../fragments/header.jsp' %>

	<h1> Bienvenue � l'accueil</h1>
	
	<a href='<%= request.getContextPath() %>/lesFormations'> - Liste des formations </a>
	<br/> <br/>
	<a href='<%= request.getContextPath() %>/lesEleves'> - Liste des �l�ves </a>
	
	 
<%@ include file='../fragments/footer.jsp' %>