<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<%@include file="/WEB-INF/views/common/head.jsp"%>
<%@include file="/WEB-INF/views/common/navbar.jsp"%>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<h2>Login</h2>
				<hr>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title"></h3>
					</div>
					<div class="panel-body">
						<c:if test="${!empty message}">
							<div class="alert alert-danger alert-dismissable">
								<button type="button" class="close" data-dismiss="alert"
									aria-hidden="true">×</button>${message}</div>
						</c:if>
						<form:form method="post" commandName="account" action="login">
							<div class="form-group">
								<form:input path="Username" class="form-control"
									placeholder="Tài khoản" />
							</div>

							<div class="form-group">
								<form:input type="password" path="Password" class="form-control"
									placeholder="Mật khẩu" />
							</div>
							<button class="btn btn-lg btn-success btn-block">Login</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>