<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Danh sách sản phẩm</title>
<div class="grid_10">
	<div class="box round first grid">
		<h2>Post List</h2>
		<div class="block">
			<table class="data display datatable" id="example">
				<thead>
					<tr>
						<th width="5%">ID</th>
						<th width="10%">Tên</th>
						<th width="12%">Ảnh</th>
						<th width="10%">Danh mục</th>
						<th width="10%">Thương hiệu</th>
						<th width="15%">Mô tả</th>
						<th width="10%">Giá</th>
						<th width="10%">Giảm giá</th>
						<th width="10%">Loại</th>

						<th width="25%">Xử lý</th>
					</tr>
				</thead>
				<tbody>
					<c:url value="/quan-tri/product/view" var="edit" />
					<c:url value="/quan-tri/product/del" var="delete" />
					<%int i = 0;%>
					<c:forEach items="${products }" var="item">
						<%i++;%>
						<tr class="odd gradeX">
							<td><%=i%></td>
							<td>${ item.name}</td>
							<td><img src="<c:url value="/layout/uploads/${ item.img}"/>"
								width="100"></td>
							<td>${ item.catid}</td>
							<td>${ item.brandid}</td>
							<td>${ item.desciption}</td>
							<td><fmt:formatNumber type="number" groupingUsed="true" value="${ item.price}"   /> VNĐ
							</td>
							<td>${ item.discount}</td>
			<c:if test="${item.type == 1 }">
				<td>Nổi bật</td>
				</c:if>
				<c:if test="${item.type == 2 }">
				<td>Không nổi bật</td>
				</c:if>
							
							<td><a href="${edit }/${item.id }">Edit</a> || <a
								href="${delete }/${item.id }">Delete</a></td>
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