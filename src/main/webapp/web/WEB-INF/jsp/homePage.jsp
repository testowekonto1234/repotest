<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Spring MVC Form Handling - bylo logger user w action</title>
</head>

<body>
<h2>Domowa Stronka  </h2>
<h3>No i tutaj jeszcze "O nas" i "Kontakt" </h3>
<h3>Ogolnie te "buttony" powinny byc chyba jako ten odyłacz "a href" w jsp ale pewien nie jestem :D</h3>
<h3>Zobaczysz jak to wylada jak bedzie robił front</h3>
  <form name="myForm" action="/register" method="GET">
    <input type="submit" value="Rejestruj" name="submit" />
  </form>
    <form name="myForm" action="/redirect" method="GET">
      <input type="submit" value="Zaloguj" name="submit" />
    </form>





</body>

</html>