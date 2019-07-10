<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/css/part/main/Login.css">

</head>
<body>
	<c:choose>   
		<c:when test="${not empty sessionScope.userLogin}">
			<div class="panel panel-primary" align="center">
				<div class="panel-heading">
					<h3 class="panel-title">회원 정보</h3>
				</div>
				<div class="panel-body ">

					<div class="form-group ">
						<img src="/resources/img/kakao.png" alt="" class="img-circle imgSize" />
					</div>

					<div class="form-group">
						<p>
							<b>닉네임</b>님 만나서 반갑습니다.
						</p>
					</div>

					<div class="form-group">
						<a href="login/edit">
							<button type="button" class="btn btn-default">정보 수정</button>
						</a>
					</div> 

					<div class="form-group">
						<a href="login/logout">
							<button type="button" class="btn btn-default">로그아웃</button>
						</a>
					</div>
				</div>
			</div>
		</c:when>
		
		<c:otherwise>
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
									data-toggle="tooltip" data-placement="left" title="Email"
									placeholder="Email">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-12">
								<input type="password" class="form-control" id="password"
									data-toggle="tooltip" data-placement="left" title="Password"
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
		</c:otherwise>
	</c:choose>
</body>
</html>