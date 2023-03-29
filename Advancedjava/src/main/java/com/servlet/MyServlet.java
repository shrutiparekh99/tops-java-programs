package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String action=request.getParameter("action");
                if(action.equalsIgnoreCase("Submit"))
                {
                	if(request.getParameter("password").equals(request.getParameter("cpassword")))
                { 		
		        String fname=request.getParameter("fname");
                System.out.println("First Name : "+fname);
                String lname=request.getParameter("lname");
                System.out.println("Last Name : "+lname);
                String email=request.getParameter("email");
                System.out.println("Email Name : "+email);
                String mobile=request.getParameter("mobile");
                System.out.println("Mobile : "+mobile);
                String address=request.getParameter("address");
                System.out.println("Address : "+address);
                String password=request.getParameter("password");
                System.out.println("Password : "+password);
                String cpassword=request.getParameter("cpassword");
                System.out.println("Confirm password : "+cpassword);
                }
                	else 
                	{
						String msg="Password and Confirm Password does not matched";
						System.out.println(msg);
						request.setAttribute(msg, msg);
						request.getRequestDispatcher("form.jsp").forward(request, response);
					}
                }
	        }
	   }

