<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
*[id$=errors] {
	color: red;
	font-style: normal;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý nhân viên</title>
<%@include file="/WEB-INF/views/common/head.jsp"%>
</head>
<body>
	<%@include file="/WEB-INF/views/common/navbar_ad.jsp"%>

	<center>
		<h2>Quản lý nhân viên</h2>
		<br>
		<div class="container">

			<div class="btn btn-sm btn-danger">
				<a href="<spring:url value="/staffs/create"></spring:url>"
					style="color: white;">Thêm nhân viên</a>
			</div>
		</div>
	</center>
	<br>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>STT</th>
				<th>Mã NV</th>
				<th>Tên NV</th>
				<th>Giới tính</th>
				<th>Ngày sinh</th>
				<th>Hình ảnh</th>
				<th>Email</th>
				<th>SĐT</th>
				<th>Lương</th>
				<th>Ghi chú</th>
				<th>Phòng ban</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="st" items="${staffs}" varStatus="count">
				<tr>
					<td>${count.count}</td>
					<td>${st.id}</td>
					<td>${st.name}</td>
					<td><c:choose>
							<c:when test="${st.gender == 'false'}">Nữ
							</c:when>
							<c:when test="${st.gender == 'true'}">Nam
						</c:when>
						</c:choose></td>
					<td><fmt:formatDate value="${st.birthday}"
							pattern="dd-MM-yyyy" /></td>
					<td><img style="width: 100px; height: 100px"
						src="<c:url value="${st.photo}"/>" alt="${st.name}" /></td>
					<td>${st.email}</td>
					<td>${st.phone}</td>
					<td>${st.salary}</td>
					<td>${st.notes}</td>
					<td>${st.depart.name}</td>
					<td><div class="btn btn-sm btn-danger">
							<a href="<c:url value='/staffs/edit-staffs=${st.id}' />  "
								style="color: white;">Sửa</a>
						</div></td>
					<td><div class="btn btn-sm btn-danger">
							<a href="<spring:url value='/staffs/delete-staffs=${st.id}' />  "
								onclick="return confirm('Bạn có muốn xóa không ?')"
								style="color: white;">Xóa</a>
						</div></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div></div>
</body>
</html>
