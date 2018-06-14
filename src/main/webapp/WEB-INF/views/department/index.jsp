<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý phòng ban</title>
<%@include file="/WEB-INF/views/common/head.jsp"%>
<style type="text/css">
*[id$=errors] {
	color: red;
	font-style: normal;
}
</style>
</head>
<body>
	<%@include file="/WEB-INF/views/common/navbar_ad.jsp"%>
	<div class="container">
		<div align="center">
			<h2>Quản lý phòng ban</h2>
			<br>
			<div class="btn btn-sm btn-danger">
				<a href="<spring:url value="/department/create"></spring:url>"
					style="color: white;">Thêm phòng ban</a>
			</div>
		</div>

		<br>
		<h3>Danh sách phòng ban</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>STT</th>
					<th>Mã phòng</th>
					<th>Tên phòng</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dp" items="${departs}" varStatus="count">
					<tr>
						<td>${count.count}</td>
						<td>${dp.id}</td>
						<td>${dp.name}</td>
						<td><div class="btn btn-sm btn-danger">
								<a href="<c:url value='/department/edit-departs=${dp.id}' />  "
									style="color: white;">Sửa</a>
							</div>
							<div class="btn btn-sm btn-danger">
								<a
									href="<c:url value='/department/delete-departs=${dp.id}' />  "
									onclick="return confirm('Bạn có muốn xóa không ?')"
									style="color: white;">Xóa</a>
							</div></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</html>