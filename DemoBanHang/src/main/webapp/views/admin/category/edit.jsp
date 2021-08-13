<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Danh mục</title>
<div class="grid_10">
	<div class="box round first grid">
		<h2>Sửa danh mục</h2>
		<div class="block copyblock">
			<c:url value="/quan-tri/category/update" var="url" />
			<form:form action="${url }" method="POST" modelAttribute="category">
				<table class="form">
				<form:input path="id" type="hidden" readonly="true" />
					<tr>
						<td><form:input path="name"
								placeholder="Nhập tên thương hiệu..." class="medium" /></td>
					</tr>
					<tr>
						<td><input type="submit" name="submit" Value="Save" /></td>
					</tr>
				</table>
			</form:form>

		</div>
	</div>
</div>