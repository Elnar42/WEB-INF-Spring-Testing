<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Random Number Generator</title>
</head>
<body>
<h1>Random Number Generator</h1>
<%
    // Generate a random number between 1 and 100
    int randomNumber = (int) (Math.random() * 100) + 1;
%>
<p>Your random number is: <strong><%= randomNumber %></strong></p>
<form action="random.jsp" method="get">
    <button type="submit">Generate New Number</button>
</form>
</body>
</html>
