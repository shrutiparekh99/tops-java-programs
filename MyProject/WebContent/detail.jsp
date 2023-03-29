<%@page import="java.awt.Button"%>
<%@page import="com.dao.Productdao"%>
<%@page import="com.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
   </head>

<body>
    <%@ include file="header.jsp" %>


       <!-- Breadcrumb Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-12">
                <nav class="breadcrumb bg-light mb-30">
                    <a class="breadcrumb-item text-dark" href="#">Home</a>
                    <a class="breadcrumb-item text-dark" href="#">Shop</a>
                    <span class="breadcrumb-item active">Shop Detail</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->
    <%
    Product p=Productdao.getProductByPid(Integer.parseInt(request.getParameter("pid")));
    
    %>


    <!-- Shop Detail Start -->
    <div class="container-fluid pb-5">
        <div class="row px-xl-5">
            <div class="col-lg-5 mb-30">
                <div id="product-carousel" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner bg-light">
                        <div class="carousel-item active">
                            <img class="w-100 h-100" src="product_images/<%=p.getProduct_image() %>" alt="Image">
                        </div>
                        <div class="carousel-item">
                            <img class="w-100 h-100" src="product_images/<%=p.getProduct_image() %>" alt="Image">
                        </div>
                        <div class="carousel-item">
                            <img class="w-100 h-100" src="product_images/<%=p.getProduct_image() %>" alt="Image">
                        </div>
                        <div class="carousel-item">
                            <img class="w-100 h-100" src="product_images/<%=p.getProduct_image() %>" alt="Image">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#product-carousel" data-slide="prev">
                        <i class="fa fa-2x fa-angle-left text-dark"></i>
                    </a>
                    <a class="carousel-control-next" href="#product-carousel" data-slide="next">
                        <i class="fa fa-2x fa-angle-right text-dark"></i>
                    </a>
                </div>
            </div>

            <div class="col-lg-7 h-auto mb-30">
                <div class="h-100 bg-light p-30">
                    <h3><%=p.getProduct_name() %></h3>
                    <div class="d-flex mb-3">
                        <div class="text-primary mr-2">
                            <small class="fas fa-star"></small>
                            <small class="fas fa-star"></small>
                            <small class="fas fa-star"></small>
                            <small class="fas fa-star-half-alt"></small>
                            <small class="far fa-star"></small>
                        </div>
                        <small class="pt-1">(99 Reviews)</small>
                    </div>
                    <h3 class="font-weight-semi-bold mb-4"><%=p.getProduct_price() %></h3>
                    <p class="mb-4"><%=p.getProduct_desc() %></p>
                                       
                    <div class="d-flex align-items-center mb-4 pt-2">
                        <!-- <div class="input-group quantity mr-3" style="width: 130px;">
                            <div class="input-group-btn">
                                <button class="btn btn-primary btn-minus">
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input type="text" class="form-control bg-secondary border-0 text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>-->
                            
                            
                        <%
                        if(session.getAttribute("u")!=null)
					    {
                        
                        %>
                            <button class="btn btn-primary px-3"><i class="fa fa-shopping-cart mr-1"></i> Add To
                            Cart</button>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="add-to-wishlist.jsp?pid=<%=p.getPid()%>">
                            <button class="btn btn-primary px-3"><i class="fa fa-heart mr-1"></i> Add To
                            Whishlist</button>
                            </a>
                         <%
							}
                        else
                        {
                        %>
                        <a href="login.jsp"><button class="btn btn-primary px-3"><i class="fa fa-sign-in mr-1"></i>Login</button></a>
                        <% 	
                        }
                        	
                       %>
                       
                    </div>
                    
                </div>
            </div>
        </div>
        <div class="row px-xl-5">
            <div class="col">
                <div class="bg-light p-30">
                    <div class="nav nav-tabs mb-4">
                        <a class="nav-item nav-link text-dark active" data-toggle="tab" href="#tab-pane-1">Description</a>
                        <a class="nav-item nav-link text-dark" data-toggle="tab" href="#tab-pane-2">Information</a>
                        <a class="nav-item nav-link text-dark" data-toggle="tab" href="#tab-pane-3">Reviews (0)</a>
                    </div>
                    <div class="tab-content">
                        <div class="tab-pane fade show active" id="tab-pane-1">
                                </div>
        </div>
    </div>
    <!-- Shop Detail End -->


    <!-- Products Start -->
    