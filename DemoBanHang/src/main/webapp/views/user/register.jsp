<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng kí</title>
</head>
<body>

	<div class="main">
		<div class="content">
			<div class="login_panel">
				<h3>Đăng nhập</h3>
				<p>Nhập thông tin tài khoản.</p>
				
				<form:form action="dang-nhap" method="POST" modelAttribute="user">
					
						<form:input path="email" class="field" required="required" placeholder="Nhập Email...." />
						
						<form:input path="pass" type="password" required="required" class="field" placeholder="Nhập passwword...."/>
						

					<p class="note">
						Quên mật khẩu <a href="#">Tại đây</a>
					</p>
					<h3>${tblogin }</h3>
					<div class="buttons">
						<div>
							<input type="submit" name="login" class="grey" value="Đăng nhập">
						</div>
					</div>
				</form:form>
			</div>
			<div class="register_account">
				<h3>Đăng kí tài khoản mới</h3>
				
				<form:form action="dang-ki" method="POST" modelAttribute="user">
					<table>
						<tbody>
							<tr>
								<td>
									<div>
									<form:input path="name" placeholder="Nhập tên...." required="required" />
										
									</div>
									

									<div>
									<form:input path="add" placeholder="Nhập địa chỉ...."  required="required" />
										
									</div>

									
									<div>
									<form:input path="email" placeholder="Nhập Email...." required="required" />
										
									</div>
								</td>
								<td>
								<div>
								<form:input path="phone" placeholder="Nhập phone...." required="required" />
										
									</div>
									<div>
									<form:input path="city" placeholder="Nhập thành phố...." required="required" />
										
									</div>
									<div>
									<form:input   path="pass" placeholder="Nhập passwword...." required="required"/>
										
									</div>
								</td>
							</tr>
						</tbody>
					</table>


					<div class="search">
						<div>
							<input type="submit" name="submit" class="grey" value="Đăng kí">
						</div>
					</div>
					<p class="terms">
						Đăng kí tài khoản <a href="#">Tại đây</a>.
					</p>
					<h3>${tb }</h3>
					<div class="clear"></div>
				</form:form>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	</div>
</body>
</html>