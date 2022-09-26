<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My MadLib!</title>
</head>
<body>
<h1> Welcome to mini madlib!</h1>
<p>Here is the prompt: <br>
   Today is a great ______. <br>
   I'm going to _______ today! <br>
   After that perhaps I'll _____. <br>
   All in all I think it will be ______! </p>
   <form action="getWordServlet" method="post">
	Enter the word for the first sentence:
	<input type="text" name="userWord" size ="10">
	<input type="submit" value="Add word"/>
	</form>
</body>
</html>