<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Dodanie nowego typu auta</title>
</head>

<body>

<h2> Nowy typ auta</h2>
<form:form method = "POST" action = "/loggedDealerNewCar">
    <table>
        <tr>
            <td><form:label path = "regNo">Numer rejestracyjny</form:label></td>
            <td><form:input path = "regNo" /></td>
        </tr>
        <tr>
            <td><form:label path = "year">Rocznik</form:label></td>
            <td><form:input path = "year" /></td>
        </tr>

        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>

        <tr>
            <td>
                <form:select path="carType" items="${carTypeMap}"/>
            </td>
        </tr>

    </table>
</form:form>



</body>

</html>