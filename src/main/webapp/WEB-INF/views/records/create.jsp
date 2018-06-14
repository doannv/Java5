<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thêm thành tích hoặc kỷ luật</title>
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
			 <spring:url value="/records/create" var="createAction"></spring:url>
			<form:form action="${createAction}" modelAttribute="rc">
				<div>
					<label>Nhân viên</label>
					<form:select path="staff.id" items="${staffs}" itemValue="id"
						itemLabel="name" />
				</div>
				<div>
					<label>Loại</label>
					<form:radiobutton path="type" value="true" label="Thành tích" />
					<form:radiobutton path="type" value="false" label="Kỷ luật" />
				</div>
				<div>
					<p>
						<label>Lý do</label>
					</p>
					<form:textarea path="reason" style="width:500px;" rows="5" />
				</div>
				<br>
				<div>
					<button class="btn btn-sm btn-danger">Thêm</button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>