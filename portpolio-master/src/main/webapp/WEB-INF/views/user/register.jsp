<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>회원 가입</title>
<%@ include file="/resources/bootstrap/package.jsp"%>
<link rel="stylesheet" href="/resources/css/part/user/register.css">
<link rel="stylesheet" href="/resources/css/part/other.css">


</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<a href="home">
				<button type="button" class="close" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</a>

			<h3 class="panel-title">회원 가입</h3>
		</div>

		<div class="panel-body">
			<form class="form-horizontal" action="home" method="post">
  
				<div id="profile" class="form-group " align="center">
					<img id="image" src="/resources/img/owl.svg" alt="" name="image" width="10%"/>
					<input type="hidden" value="owl.svg" name="image" id="inputs">
				</div>

				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" id="email" name="email"
							placeholder="이메일을 입력해주세요.">
						<div class="info">
							<h4 id="info_email"></h4>
						</div>
					</div>

				</div>


				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">NickName</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="name" name="name"
							placeholder="닉네임을 입력해주세요.">
						<div class="info">
							<h4 id="info_name"></h4>
						</div>
					</div>
				</div>


				<div class="form-group">
					<label for="Password" class="col-sm-2 control-label">Password</label>
					<span class="col-sm-4"> <input type="Password"
						class="form-control" id="password" placeholder="패스워드를 입력해주세요."
						name="password">
					</span> <span class="col-sm-4"> <input type="Password"
						class="form-control" id="rePassword"
						placeholder="패스워드를 다시 확인해 주세요." name="comfirm" disabled>
					</span>

				</div>
				<div class="info" id="left">
					<h4 id="info_password"></h4>
				</div>


				<div class="form-group">
					<label for="introduce" class="col-sm-2 control-label">introduce</label>
					<div class="col-sm-8">
						<textarea class="form-control" rows="7"
							placeholder="자기소개를 입력해주세요." id="introduce" name="introduce"></textarea>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" id="confirm"
							disabled="disabled">Sign up</button>
					</div>
				</div>
			</form>

		</div>
	</div>
	<script type="text/javascript"
		src="/resources/js/user/profileChange.js"></script>
	<script type="text/javascript">
		const info_email = document.getElementById('info_email');
		const info_name = document.getElementById('info_name');
		const info_password = document.getElementById('info_password');

		const email = document.getElementById('email');
		const name = document.getElementById('name');
		const password = document.getElementById('password');
		const rePassword = document.getElementById('rePassword');
		
		const confirm = document.getElementById('confirm');
		
		const emailReg = (/^\w([._-]?\w)*@\w([._-]?[a-zA-Z])*.[a-zA-Z]{2,3}$/);
  
		
		
		// 공백일때
		function blank(data) {
			if (data.value == "") {
				return false;
			}
			return true;
		}

		// 키를 눌렀을때

		// 이메일
		email.addEventListener("keyup", function(e) {
			e.preventDefault();

			if (emailRegEvent()) {
				info_email.innerHTML = "이메일 형식이 맞지 않습니다. 다시 확인해주세요."
				info_email.style = "color:red";
				return false;
			}
			if (emailAJAX()) {
				return false;

			} else {
				info_email.innerHTML = "사용 가능합니다."
				info_email.style = "color:green";

				return true;
			}
			info_email.innerHTML = " ";
		});

		// 이메일 AJax
		function emailAJAX() {

			$.ajax({
				url : '/duplicate/email',
				method : 'post',
				data : 'email=' + email.value,
				
				success : function(data) {
					switch (data) {
					case 0:
						info_email.innerHTML = "사용 가능합니다."
						info_email.style = "color:green";
						return false;
					case 1:
						info_email.innerHTML = "중복된 이메일이 있습니다."
						info_email.style = "color:red";

						return true;
					default:
						info_email.innerHTML = "이상한 값이 들어왔습니다."
						break;
					}
					return true;
				}

			});

		}

		// 이름 체킹
		name.addEventListener("keyup", function(e) {
			e.preventDefault();
			return nameAjAX();
		});

		// 패스워드 이벤트	
		password.addEventListener("keyup", function(e) {
			e.preventDefault();
			rePassword.disabled = "";
		});

		password.addEventListener("focusout", function(e) {
			e.preventDefault();
			if (password.value == "") {
				rePassword.disabled = "disabled";
			}
		});

		// 패스워드 다시 입력
		rePassword.addEventListener("keyup", function(e) {
			e.preventDefault();
			if (rePassword.value != "" && (password.value != rePassword.value)) {
				info_password.innerHTML = "비밀번호가 서로다릅니다.";
				info_password.style = "color:red";
				return;
			}
			else if (password.value == rePassword.value) {
				info_password.innerHTML = "사용 가능합니다."
				info_password.style = "color:green";
				return;
			}
			
		});

		// 이름AJAX
		function nameAjAX() {

			$.ajax({
				url : '/duplicate/name',
				method : 'post',
				data : 'name=' + name.value,
				success : function(data) {
					switch (data) {
					case 0:
						if (name.value != "")  {
						info_name.innerHTML = "사용 가능합니다."
						info_name.style = "color:green";
						}
						return false;
					case 1:
						info_name.innerHTML = "중복된 이름이 있습니다."
						info_name.style = "color:red";

						return true;
					default:
						info_name.innerHTML = "사용할 수 없는 값입니다."
						break;
					}
					return true;

				}

			});
		}
		
		

		// 중복된 값 체크
		function validate(data) {
			if (data.innerHTML == "사용 가능합니다.") {
				return true;
			}
			return false;

		}

		// 다시 입력할때
		email.addEventListener("focus", function(e) {
			e.preventDefault();
			email.value = "";
		});

		email.addEventListener("focusout", function(e) {
			e.preventDefault();
			
			if (info_email.innerHTML != "사용 가능합니다.") {
				info_email.innerHTML = "";
			}
		});
		
		rePassword.addEventListener("focusout", function(e) {
			e.preventDefault();
			if (info_password.innerHTML != "사용 가능합니다.") {
				info_password.innerHTML = "";
				rePassword.value = "";
				rePassword.disabled = "disabled";
				return;
			} 
			
			if (info_password.innerHTML == "사용 가능합니다.") {
				rePassword.disabled = "disabled";
				return
			}
		});

		name.addEventListener("focus", function(e) {
			e.preventDefault();
			name.value = "";
		});
		
		name.addEventListener("focusout", function(e) {
			e.preventDefault();
			
			if (name.value == "" || info_name.innerHTML != "사용 가능합니다.") {
				info_name.innerHTML = "";
				name.value = "";
			}
		});

		password.addEventListener("focus", function(e) {
			e.preventDefault();
			password.value = "";
			rePassword.value = "";
		});
  
		rePassword.addEventListener("focus", function(e) {
			e.preventDefault();
			rePassword.value = "";
		});

		// 이메일 정규화 이벤트
		function emailRegEvent() {
			return !(emailReg.test(email.value));
		}
  
		// LAST EVENT
		function checkBtn() {
			if (blank(email) && blank(name) && blank(password) && blank(rePassword)
					&& validate(info_email) && validate(info_name)
					&& validate(info_password)) {
				

				
				
				return true;
			}    
			return false;
		}
	    
		document.addEventListener('keydown', function() {
			
			if(checkBtn()) {
				confirm.disabled = "";
				
			}
			
		});
		 
	</script>
</body>
</html>
