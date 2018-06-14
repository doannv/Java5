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
		<h2>Sửa nhân viên</h2>
		<br>
		<h3 style="color: red;">${message }</h3>
		<div class="container">
			<form:form method="post" modelAttribute="itemStaffs">
				<div class="form-row">
					<div class="col-md-4 mb-3">
						<form:input class="form-control" path="id"
							placeholder="Mã nhân viên" disabled="true" value="${itemStaffs.id}" />
						<form:errors path="id" />
					</div>
					<div class="col-md-4 mb-3">
						<form:input class="form-control" path="Name"
							placeholder="Tên nhân viên" value="${itemStaffs.name}" />
						<form:errors path="Name" />
					</div>
					<div class="col-md-4 mb-3">
						<div class="input-group">
							<div class="form-group col-md-4">
								<form:select path="Gender" class="form-control">
									<option value="true" ${itemStaffs.gender=='true'}>Nam</option>
									<option value="false" ${itemStaffs.gender=='false'}>Nữ</option>
								</form:select>

							</div>
						</div>
					</div>
					<div class="col-md-4 mb-3">
						<form:input style="width: 200px; margin-right: 350px;"
							class="form-control" path="Birthday"
							value="${itemStaffs.birthday}" />							
						<form:errors path="Birthday" />
					</div>
					<div class="col-md-4 mb-3">
						<form:errors path="Photo" />
						<form:input path="Photo" style="margin-right: 500px;" type="file"
							name="photo" />
					</div>
					<div class="col-md-4 mb-3">
						<form:input style="margin-left: 15px;" class="form-control"
							path="email" value="${itemStaffs.email}" />
						<form:errors path="Email" />
					</div>
					<div class="col-md-4 mb-3">
						<form:input path="Phone"
							style="width: 300px; margin-right: 350px;" type="text"
							class="form-control" value="${itemStaffs.phone}" />
						<form:errors path="Phone" />
					</div>
					<div class="col-md-4 mb-3">
						<form:input path="Salary"
							style="width: 300px; margin-right: 350px;" type="text"
							class="form-control" value="${itemStaffs.salary}" />
						<form:errors path="Salary" />
					</div>
					<div class="col-md-4 mb-3">
						<form:input path="Notes" style="width: 300px; margin-right: 32px;"
							type="text" class="form-control" value="${itemStaffs.notes}" />
						<form:errors path="Notes" />
					</div>
					<div class="col-md-4 mb-3">
						<form:select path="depart.id" class="form-control">
							<form:options items="${listDeparts}" itemValue="id"
								itemLabel="name"></form:options>
						</form:select>
					</div>
				</div>
				<div class="btn btn-sm btn-danger">
					<button class="btn btn-sm btn-danger">Sửa nhân viên</button>
				</div>
			</form:form>
		</div>
	</center>
	<br>
	<div></div>
</body>
</html>
