<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<main>
	<form action="AdminLogin" method="post">
		<h3> AdminLogin</h3>
	<label>User Name</label>
	<input type="text" id="adminUserName" name="adminUserName"required autofocus><br>
	<label> Password</label>
	<input type="password" id="adminPassword" name="adminPassword"required><br>
	<button type="submit" class="btn btn-primary">Submit</button>
	<button  type="reset" class="btn btn-danger">Reset</button>
	</form>
</main>
<a href="UserLogin.jsp">User Login</a>

</body>
</html>