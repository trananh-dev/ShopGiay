<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanh toán</title>


</head>
<body>
<style type="text/css">
.box_left {
	width: 50%;
	border: 1px solid #666;
	float: left;
	padding: 4px;
}

.box_right {
	width: 47%;
	border: 1px solid #666;
	float: right;
	padding: 4px;
}

a.a_order {
	background: red;
	padding: 7px 20px;
	color: #fff;
	font-size: 21px;
}
</style>
<form action="" method="POST">
	<div class="main">
		<div class="content">
			<div class="section group">
				<div class="heading">
					<h3>Chi tiết đơn hàng</h3>
				</div>

				<div class="clear"></div>
				<div class="box_left">
					<div class="cartpage">
	
						
						<table class="tblone">
							<tr>
								
								<th width="15%">Tên</th>
								<th width="20%">Ảnh</th>
								<th width="15%">Giá</th>
								<th width="15%">Số lượng</th>
								<th width="25%">Tổng tiền</th>

							</tr>
							<c:forEach var="item" items="${ Cart }" varStatus="1">
							<tr>
								
								<td>
									${item.value.product.name }
								</td>
								<td>
									<img src="<c:url value="/layout/uploads/${ item.value.product.img }"/>" alt="" height="350px" />
								</td>
								<td>
								<fmt:formatNumber type="number" groupingUsed="true" value="${ item.value.product.price }"/> VNĐ
									
								</td>
								<td>
									${item.value.quanty }

								</td>
								<td>
								<fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice }"/> VNĐ
									
								</td>

							</tr>
							</c:forEach>

						</table>
						
						<table style="float: right; text-align: left; margin: 5px"
							width="40%">
							<tr>
								<th>Tổng tiền :</th>
								<td><fmt:formatNumber type="number" groupingUsed="true" value="${TotalPriceCart }"/> VNĐ
									
								</td>
							</tr>
							

						</table>
						


					</div>
				</div>
				<div class="box_right">
				<c:if test="${not empty LoginInfo }">
				
				
					<table class="tblone">
						
						<tr>
							<td>Tên</td>
							<td>:</td>
							<td>
								${LoginInfo.name }
							</td>
						</tr>
						<tr>
							<td>Số điện thoại</td>
							<td>:</td>
							<td>
								${LoginInfo.phone }
							</td>
						</tr>
						<tr>
							<td>Email</td>
							<td>:</td>
							<td>
								${LoginInfo.email }
							</td>
						</tr>
						<tr>
							<td>Địa chỉ</td>
							<td>:</td>
							<td>
								${LoginInfo.add }
							</td>
						</tr>
						<tr>
							<td>Tỉnh</td>
							<td>:</td>
							<td>
								${LoginInfo.city }
							</td>
						</tr>
						
						
						
						
						
						<tr>
							<td colspan="3"><a href="<c:url value="/User/${LoginInfo.id }"/>">Sửa thông tin </a></td>

						</tr>

						
					</table>
					</c:if>
				</div>

			</div>

		</div>
		<center>
			<a href="<c:url value="/dat-hang" />" name="luu" class="a_order">Đặt hàng</a>
		</center>
		<br>


	</div>
</form>


</body>
</html>