<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Zalogowany dealer - action /addCartype bylo </h2>

<form name="myForm" action="/logout" method="GET">
  <input type="submit" value="Wyloguj" name="submit" />
</form>

<form name="myForm" action="/addNewCarType">
  <input type="submit" value="Dodaj typ auta" name="submit" />
</form>

<form name="myForm" action="/addNewCar">
  <input type="submit" value="Dodaj nowe auto" name="submit" />
</form>



</body>

</html>