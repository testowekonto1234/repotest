
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>Rejestracja</title>
</head>

<body>
<h2>Rejestracja  </h2>
<form:form method = "POST" action = "/userAdded">
  <table>
    <tr>
      <td><form:label path = "email">Adres e-mail</form:label></td>
      <td><form:input path = "email" /></td>
    </tr>
    <tr>
      <td><form:label path = "password">Password</form:label></td>
      <td><form:input path = "password" /></td>
    </tr>
    <tr>
      <td><form:label path = "name">Name</form:label></td>
      <td><form:input path = "name" /></td>
    </tr>
    <tr>
      <td><form:label path = "surname">Surname</form:label></td>
      <td><form:input path = "surname" /></td>
    </tr>
    <tr>
      <td><form:label path = "phoneNumber">Numer Telefonu</form:label></td>
      <td><form:input path = "phoneNumber" /></td>
    </tr>
    <tr>
      <td><form:label path = "pesel">PESEL</form:label></td>
      <td><form:input path = "pesel" /></td>
    </tr>
    <tr>
      <td colspan = "2">
        <input type = "submit" value = "Submit"/>
      </td>
    </tr>
  </table>
</form:form>
</body>

</html>