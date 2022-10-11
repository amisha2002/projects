<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>STUDENT DELETE FORM</h1>
<br>
</div>
<form action="delete" method ="post">
<div >
 <div class="mb-3 row" >
    <label for="inputPassword" class="col-sm-2 col-form-label">Id</label>
    <div class="col-sm-10">
      <input type="number"  id="inputPassword" name = "sid">
    </div>
  </div>
  <div style = "text-align: center;">
  <input type="submit" class="btn btn-success" value ="DELETE">
  </div>
 </form>
</body>
</html>