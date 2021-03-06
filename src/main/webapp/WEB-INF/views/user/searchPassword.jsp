<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>

  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
       <link rel="stylesheet" href="/resources/css/part/other.css">
      <script type="text/javascript" src="/resources/js/user/password.js"></script> 
</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<a href="home">
			<button type="button" class="close" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			</a>
			<h3 class="panel-title">비밀번호 찾기</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" method="get" action="#" >

				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" id="email"
							placeholder="이메일을 입력해주세요.">
					</div>
				</div>

				<div class="textRight">
					<p>형식에 맞게 입력해주세요.</p>
				</div>

				<br /> <br />


				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" id="confirm">완료</button>
					</div>
				</div>

			</form>
		</div>
	</div>
</body>
</html>