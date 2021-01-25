<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/25/2021
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <title>List Customer</title>
  </head>
  <body>
  <h1>DANH SÁCH KHÁCH HÀNG</h1>
  <table class="table">
    <tr>
      <th scope="col">TÊN</th>
      <th scope="col">NGÀY SINH</th>
      <th scope="col">ĐỊA CHỈ</th>
      <th scope="col">ẢNH</th>
    </tr>
    <c:forEach var="customer" items="${customerListFromServlet}" >
    <tr>
      <td><c:out value="${customer.name}"/></td>
      <td><c:out value="${customer.dateOfBirth}"/></td>
      <td><c:out value="${customer.address}"/></td>
      <td><img style="width: 40px ; height: 40px" alt="" src="${customer.img}"/></td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>

