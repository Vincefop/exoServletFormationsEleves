<%@ include file='./fragments/header.jsp' %>

	<h1> Hello index.jsp</h1>
	
	<h3>Veuillez vous identifier : </h3>
	
	<form method='post' action='login'>
		<label for='txtLogin'>Login : </label>
		<input name='txtLogin' type='text' value ='${login}' autofocus /><br/>
		<label for='txtPassword'>Password : </label>
		<input name='txtPassword' type='password' value ='${password}'/> <br/>
		<br/>
		<input name='btnConnect' type='submit' /> <br/>
	</form>
	
	
	<h5> login : Vince && password : pass</h5>
	
<%@ include file='./fragments/footer.jsp' %>