<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit student details</title>
</head>
<body>

<h1>Please submit below details </h1>

<form action="/StudentAdmission/submtAdmissionForm.html" method="post">
	<p>
		Student name: <input type="text" name="studentName" />
	</p>
	<p>
		Student hobby: <input type="text" name="studentHobby" />
	</p>
	<input type="submit" value="Submit">
</form>
</body>
</html>