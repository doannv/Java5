<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sửa phòng ban</title>
<%@include file="/WEB-INF/views/common/head.jsp"%>
<style type="text/css">
*[id$=errors] {
	color: red;
	font-style: normal;
}
</style>

</head>
<%@include file="/WEB-INF/views/common/navbar_ad.jsp"%>

<body>
	<div class="container">
		<div align="center">
			<h3>${message}</h3>
			
			<form:form method="post" modelAttribute="itemDeparts" >
				<div>
					<label>Mã phòng</label> <br>
					<form:input path="id" disabled="true" value="${itemDeparts.id}" />
				</div>
				<div>
					<label>Tên phòng ban</label>
					<form:errors path="Name" />
					<br>
					<form:input path="Name" value="${itemDeparts.name}" />
					<br>
				</div><br>
				<div>
					<button class="btn btn-sm btn-danger">Sửa</button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>