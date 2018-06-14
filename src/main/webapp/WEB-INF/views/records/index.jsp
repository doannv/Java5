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
			<h2>Quản lý thành tích và kỷ luật</h2>
			<br>
			<div class="btn btn-sm btn-danger">
				<a href="<spring:url value="/records/create"></spring:url>"
					style="color: white;">Thêm thành tích hoặc kỷ luật</a>
			</div>
		</div>

		<br>
		<h3>Danh sách thành tích và kỷ luật</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>STT</th>
					<th>Nhân viên</th>
					<th>Tổng thành tích</th>
					<th>Tổng kỷ luật</th>
					<th>Điểm thưởng</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="rc" items="${records}" varStatus="count">
					<tr>
						<td>${count.count}</td>
						<td>${rc.staff.name}</td>
						<td></td>
						<td></td>
						<td></td>
						<td><div class="btn btn-sm btn-danger">
								<a href="<c:url value='/records/edit-records=${rc.id}' />  "
									style="color: white;">Sửa</a>
							</div>
							<div class="btn btn-sm btn-danger">
								<a
									href="<c:url value='/records/delete-departs=${rc.id}' />  "
									onclick="return confirm('Bạn có muốn xóa không ?')"
									style="color: white;">Xóa</a>
							</div></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</html>