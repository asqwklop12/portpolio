<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">로그인</h3>
	</div>
	<div class="panel-body">

		<form class="form-horizontal" method="post" action="login">
			<br /> <br />
			<div class="form-group">
				<div class="col-sm-12">
					<input type="email" class="form-control" id="email" name="email"
						data-toggle="tooltip" data-placement="left" title="Email"
						placeholder="Email">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-12">
					<input type="password" class="form-control" id="password"
						name="password" data-toggle="tooltip" data-placement="left"
						title="Password" placeholder="password">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<span class="col-sm-offset-2 col-sm-7"> <a
						class="seacrhPasswor" href="lost">비밀번호를 잃어버리셨나요?</a>
					</span>
				</div>
			</div>

			<br /> <br />

			<div class="form-group"></div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-link" id="confirm">로그인</button>

					<a href="register">회원가입</a>
				</div>
			</div>
		</form>
	</div>
</div>
<script type="text/javascript">
	var email = document.getElementById("email");
	var password = document.getElementById("password");
	var confirm = document.getElementById("confirm");

	function blank(data) {
		if (data.value == "") {
			return true;
		}
		return false;
	}

	function wrongEmail() {
		return '${SesseionScope.data.eamil}';
	}

	confirm.addEventListener('click', function(e) {

		if (blank(email) && blank(password)) {
			e.preventDefault();
			alert("입력하지 않았습니다.");
		} else if (blank(email)) {
			e.preventDefault();
			alert("이메일을 입력해주시기 바랍니다.");
		} else if (blank(password)) {
			e.preventDefault();
			alert("패스워드를 입력해주시기 바랍니다.");
		}

	});
</script>