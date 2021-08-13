<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Danh sách</title>
<div class="grid_10">
	<div class="box round first grid">
		<h2>Danh sách thương hiệu</h2>
		<div class="block">
			<table class="data display datatable" id="example">
				<thead>
					<tr>
						<th>Mã số</th>
						<th>Tên thương hiệu</th>
						<th>Xử lý</th>
					</tr>
				</thead>
				<tbody>
				<c:url value="/quan-tri/brand/view" var="edit" />
				<c:url value="/quan-tri/brand/del" var="delete" />
				<%int i = 0;%>
				<c:forEach items="${brands }" var="item">
				<%i++;%>
				<tr class="odd gradeX">
						<td><%=i%></td>
						<td>${ item.name}</td>
						<td><a href="${edit }/${item.id }">Edit</a> || <a href="${delete }/${item.id }">Delete</a></td>
					</tr>
				
				</c:forEach>
					
					
				</tbody>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		setupLeftMenu();

		$('.datatable').dataTable();
		setSidebarHeight();
	});
</script>