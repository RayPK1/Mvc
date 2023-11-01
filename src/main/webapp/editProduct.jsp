<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SỬA HÀNG</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style type="text/css">
	.content, .information {
		padding: 15px;
		color:pink
	}
</style>
</head>
<body>
	<div style="width: 25%; margin: auto;">
		<c:set var="id" value="${id}"/>
		<form:form action="${contextPath}/update?UserId=${id}" method="POST" modelAttribute="product">
			<div class="title" style="text-align: center">
				<h2>Thông tin hàng hóa</h2>
			</div>
			<div class="content" >
				
				<div class="information">
					<label>ID</label>
					<form:input path="id" disabled="true"/>
					<form:hidden path="id"/>
				</div>
				<div class="information">
					<label>Tên hàng</label>
					<form:input path="name"/>
				</div>
				<div class="information">
					<label>Số lượng</label>
					<form:input path="quantity"/>
				</div>
				<div class="information">
					<label>Giá cả</label>
					<form:input path="price"/>
				</div>
			</div>
			<div class="row">
				<div class="col-8">
					<form:button class="btn btn-success">SỬA</form:button>
				</div>
			</div>
		</form:form>
		<div class="row">
			<div class="col-4 offset-8">
				<button class="btn btn-warning" style="float: right" id="back">Trở
					lại</button>
			</div>
	</div>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function() {		
		$("#back").on('click', function() {
			window.history.back();
		});
	})
</script>
</html>