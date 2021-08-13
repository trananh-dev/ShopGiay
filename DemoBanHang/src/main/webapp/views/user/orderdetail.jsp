<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết đơn hàng</title>
</head>
<body>
	<div class="main">
		<div class="content">
			<div class="cartoption">
				<div class="cartpage">
					<h2>Đơn hàng</h2>

					<table class="tblone">
						<tr>
							<th width="10%">ID</th>
							<th width="10%">Tên sản phẩm</th>
							<th width="10%">Ảnh</th>


							<th width="15%">Tổng tiền</th>


							<th width="10%">Số lượng</th>
							<th width="10%">Ngày đặt</th>

							<th width="10%">Tình trạng</th>

							<th width="10%">Xử lý</th>
						</tr>
						<%
						int i = 0;
						%>
						<c:forEach items="${ order}" var="item">
							<%
							i++;
							%>
							<tr>
								<td><%=i%></td>
								<td>${item.pName }</td>
								<td><img
									src="<c:url value="/layout/uploads/${item.img }"/>"></td>
								<td><fmt:formatNumber type="number" groupingUsed="true" value="${item.price }" /> VNĐ
								</td>
								<td>${item.count }</td>
								<td>
								${item.date }</td>

								<c:if test="${item.status == 0 }">
									<td>Đang xử lý</td>
								</c:if>
								<c:if test="${item.status == 1 }">
									<td>Đang chuyển hàng</td>
								</c:if>
								<c:if test="${item.status == 2 }">
									<td>Hàng đã giao</td>
								</c:if>




								<td><a href="">Đã xác nhận</a></td>


							</tr>
						</c:forEach>


					</table>





				</div>
				<div class="shopping">
					<div class="shopleft">
						<a href="index.php"> <img src="images/shop.png" alt="" /></a>
					</div>

				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</body>