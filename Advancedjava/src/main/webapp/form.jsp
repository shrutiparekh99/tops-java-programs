<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="js/validation.js">
</script>
</head>
<body>
<%
   if(request.getAttribute("msg")!=null)
       { 
%>
    <b style="color :red">;
<%
    	   out.println(request.getAttribute("msg"));
       }
%>
</b>
<form name="frm" method="post" action="/MyServlet"> 
   <table cellpedding="3px" cellspecing="5px">
    <tr>
         <td>First Name</td>
         <td><input type="text" name="fname" onblur="checkname();"></td>
         <td><span id="fname"></span></td>
         
    </tr>
    <tr>
         <td>Last Name</td>
         <td><input type="text" name="lname"></td>
     </tr>
     <tr>
          <td>Email</td>
          <td><input type="text" name="email" onblur="checkemail();"></td>
          <td><span id="email" onblur="checkEmail();"></span></td>
          <td><span id="email"></span></td>
      </tr>
      <tr>
           <td>Mobile</td>
           <td><input type="text" name="mobile" onblur="checkmobile();"></td>
           <td><span id="mobile" onblur="checkMobile();"></span></td> 
           <td><span id="mobile"></span></td>
      </tr>
      <tr>
           <td>Address</td>
           <td><textarea rows="5" cols="21" name="address"></textarea></td>
      </tr>
      <tr>
           <td>Gender</td>
           <td><input type="radio" name="gender" value="male">Male
               <input type="radio" name="gender" value="female">Female
          </td>
      </tr>
      <tr>
          <td>Hobby</td>
          <td><input type="checkbox" name="hobby" value="music">Music<br>
               <input type="checkbox" name="hobby" value="reading">Reading<br>
               <input type="checkbox" name="hobby" value="traveling">Traveling<br>
               <input type="checkbox" name="hobby" value="cooking">cooking
           </td>
      </tr>
      <tr>
          <td>Education</td>
          <td><select name="education">
              <option>----select education----</option>
              <option value="10th">10th</option>
              <option value="10th">12th</option>
              <option value="10th">BCA</option>
              <option value="10th">BE</option>
              <option value="10th">BBA</option>
              <option value="10th">MBA</option>
              <option value="10th">ME</option>
              </select>
       </tr>
       <tr>
          <td>Birth Date</td>
          <td><input type="date" name="bday"></td>
       </tr>
       <tr>
         <td>Resume</td>
         <td><input type="file" name="resume"></td>
       </tr>
       <tr>
         <td>Password</td>
         <td><input type="text" name="password" onblur="checkPassword();"></td>
         <td><span id="password" onblur="checkpassword();"></span></td>
         <td><span id="password"></span></td>
       </tr>
       <tr>
         <td>Confirm Password</td>
         <td><input type="text" name="cpassword" onblur="checkCPassword();"></td>
         <td><span id="cpassword" onblur="checkCpassword();"></span></td>
          <td><span id="cpassword"></span></td>
         
       </tr>
       <tr>
           <td colspan="2" align="center">    
           <input type="submit" name="action" value="SUBMIT">
           </td>
       </tr>
       
</table>
</form>
</body>
</html>
