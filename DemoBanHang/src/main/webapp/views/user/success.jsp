<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đặt hàng</title>


</head>
<body>
	<div style="height:300px " class="main">
		<div class="content">
			<div class="section group">
				<h2 class="success_order">Đặt hàng thành công</h2>
				<c:if test="${not empty Cart }">
					<p class="success_note">
						Tổng tiền đơn hàng bạn đã đặt mua :
						<fmt:formatNumber type="number" groupingUsed="true"
							value="${TotalPriceCart }"/>  ₫ 
					</p>
				</c:if>
				<p class="success_note">
					Chúng tôi sẽ liên hệ bạn sớm ,xem chi tiết đơn hàng của bạn tại đây
					<a href="<c:url value="/order-detail/${LoginInfo.id }"/>">Click Here</a>
				</p>
				
			</div>

		</div>

	</div>
	</body>