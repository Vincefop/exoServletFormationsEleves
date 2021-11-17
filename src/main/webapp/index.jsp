<%@ include file='./fragments/header.jsp' %>

	<h1> Bienvenue </h1>
	
	<h3>Veuillez vous identifier : </h3>
	
	<form method='post' action='login'>
		<label for='txtLogin'>Login : </label>
		<input id='txtLogin' name='txtLogin' type='text' value ='${login}' autofocus /><br/>
		<label for='txtPassword'>Password : </label>
		<input id='txtPassword' name='txtPassword' type='password' value ='${password}'/> <br/>
		<br/>
		<input name='btnConnect' type='submit' value='Valider' /> <br/>
	</form>
	
	
	<h5> login : Vince && password : pass</h5>
	
<%@ include file='./fragments/footer.jsp' %>