<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Sản phẩm</title>
<div class="grid_10">
	<div class="box round first grid">
		<h2>Sửa sản phẩm</h2>
		<div class="block">
			<c:url value="/quan-tri/product/update" var="save" />
			<form:form action="${save }" method="POST"
				enctype="multipart/form-data" modelAttribute="product">
				<table class="form">
					<form:input path="id" type="hidden" readonly="true" />
					<tr>
						<td><label>Tên sản phẩm</label></td>
						<td><form:input path="name" type="text"
								placeholder="Nhập tên sản phẩm..." class="medium" /></td>
					</tr>
					<tr>
						<td><label>Danh mục</label></td>
						<td><form:select id="select" path="catid">
								<option>Chọn danh mục</option>
								<c:forEach items="${categorys }" var="cat">
									<option value="${product.catid }">${cat.name }</option>
								</c:forEach>
							</form:select></td>
					</tr>
					<tr>
						<td><label>Thương hiệu</label></td>
						<td><form:select id="select" path="brandid">
								<option>Chọn thương hiệu</option>
								<c:forEach items="${brands }" var="brand">
									<option value="${brand.id }">${brand.name }</option>
								</c:forEach>
							</form:select></td>
					</tr>

					<tr>
						<td style="vertical-align: top; padding-top: 9px;"><label>Mô
								tả</label></td>
						<td><form:textarea path="desciption" class="tinymce"></form:textarea></td>
					</tr>
					<tr>
						<td><label>Giá</label></td>
						<td><form:input type="text" path="price"
								placeholder="Nhập giá..." class="medium" value="" /></td>
					</tr>
					<tr>
						<td><label>Giảm giá</label></td>
						<td><form:input type="text" path="discount"
								placeholder="Nhập mã giảm giá..." class="medium" value="" /></td>
					</tr>

					<tr>
						<td><label>Ảnh sản phẩm</label></td>

						<td><input multiple="multiple" name="filename" type="file" />
							<img src="<c:url value="/layout/uploads/${ product.img}"/>"
							width="90"></td>
					</tr>

					<tr>

						<td><label>Loại sản phẩm</label></td>
						<td><form:select id="select" path="type">
								<option>Loại sản phẩm</option>
								<option value="1">Nổi bật</option>
								<option value="2">Không nổi bật</option>
							</form:select></td>
					</tr>

					<tr>
						<td></td>
						<td><input type="submit" name="submit" Value="Lưu" /></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</div>
<!-- Load TinyMCE -->
<script src="js/tiny-mce/jquery.tinymce.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		setupTinyMCE();
		setDatePicker('date-picker');
		$('input[type="checkbox"]').fancybutton();
		$('input[type="radio"]').fancybutton();
	});
</script>