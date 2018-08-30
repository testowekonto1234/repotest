<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>Potwierdzenie zalozenia konta</title>
</head>

<body>
<h2>Jakies potwierdzenie zalozenia konta - tutaj testowo wypisuje dane</h2>
<table>
  <tr>
    <td>E-mail</td>
    <td>${email}</td>
  </tr>
  <tr>
    <td>Password</td>
    <td>${password}</td>
  </tr>
  <tr>
    <td>Name</td>
    <td>${name}</td>
  </tr>
  <tr>
    <td>Surname</td>
    <td>${surname}</td>
  </tr>
  <tr>
    <td>phoneNumber</td>
    <td>${phoneNumber}</td>
  </tr>
  <tr>
    <td>Pesel</td>
    <td>${pesel}</td>
  </tr>
</table>
</body>

</html>