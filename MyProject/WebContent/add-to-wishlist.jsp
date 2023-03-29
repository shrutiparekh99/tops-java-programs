<%@page import="com.bean.Wishlist"%>
<%@page import="com.dao.Wishlistdao"%>
<%@ include file="header.jsp" %>


<%
		int pid=Integer.parseInt(request.getParameter("pid"));
		int uid=u.getUid();
		Wishlist w=new Wishlist();
		w.setPid(pid);
		w.setUid(uid);
		Wishlistdao.add_to_wishlist(w);
		response.sendRedirect("wishlist.jsp");

%>