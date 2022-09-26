<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Handler</title>
</head>
<body>
	<p> You're ${counter} word is ${myLib.getHolder()} <br>
		It will appear as ${myLib.getLastWord()} </p>
		<form action="getWordServlet" method="post">
	Enter the next word:
	<input type="text" name="userWord" size ="10">
	<input type="submit" value="Add word"/>
	</form>
	<h6> The sentences are as follows:</h6>
	<p>Here is the prompt: <br>
   Today is a great ______. <br>
   I'm going to _______ today! <br>
   After that perhaps I'll _____. <br>
   All in all I think it will be ______! </p>
</body>
</html>