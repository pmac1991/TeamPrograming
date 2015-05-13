<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="site.css" rel="stylesheet">
<title>Register your firm</title>
</head>
<body>
<form action="Registerfirm" method="POST">
Name: <input type="text" name="name">
<br />
E-mail: <input type="text" name="email" />
<br />
Telephone: <input type="text" name="telephone" />
<br />
Password: <input type="text" name="passwrd" />
<br />
Address: <input type="text" name="address" />
<br />
Branch: <input type="text" name="branch" />
<br />
Description: <input type="text" name="description" />
<br />
<input type="submit" value="Submit" />
</form>
</body>
</html>