<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Giỏ hàng</title>
<body>
	<div class="main">
		<div class="content">
			<div class="cartoption">
				<div class="cartpage">
					<h2>Giỏ hàng</h2>
					<table class="tblone">
						<tr>
							<th width="20%">TÊN SẢN PHẨM</th>
							<th width="10%">ẢNH</th>
							
							<th width="15%">GIÁ</th>


							<th width="15%">SỐ LƯỢNG</th>
							<th width="15%">Thành tiền</th>
							<th width="10%">Xử Lý</th>
						</tr>
						<c:forEach var="item" items="${ Cart }">
							<tr>
								<td>${item.value.product.name }</td>
								<td><img src="<c:url value="/layout/uploads/${ item.value.product.img }"/>" alt="" width="150px"
									, heigth="150px" /></td>
									
								<td><fmt:formatNumber type="number" groupingUsed="true" value="${ item.value.product.price }"/> VNĐ</td>

								<td>
									<form action="EditCart/${item.key}" method="post">
										<input type="hidden" name="cartId" value="" /> <input
											type="number" name="quantity" value="${item.value.quanty }" />
										<input type="submit" name="submit" value="Update" />
									</form>
								</td>
								<td><fmt:formatNumber type="number" groupingUsed="true" value="${ item.value.totalPrice }"/> VNĐ</td>


								
								<td><a onclick="return confirm('Bạn có muốn xóa không?');"
									href="<c:url value="DeleteCart/${item.key}"/>">Xóa</a></td>
							</tr>
						</c:forEach>

					</table>
					<c:if test="${not empty Cart }">
						<table style="float: right; text-align: left;" width="40%">
							<tr>
								<th>Tổng tiền :</th>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${TotalPriceCart }" /> VNĐ</td>
							</tr>



						</table>
					</c:if>
				</div>
				<div class="shopping">
					<div class="shopleft">
						<a href="<c:url value="/"/>"> <img
							src="<c:url value="/layout/user/images/shop.png"/>" alt="" /></a>
					</div>
					<div class="shopright">
						<a href="<c:url value="checkUser"/>"> <img
							src="<c:url value="/layout/user/images/check.png"/> " alt="" /></a>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</body>
</html>