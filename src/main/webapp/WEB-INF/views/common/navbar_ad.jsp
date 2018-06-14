
<%@page pageEncoding="UTF-8"%>
<meta charset="utf-8">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<div id="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="<c:url value="/homepage"/>">DoanNVPH04705</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/staffs"/>">Nhân
						viên</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/department"/>">Phòng
						ban</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/records"/>">Thành
						tích và Kỷ luật</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<button class="btn btn-sm btn-danger"
					style="width: 150px; height: 30px; border-radius: 5px; border: none; margin-right: 20px; color: #fff;"
					type="submit">Xin chào: ${sessionScope.Username}</button>
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				<div style="margin-left: 20px;" class="btn btn-sm btn-danger">
					<a href="<c:url value='/homepage/logout?action=logout' />  "
						style="color: white;">Đăng xuất</a>
				</div>
			</form>
		</div>
	</nav>
</div>