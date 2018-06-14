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
			${message}
			 <spring:url value="/department/create" var="createAction"></spring:url>
			<form:form action="${createAction}" method="POST" modelAttribute="dp">
				<div>
					<label>Mã phòng</label>
					<form:errors path="id" />
					<br>
					<form:input path="id" />
					<br>
				</div>
				<div>
					<label>Tên phòng</label>
					<form:errors path="Name" />
					<br>
					<form:input path="Name" />
				</div>
				<br>
				<div>
					<button class="btn btn-sm btn-danger">Thêm</button>
				</div>
			</form:form>
		</div>

		<br>

	</div>
</html>