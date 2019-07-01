<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
   <style type="text/css">
      		<%@ include file="../../css/part/main/Login.css" %>
    </style>
</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">로그인</h3>
		</div>
		<div class="panel-body">


			<form class="form-horizontal">
				<br /> <br />
				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-9">
						<input type="email" class="form-control" id="email"
							placeholder="Email">
					</div>
				</div>

				<div>
					<p id="textRight">형식에 맞게 입력해주세요.</p>
				</div>

				<div class="form-group">
					<label for="password" class="col-sm-2 control-label">Password</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" id="password"
							placeholder="password">
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<span class="checkbox"> <label> <input
								type="checkbox"> 자동 로그인
						</label>
						</span> <span class="col-sm-offset-2 col-sm-7"> <span
							class="seacrhPasswor">비밀번호를 잃어버리셨나요?</span>
						</span>
					</div>
				</div>

				<br /> <br />

				<div class="form-group"></div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default disabled">Sign
							in</button>
						<button type="button" class="btn btn-default">회원가입</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>