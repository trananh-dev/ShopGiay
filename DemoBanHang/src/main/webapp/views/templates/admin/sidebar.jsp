<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="grid_2">
	<div class="box sidemenu">
		<div class="block" id="section-menu">
			<ul class="section menu">

				<li><a class="menuitem">Danh mục</a>
					<ul class="submenu">
						<li><a href='<c:url value="/quan-tri/category/add"/>'>Thêm danh mục</a></li>
						<li><a href="<c:url value="/quan-tri/category/list"/>">Danh sách danh mục</a></li>
					</ul></li>
					
					<li><a class="menuitem">Thương hiệu</a>
					<ul class="submenu">
						<li><a href='<c:url value="/quan-tri/brand/add"/>'>Thêm thương hiệu</a></li>
						<li><a href="<c:url value="/quan-tri/brand/list"/>">Danh sách thương hiệu</a></li>
					</ul></li>
					
					<li><a class="menuitem">Sản phẩm</a>
					<ul class="submenu">
						<li><a href="<c:url value="/quan-tri/product/add"/>">Thêm sản phẩm</a></li>
						<li><a href="<c:url value="/quan-tri/product/list"/>">Danh sách sản phẩm</a></li>
					</ul></li>
				
			</ul>
		</div>
	</div>
</div>