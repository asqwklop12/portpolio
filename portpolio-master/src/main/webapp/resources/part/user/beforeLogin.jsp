<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <link rel="stylesheet" href="/resources/css/part/main/afterLogin.css">

</head>
<body>
 <div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">로그인</h3>
				</div>
				<div class="panel-body">

					<form class="form-horizontal" method="post" action="login">
						<br /> <br />
						<div class="form-group">
							<div class="col-sm-12">
								<input type="email" class="form-control" id="email"
									name="email" data-toggle="tooltip" data-placement="left" title="Email"
									placeholder="Email">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-12">
								<input type="password" class="form-control" id="password"
									name="password" data-toggle="tooltip" data-placement="left" title="Password"
									placeholder="password">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<span class="checkbox"> <label> <input
										type="checkbox"> 자동 로그인
								</label>
								</span> <span class="col-sm-offset-2 col-sm-7"> <a
									class="seacrhPasswor" href="lost">비밀번호를 잃어버리셨나요?</a>
								</span>
							</div>
						</div>

						<br /> <br />

						<div class="form-group"></div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" id="confirm">로그인</button>
								<a href="register">회원가입</a>
							</div>
						</div>
					</form>
				</div>
			</div>
</body>
</html>