<%@ include file='./fragments/header.jsp' %>
	<h1> Hello index.jsp</h1>
	
	<h3>Veuillez vous identifier : </h3>
	
	<form method='post' action='login'>
		Login : <input name='txtLogin' type='text' value ='${login}' autofocus /><br/>
		Password : <input name='txtPassword' type='password' value ='${password}'/> <br/>
		<br/>
		<input name='btnConnect' type='submit' /> <br/>
	</form>
	
	
	<h5> login : Vince && password : pass</h5>
	
<%@ include file='./fragments/footer.jsp' %>