<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 변경</title>
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
<link rel="stylesheet" href="/resources/css/part/other.css">
<style type="text/css">
#dupicateInfo {
	font-size: 100px;
	display: inline-block;
	margin-left: 10%;
}

#change {
	cursor: pointer;
	text-decoration: none;
	color: inherit;
	font-size: 20px;
}
</style>
</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<a href="edit/close">
				<button type="button" class="close" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</a>
			<h3 class="panel-title">회원 정보 변경</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" method="post" action="edit/close">

				<div id="profile" class="form-group " align="center">
					<img id="image" width="10%"
						src="/resources/img/${sessionScope.data.image}" alt="" /> <input
						id="inputs" type="hidden" value="${sessionScope.data.image}"
						name="image">
				</div>

				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">이메일</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" id="email" name="email"
							value="${sessionScope.data.email}" readonly="readonly">
					</div>
				</div>

				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">닉네임</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="nickname" name="name"
							value="${sessionScope.data.name}">
					</div>
				</div>
				<div class="textRight">
					<p></p>
				</div>

				<div class="form-group">
					<label for="Password" class="col-sm-2 control-label">패스워드</label> <span
						class="col-sm-6"> <input type="password"
						class="form-control" id="password" placeholder="새로운 패스워드를 입력해주세요."
						name="password"> <a id="change">수정</a>
					</span>
				</div>

				<div class="textRight">
					<p></p>
				</div>

				<div class="form-group">
					<label for="introduce" class="col-sm-2 control-label">자기 소개</label>
					<div class="col-sm-8">
						<textarea class="form-control" rows="7" placeholder="안녕하세요."
							name="introduce"></textarea>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">

						<button type="submit" class="btn btn-default"
							id="modifyBtn" formaction="edit/close">수정 완료</button>
						<div>
							<h1 id="dupicateInfo"></h1>
						</div>

						<br />



						<button type="submit" class="btn btn-default pull-right"
							formaction="edit/clear">회원탈퇴</button>
					</div>
				</div>
			</form>

		</div>
	</div>
	<script type="text/javascript"
		src="/resources/js/user/profileChange.js"></script>

	<script type="text/javascript">
		function nameRutine() {
			const nickname = document.getElementById('nickname');
			nickname.addEventListener('focus', function(e) {
				e.preventDefault();
				nickname.value = "";
			});

			nickname.addEventListener('focusout', function(e) {
				if (nickname.value == "") {
					e.preventDefault();
					nickname.value = '${sessionScope.data.name}';
				}
			});

			nickname.addEventListener('keyup', function(e) {
				const duplicate = document.getElementById('dupicateInfo');
				const modifyBtn = document.getElementById('modifyBtn');
				
				$.ajax({
					url : '/duplicate/name',
					data : 'name=' + nickname.value,
					success : function(data) {
						e.preventDefault();
						
						switch (data) {
						case 0:
							
							duplicate.innerHTML = "생성가능";
							duplicate.style = "color:green";
							modifyBtn.disabled = "";
							break;  
						case 1:
							if ('${sessionScope.data.name}' != nickname.value) {
								duplicate.innerHTML = "생성 불가능";
								duplicate.style = "color:red";
								modifyBtn.disabled = "disabled";
							}
							break;
						default:
							console.log("이상한 값이 들어옴");
							break;
						}
					}

				});

			});

		}
	</script>


	<script type="text/javascript">
		document.addEventListener('DOMcontentLoaded', function() {
			init();
		});

		nameRutine();

		change.addEventListener('click', function() {

			$.ajax({
				url : '/login/edit/password',
				method : 'post',
				data : 'email=' + email.value + '&password=' + password.value,
				success : function() {
					alert("수정되었습니다");
				},
				error : function(e) {
					alert(e);
				}

			});
		});

		function init() {

			const password = document.getElementById('password');
			const email = document.getElementById('email');
			const change = document.getElementById('change');
			const nickname = document.getElementById('nickname');

		}
	</script>
</body>
</html>