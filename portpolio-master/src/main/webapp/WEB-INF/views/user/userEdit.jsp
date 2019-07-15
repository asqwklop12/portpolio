<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 변경</title>
  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="/resources/css/part/other.css">
</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<a href="edit/close">
			<button type="button" class="close" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button></a>
			<h3 class="panel-title">회원 정보 변경</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" method="get" action="edit/close">

				<div class="form-group " align="center">
					<img  src="/resources/img/kakao.png" alt="" class="img-circle imgSize" />
				</div>

				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" id="email disabledInput"
							placeholder="exampe@text.com" disabled>
					</div>
				</div>

				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">NickName</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="name"
							placeholder="name">
					</div>
				</div>
				<div class="textRight">
					<p>형식에 맞게 입력해주세요.</p>
				</div>

				<div class="form-group">
					<label for="Password" class="col-sm-2 control-label">Password</label>
					<span class="col-sm-8"> <input type="Password"
						class="form-control" id="Password" placeholder="Password">
					</span>
				</div>

				<div class="textRight">
					<p>패스워드가 일치하지 않습니다.</p>
				</div>

				<div class="form-group">
					<label for="introduce" class="col-sm-2 control-label">introduce</label>
					<div class="col-sm-8">
						<textarea class="form-control" rows="7" placeholder="안녕하세요."></textarea>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">수정
							완료</button>
						<br /> <br />
						<button type="submit" class="btn btn-default pull-right">회원탈퇴
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>