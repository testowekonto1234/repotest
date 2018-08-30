<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Zalogowany uzytkownik </h2>
<h5> Testowo - wylogowywanie przez "form" i "a href" </h5>

<form name="myForm" action="/logout" method="GET">
  <input type="submit" value="Wyloguj" name="submit" />
</form>
<a href="<c:url value="/logout" />">Logout</a>





<table>
  <c:forEach items="${lista}" var="item">
    <tr>
      <td><c:out value="${item}" /></td>
    </tr>
  </c:forEach>
</table>


</body>

</html>