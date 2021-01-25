<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/24/2021
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action = "/Calc">
    <label>List Price: </label><br/>
    <input type="text" name="ListPrice" placeholder="List Price "/><br/>
    <label> Discount Percent: </label><br/>
    <input type="text" name="DiscountPercent" placeholder=" Discount Percent" /><br/>
    <input type = "submit" id = "submit" value = "Discount Amount"/>
  </form>


  </body>
</html>
