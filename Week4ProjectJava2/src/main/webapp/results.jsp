<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>results</title>
</head>
<body>
<h1> All done! Here is the finished MadLib:</h1>
<p>Here is the prompt: <br>
   Today is a great ${myLib.getWordAt(0)}. <br>
   I'm going to ${myLib.getWordAt(1)} today! <br>
   After that perhaps I'll ${myLib.getWordAt(2)}. <br>
   All in all I think it will be ${myLib.getWordAt(3)}! </p>
   <a href="homepage.jsp"> Start another MadLib?</a>
</body>
</html>