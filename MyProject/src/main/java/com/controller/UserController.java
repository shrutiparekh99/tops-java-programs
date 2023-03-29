package com.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.bean.User;
import com.dao.Userdao;
import com.service.Services;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      String action=request.getParameter("action");
	      
	      if(action.equalsIgnoreCase("sign up"))
	    {
	      boolean flag=Userdao.checkEmail("email");
	      if(flag==true)
	      {
	    	request.setAttribute("msg" ,"Email alredy registerd"); 
	    	request.getRequestDispatcher("signup.jsp").forward(request, response);
	      }
	      else
	      {
	       if(request.getParameter("password").equals(request.getParameter("cpassword")))
	         { 
			     User u=new User();
			     u.setUsertype(request.getParameter("usertype"));
			     u.setFname(request.getParameter("fname"));
			     u.setLname(request.getParameter("lname"));
			     u.setEmail(request.getParameter("email"));
			     u.setMobile(request.getParameter("mobile"));
			     u.setAddress(request.getParameter("address"));
			     u.setPassword(request.getParameter("password"));
			     Userdao.signup(u);
			     request.setAttribute("msg", "User Sign Up Successfully");
			     request.getRequestDispatcher("signup.jsp").forward(request, response);
	      }
	      else
	        {
	    	 request.setAttribute("msg", "Password & Confirm Password Dose Not matched");
	 	     request.getRequestDispatcher("signup.jsp").forward(request, response);
	 	    }
	      }
	    }
	      else if(action.equalsIgnoreCase("login"))
	      {
	         User u=Userdao.login(request.getParameter("email"));
	         if(u==null)
	         {
	        	request.setAttribute("msg" ,"Email Not Registerd"); 
	 	    	request.getRequestDispatcher("login.jsp").forward(request, response);
	 	     }
	         else
	         {
	        	 if(u.getPassword().equals(request.getParameter("password")))
	        	 {
	        	 HttpSession session=request.getSession();
	        	 session.setAttribute("u", u);
	        	 if(u.getUsertype().equals("buyer"))
	        	 {
		          request.getRequestDispatcher("index.jsp").forward(request, response);
                   } 
	        	 
	        	 else
	        	 																								{  
	        	 request.getRequestDispatcher("seller-index.jsp").forward(request, response);
	             }
	        	 }
	        	 else
	        	 {
	        		request.setAttribute("msg" ,"Incorrect Password"); 
	 	 	    	request.getRequestDispatcher("login.jsp").forward(request, response);
	 	 	     }
              }
	       }
	      else if(action.equalsIgnoreCase("change password"))
	      {
	    	  HttpSession session=request.getSession();
	    	  User u=(User) session.getAttribute("u");
	    	  if(u.getPassword().equals(request.getParameter("old_password")))
	    	  {
	    		  if(!u.getPassword().equals(request.getParameter("new_password")))
	    		  {
	    			if(request.getParameter("new_password").equals(request.getParameter("cnew_password"))) 
	    		 {
	    			 Userdao.changePassword(u.getEmail(), request.getParameter("new_password"));
	    			 request.setAttribute("msg","Password Changed Successfully");
	    			 response.sendRedirect("logout.jsp");
	    		 }
	    			else
	    			{
	    				request.setAttribute("msg", "New Password & Confirm New Password Does Not Matched");
	    				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
	    			}
	    		}
	    		  else
	    		  {
	    			  request.setAttribute("msg", "New Password Could Not Be Same As Old Password");
	    			  request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
	    		  }
	         }
	    	  else
	    	  {
	    		  request.setAttribute("msg", "Old Password Does Not Matched");
    			  request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
	    	  }
	      }
	      else if(action.equalsIgnoreCase("send otp"))
	      {
	    	  boolean flag=Userdao.checkEmail(request.getParameter("email"));
	    	  if(flag==true)
	    	  {
	    		  Random t = new Random();
			    	int minRange = 1000, maxRange= 9999;
			    	int otp = t.nextInt(maxRange - minRange) + minRange;
		        	Services.sendMail(request.getParameter("email"), otp);
		        	request.setAttribute("email", request.getParameter("email"));
		        	request.setAttribute("otp", otp);
		        	request.getRequestDispatcher("otp.jsp").forward(request, response);
	    	  }
	    	  else
	    	  {
	    		  request.setAttribute("msg", "Email Not Registered");
	    		  request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
	    	  }
          }
	      else if(action.equalsIgnoreCase("varify otp"))
	      {
	    	  String email=request.getParameter("email");
	    	  int otp=Integer.parseInt(request.getParameter("otp"));
	    	  int uotp=Integer.parseInt(request.getParameter("uotp"));
	    	  
	    	  if(otp==uotp)
	    	  {
	    		  request.setAttribute("email", email);
	    		  request.getRequestDispatcher("new-password.jsp").forward(request, response);
	    	  }
	    	  else
	    	  {
	    		  request.setAttribute("Msg", "Invalid OTP");
	    		  request.setAttribute("otp", otp);
	    		  request.setAttribute("email", email);
	    		  request.getRequestDispatcher("otp.jsp").forward(request, response);
               }
             }
	      else if(action.equalsIgnoreCase("update password"))
	      {
	    	  String email=request.getParameter("email");
	    	  String new_password=request.getParameter("new_password");
	    	  String cnew_password=request.getParameter("cnew_password");

	    	  if(new_password.equals(cnew_password))
	    	  {
	    		  Userdao.changePassword(email, cnew_password);
	    		  request.setAttribute("msg", "Password Updated Successfully");
	    		  request.getRequestDispatcher("login.jsp").forward(request, response);
	    	  }
	    	  else
	    	  {
	    		  request.setAttribute("msg", "New Password & Confirm New Password Does Not Matched");
	    		  request.setAttribute("email", email);
	    		  request.getRequestDispatcher("new-password.jsp").forward(request, response);
	    		  
	    	  }
	      }
	      
	    }
	}
	
	
	      

	
