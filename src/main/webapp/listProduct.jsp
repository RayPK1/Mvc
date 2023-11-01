<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hàng hóa</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style type="text/css">
	table th, td {
		padding: 10px;
		border: 2px solid black;
	}
	
	.delete {
		color: pink;
	}
	
	.delete:hover {
		color: blue;
	}
</style>
</head>
<body>
	<div style="width: 30%; margin: auto;">
		<div class="title" style="text-align: center">
			<h2>Danh sách hàng hóa</h2>
		</div>
		<div class="content" style="text-align: center">
			<table>
				<thead>	
					<tr>
						<th>Tên hàng</th>
						<th>Số lượng</th>
						<th>Giá cả</th>
						<th>Khác</th>
						<th style="display: none"></th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${not empty productList}">
							<c:forEach var="product" items="${productList}">
								<tr>
									<td>${product.name}</td>
									<td>${product.quantity}</td>
									<td>${product.price}</td>
									<td>
										<a href="${contextPath}/detail?UserId=${product.id}">Sửa</a>&nbsp;
										<a onclick="del(${product.id});" class="delete btn btn-warning">Xóa</a>
									</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<h3 style="text-align: center">Hết hàng</h3>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
			<a href="${contextPath}/add" class="btn btn-success">Thêm hàng hóa</a>
		</div>
	</div>
</body>
<script type="text/javascript">
	function del(id) {
			console.log(id);
			if(confirm("Bạn có chắc muốn xóa sản phẩm này?")){
				location.href='${contextPath}/delete?UserId='+id;
			}
		};
</script>
</html>