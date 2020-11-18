<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/5/20
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Drink</title>

</head>
<body>
<div class="container-fluid">
    <h1>Search Results: </h1>


    <table border=1 width=30% height=40% text-align="center">



        <c:forEach items="${drinks}" var="resultDrinks">
            <tr>
                <td>${resultDrinks.name}</td>
                <td>${resultDrinks.mood}</td>
                <td>${resultDrinks.weather}</td>
            </tr>
        </c:forEach>

    </table>
    <br><br>


</div>
<h2>Bottoms Up!</h2>

<a href="index.jsp">Back to homepage</a>

</body>
</html>
