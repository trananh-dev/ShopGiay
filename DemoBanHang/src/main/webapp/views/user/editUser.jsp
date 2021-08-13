<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Sửa thông tin khách hàng</title>
<body>
	 <div class="main">
    <div class="content">
    	<div class="section group">
    		<div class="content_top">
	    		<div class="heading">
	    		<h3>Thông tin khách hàng</h3>
	    		</div>
	    		<div class="clear"></div>
    		</div>
    		
			<form:form action="/DemoBanHang/EditUser/${user1.id } "  method="POST" modelAttribute="user1">
			<table class="tblone">
				
				<tr>
					<td>Tên</td>
					<td>:</td>
					<td>
					<form:input path="name"
								placeholder="Nhập tên ..." class="medium" />
					
					</td>
				</tr>
				
				<tr>
					<td>Số điện thoại</td>
					<td>:</td>
					<td><form:input path="phone"
								placeholder="Nhập số điện thoại ..." class="medium" />
					</td>
				
				</tr>
			
				
				<tr>
					<td>Email</td>
					<td>:</td>
					<td><form:input path="email"
								placeholder="Nhập email ..." class="medium" /></td>
					
				</tr>
				<tr>
					<td>Địa chỉ</td>
					<td>:</td>
					<td><form:input path="add"
								placeholder="Nhập địa chỉ ..." class="medium" /></td>
					
				</tr>
				<tr>
					<td>Tỉnh</td>
					<td>:</td>
					<td><form:input path="city"
								placeholder="Nhập tỉnh ..." class="medium" /></td>
					
				</tr>
				<tr>
					<td colspan="3"><button type="submit" name="save" >Save</button></td>
					
					
				</tr>
				
				
			</table>
			</form:form>
			
 		</div>
 	</div>
 	</div>
 	
</body>
</html>