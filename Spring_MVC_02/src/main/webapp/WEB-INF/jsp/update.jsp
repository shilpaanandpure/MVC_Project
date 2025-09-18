<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update">
		<input type="text" name="id" placeholder="ENTER id" >
		<input type="text" name="name" placeholder="ENTER NAME" >
		<input type="text" name="salary" placeholder="ENTER SALARY" >
		<input type="submit" value="submit_data">		
	</form>
	
	<h1>Updated User data</h1>
	<p>${userId }</p>
	<p>${userName }</p>
	<p>${userSalary }</p>
</body>
</html>