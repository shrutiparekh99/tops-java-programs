<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<b style="color:purple;">
<%
  if(request.getAttribute("msg")!=null)
  {
	  out.println(request.getAttribute("msg"));
  }
%>
</b>
<form name="insert" method="post" action="StudentController">
<table>
  <tr>
    <td>First Name</td>
    <td><input type="text" name="fname"></td>
  </tr>
  <tr>
    <td>Last Name</td>
    <td><input type="text" name="lname"></td>
  </tr>
  <tr>
    <td>Email</td>
    <td><input type="text" name="email"></td>
  </tr>
  <tr>
    <td>Mobile</td>
    <td><input type="text" name="mobile"></td>
  </tr>
  <tr>
    <td>Address</td>
    <td><textarea rows="5" cols="21" name="address"></textarea></td>
  </tr>
  <tr>
    <td>Gender</td>
       <td>
       <input type="radio" name="gender" value="male">Male
       <input type="radio" name="gender" value="female">Female 
    </td>
  </tr>
  <tr>
      <td colspan="2" align="center">
      <input type="submit" name="action" value="INSERT">
    </td>
  </tr>  
</table>
</form>
<a href="show.jsp">Show All Students</a>
</body>
</html>






