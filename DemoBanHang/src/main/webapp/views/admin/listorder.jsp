<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết đơn hàng</title>
</head>
<body>
	<div class="grid_10">
            <div class="box round first grid">
                <h2>Inbox</h2>
                <div class="block">             
                    <table class="data display datatable" id="example">
					<thead>
						<tr>
							<th>Stt</th>
							<th>Ngày đặt</th>
							<th>Sản phẩm</th>
							
							<th>Số lượng</th>
							<th>Tổng tiền</th>
							<th>Mã Khách hàng</th>
							<th>Thông tin</th>
							<th>Tình trạng</th>
						</tr>
					</thead>
					<tbody>
					<%int i = 0;%>
					<c:forEach items="${order }" var="item">
					<%i++;%>
					<tr class="odd gradeX">
							<td><%=i%></td>
					
	
						
							<td>${item.date }</td>
							<td>${item.pName }</td>
							<td>${item.count }</td>
							
							<td><fmt:formatNumber type="number" groupingUsed="true" value="${item.price }" /> VNĐ</td>
							<td>${item.id_user }</td>
							<td><a href="">View Customer</a></td>
							<td>
							<c:if test="${item.status == 0 }">
									<td><a href="">Đang xử lý</a></td>
								</c:if>
								<c:if test="${item.status == 1 }">
									<td><a href="">Đang chuyển hàng</a></td>
								</c:if>
								<c:if test="${item.status == 2 }">
									<td><a href="">Thành công</a></td>
								</c:if>




								
							</td>
						</tr>
						</c:forEach>
						
					</tbody>
				</table>
               </div>
            </div>
        </div>
<script type="text/javascript">
    $(document).ready(function () {
        setupLeftMenu();

        $('.datatable').dataTable();
        setSidebarHeight();
    });
</script>
</body>