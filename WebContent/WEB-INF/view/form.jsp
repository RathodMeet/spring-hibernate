<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form</title>
	</head>
	<body>
		<h1 align="center">form</h1>
		<div>
			<form:form modelAttribute="use" action="submit" method="post">
				<div align="center">
					Name: <input type="text" name="name"></input>
					Surname: <input type="text" name="surname"></input>
				</div>
				<div align="center"> <input type="submit" value="submit"></input> </div>
			</form:form>
		</div>
	</body>
</html>