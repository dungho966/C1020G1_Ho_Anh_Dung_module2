<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/26/2021
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">

    <tr><a href="productServlet?actionUser=create">Add New Product</a></tr>
    <thead>
    <tr class="table-primary">
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Cost</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="products" items="${productList}">
        <tr class="table-danger">

            <td><c:out value="${products.id}"/></td>
            <td><c:out value="${products.name_product}"/></td>
            <td><c:out value="${products.cost}"/></td>
            <td><a href="/productServlet?actionUser=update&id=${products.id}">Update</a></td>
            <td><a href="/productServlet?actionUser=delete&id=${products.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
