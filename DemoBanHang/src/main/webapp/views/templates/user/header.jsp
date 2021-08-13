<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<head>
<title>Website</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='<c:url value="/layout/user/css/style.css"/>'
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/layout/user/css/menu.css"/>  "
	rel="stylesheet" type="text/css" media="all" />
<script src=" <c:url value="/layout/user/js/jquerymain.js"/> "></script>
<script src=" <c:url value="/layout/user/js/script.js"/> "
	type="text/javascript"></script>
<script type="text/javascript"
	src="<c:url value="/layout/user/js/jquery-1.7.2.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/layout/user/js/nav.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/layout/user/js/move-top.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/layout/user/js/easing.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/layout/user/js/nav-hover.js"/> "></script>
<link href='http://fonts.googleapis.com/css?family=Monda'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Doppio+One'
	rel='stylesheet' type='text/css'>
<script type="text/javascript">
	$(document).ready(function($) {
		$('#dc_mega-menu-orange').dcMegaMenu({
			rowItems : '4',
			speed : 'fast',
			effect : 'fade'
		});
	});
</script>
</head>
<body>
	<div class="wrap">
		<div class="header_top">
			<div class="logo">
				<a href="<c:url value="/"/>"><img
					src="<c:url value="/layout/user/images/logo.png"/> " alt="" /></a>
			</div>
			<div class="header_top_right">
				<div class="search_box">
					<form>
						<input type="text" value="Nhập sản phẩm cần tìm"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Nhập sản phẩm cần tìm';}"><input
							type="submit" value="Tìm kiếm">
					</form>
				</div>
				<c:if test="${not empty TotalQuantyCart }">
				
				
				<div class="shopping_cart">
					<div class="cart">
						<a href="<c:url value="/gio-hang"/>" title="View my shopping cart"
							rel="nofollow"> <span class="cart_title">(${ TotalQuantyCart   })
						</span> <span class="no_product"><fmt:formatNumber type="number"
									groupingUsed="true" value="${ TotalPriceCart }" /> VNĐ</span>
						</a>
					</div>
				</div></c:if>
				<c:if test="${ empty TotalQuantyCart }">
				
				
				<div class="shopping_cart">
					<div class="cart">
						<a href="<c:url value="/gio-hang"/>" title="View my shopping cart"
							rel="nofollow"> <span class="cart_title">(${ TotalQuantyCart =0  })
						</span> <span class="no_product"><fmt:formatNumber type="number"
									groupingUsed="true" value="${ TotalPriceCart=0 }" /> VNĐ</span>
						</a>
					</div>
				</div></c:if>
				<c:if test="${empty LoginInfo }">
					<div class="login">
						<a href="<c:url value="/dang-ki"/>">Đăng nhập</a>
					</div>
				</c:if>
				<c:if test="${not empty LoginInfo }">
					<div class="login">
						<a href="<c:url value="/dang-xuat"/>">Đăng xuất</a>
					</div>
				</c:if>


				<div class="clear"></div>
			</div>
			<div class="clear"></div>
		</div>

		<div class="menu">
			<ul id="dc_mega-menu-orange" class="dc_mm-orange">
				<li class="active"><a href='<c:url value="/"/>'>Trang chủ</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> Danh mục <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach items="${cat}" var="item">
							<li><a href="<c:url value="/productbycat/${item.id }"/>">${item.name}</a></li>
						</c:forEach>


					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Thương hiệu <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach items="${brand}" var="item">
							<li><a href="<c:url value="/productbybrand/${item.id }"/> ">${item.name}</a></li>
						</c:forEach>
					</ul></li>

				<li><a href="<c:url value="/gio-hang"/>">Giỏ hàng</a></li>
				<c:if test="${not empty LoginInfo }">
					<li><a href="<c:url value="/order-detail/${LoginInfo.id }"/>">Đơn hàng</a></li>
					
				</c:if>
				<li><a href="contact.html">Tin tức</a></li>
				<li><a href="contact.html">Liên hệ</a></li>

				<div class="clear"></div>
			</ul>
		</div>