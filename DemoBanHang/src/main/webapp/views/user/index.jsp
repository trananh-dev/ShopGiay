<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

<title>Trang chủ</title>



<div class="main">
	<div class="content">
		<div class="content_top">
			<div class="heading">
				<h3>Sản phẩm nổi bật</h3>
			</div>
			<div class="clear"></div>
		</div>
		<div class="section group">
		<c:forEach items="${product }" var="pro">
		<div class="grid_1_of_4 images_1_of_4">
				<a href="/chi-tiet-san-pham/${pro.id }"><img src="<c:url value="/layout/uploads/${ pro.img}"/>" height="120px" alt="" /></a>
				<h2>${pro.name }</h2>
				
				
				<p>
					<span class="price"> <fmt:formatNumber type="number" groupingUsed="true" value="${pro.price }"   /> VNĐ</span>
				</p>
				<div style="display: flex;" class="button">
				<div class="button left">
					<span><a href="<c:url value="/chi-tiet-san-pham/${pro.id }"/> " class="details">Chi tiết</a></span>
				</div>
				<div class="button right">
					<span><a href="<c:url value="/AddCart/${pro.id }"/> " class="details">Thêm </a></span>
				</div>
				</div>
				
			</div>
		</c:forEach>
			
			
		</div>
		<div class="content_bottom">
			<div class="heading">
				<h3>Sản phẩm mới</h3>
			</div>
			<div class="clear"></div>
		</div>
		<div class="section group">
			<c:forEach items="${productnew }" var="productnew">
		<div class="grid_1_of_4 images_1_of_4">
				<a href="<c:url value="/chi-tiet-san-pham/${productnew.id }"/>"><img src="<c:url value="/layout/uploads/${productnew.img}"/>" height="120px" alt="" /></a>
				<h2>${productnew.name }</h2>
				
				
				<p>
					<span class="price"> <fmt:formatNumber type="number" groupingUsed="true" value="${productnew.price }"   /> đ</span>
				</p>
				<div style="display: flex;" class="button">
				<div class="button left">
					<span><a href="<c:url value="/chi-tiet-san-pham/${productnew.id }"/> " class="details">Chi tiết</a></span>
				</div>
				<div class="button right">
					<span><a href="<c:url value="/AddCart/${productnew.id }"/> " class="details">Thêm </a></span>
				</div>
				</div>
			</div>
		</c:forEach>
			
			
			
		</div>
	</div>
</div>




</body>
</html>
