<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/26/2021
  Time: 10:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="#" method="post">

    <input type="hidden" name="id" value="${productInfo.id}">
    <input type="hidden" name="actionUser" value="update">
    <p>
        Name:
        <input type="text" value="${productInfo.name_product}" name="name_product">
    </p>
    <p>
        Cost:
        <input type="text" value="${productInfo.cost}" name="cost">
    </p>
    <p>
        <input type="submit" value="Save">
    </p>
</form>

</body>
</html>
