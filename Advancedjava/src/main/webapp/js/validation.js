function checkname()
   {
	   var f=documnet.frm.fname.value;
	   var reg=/^[A-Za-z]+$/;
	   if(f="")
		   {
		   document.getElementById("fname").innerHTML="please enter first name";
		   }
	   else if(!reg.tesr(f))
	       {
		   document.getElementById("fname").innerHTML="Please enter only alphabets";
           }
	   else 
		   {
		   document.getElementById("fname").innerHTML="";

		   }
   }
   function checkEmail()
   {
	   var f=documnet.frm.email.value;
	   var reg=/^[A-Za-z0-9-_.]+@[A-Za-z]\.[A-Za-z]{2,4}$/;
	   if(f="")
		   {
		   document.getElementById("email").innerHTML="Please enter email";
		   }
	   else if(!reg.tesr(f))
	       {
		   document.getElementById("email").innerHTML="Please enter valid email";
           }
	   else
		   {
		   document.getElementById("email").innerHTML="";

		   }
   }
   function checkMobile()
   {
	   var f=documnet.frm.mobile.value;
	   var reg=/^\d{10}$/;
	   if(f="")
		   {
		   document.getElementById("mobile").innerHTML="Please enter mobile";
		   }
	   else if(!reg.tesr(f))
	       {
		   document.getElementById("mobile").innerHTML="Please enter 10 digits only";
           }
	   else
		   {
		   document.getElementById("mobile").innerHTML="";

		   }
   }
   function checkPassword()
   {
	   var f=documnet.frm.password.value;
	   var reg=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	   if(f="")
		   {
		   document.getElementById("password").innerHTML="Please enter password";
		   }
	   else if(!reg.tesr(f))
	       {
		   document.getElementById("password").innerHTML="Min 1 digit upper,lower & special(8,15)";
           }
	   else
		   {
		   document.getElementById("password").innerHTML="";

		   }
   }
   function checkCPassword()
   {
	   var p1=documnet.frm.password.value;
	   var p2=documnet.frm.cpassword.value;
	           
	   if(p2=="")
		   {
		   document.getElementById("cpassword").innerHTML="Please enter confirm password";
		   }
	   else if(p1!=p2)
	       {
		   document.getElementById("cpassword").innerHTML="Password & confirm password does not matched";
           }
	   else
		   {
		   document.getElementById("cpassword").innerHTML="";

		   }
   }
