<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Thương hiệu</title>
<div class="grid_10">
	<div class="box round first grid">
		<h2>Thêm thương hiệu</h2>
		<div class="block copyblock">
			<c:url value="/quan-tri/brand/saveadd" var="save" />
			<form:form action="${save }" method="POST" modelAttribute="brand">
				<table class="form">
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