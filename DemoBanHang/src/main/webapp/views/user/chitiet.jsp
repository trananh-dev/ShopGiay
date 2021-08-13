<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sản phẩm</title>
</head>

<body>
	<div class="main">
		<div class="content">
			<div class="section group">
				<div class="cont-desc span_1_of_2">

					<div class="grid images_3_of_2">

						<img src="<c:url value="/layout/uploads/${chitiet.img }"/>" alt="" />
					</div>
					<div class="desc span_3_of_2">
						<h2>${chitiet.name}</h2>
						<p>${chitiet.desciption }</p>
						<div class="price">
							<p>
								Giá : <span> <fmt:formatNumber type="number"
										groupingUsed="true" value="${chitiet.price }" /> VNĐ
								</span>
							</p>
							<p>
								Danh mục: <span>${catName.name }</span>
							</p>
							<p>
								Thương hiệu:<span>${br.name }</span>
							</p>
						</div>
						<div class="add-cart">
							<form action="<c:url value="/AddCartQuanty/${ chitiet.id }"/>" method="post">
								<label>Kích thước</label> <select style="height: 30px;"
									id="select">
									<option>---Chọn kích thước---</option>
									<c:forEach items="${ctsanpham}" var="ite">

										<option value="${ite.size}">${ite.size}</option>
										

									</c:forEach>

								</select> <br>
								<br> <span style="margin-top: 14px"">Số lượng :</span><input
									type="number" class="buyfield" name="quantity" value="1" min="1" max="1000" /><br>
								<br> 
								<input type="submit" class="buysubmit" name="submit"
									value="Thêm giỏ hàng" />
									
							</form>
						</div>
					</div>
					<div class="product-desc">
						<h2>Chi tiết sản phẩm</h2>
						<p>${chitiet.desciption }</p>
					</div>





				</div>
			</div>
</body>
</html>