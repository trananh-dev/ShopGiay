<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/layout/admin/css/stylelogin.css"/> "
	media="screen" />
</head>
<body>
	<div class="container">
		<section id="content"><h1>Admin Login</h1>

			<form:form action="loginAdmin"   method="POST" modelAttribute="admin">
				


				<div>
					<form:input path="name" placeholder="Nhập tên ..."
						class="medium" required="" />

				</div>
				<div>
					<form:input path="pass" type="password" placeholder="Nhập mật khẩu ..."
						class="medium" required="" />
				</div>
				<div>
					<input type="submit" name="btndn" value="Đăng nhập" />
				</div>
				<br>
				<span>${tblogin } </span>


			</form:form>
			
		</section>
		<!-- content -->
	</div>
	<!-- container -->
</body>
</html>