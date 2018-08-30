<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>Dodanie nowego typu auta</title>
</head>

<body>

<h2> Nowy typ auta</h2>
<form:form method = "POST" action = "/loggedDealerNewCarType">
  <table>
    <tr>
      <td><form:label path = "mark">Marka</form:label></td>
      <td><form:input path = "mark" /></td>
    </tr>
    <tr>
      <td><form:label path = "model">Model</form:label></td>
      <td><form:input path = "model" /></td>
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