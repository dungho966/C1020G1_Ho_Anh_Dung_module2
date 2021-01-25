<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/25/2021
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form style="background-color: gray" method="post" action="/Calcu">
    <div class="form-group">
      <label for="exampleFormControlInput1">First Operand</label>
      <input type="text" class="form-control" id="exampleFormControlInput1" name="firstOperand" >
    </div>
    <div class="form-group">
      <label for="exampleFormControlSelect1" >Operator</label>
      <select class="form-control" id="exampleFormControlSelect1" name="operator" >
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
      </select>
    </div>

    <div class="form-group">
      <label for="exampleFormControlTextarea1">Second Operand</label>
      <input class="form-control" id="exampleFormControlTextarea1" rows="3" name="secondOperand"/>
    </div>
    <input type="submit" name="submit" value="Calculate">
  </form>

  </body>
</html>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
