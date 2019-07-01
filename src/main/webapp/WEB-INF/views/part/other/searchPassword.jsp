<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<button type="button" class="close" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h3 class="panel-title">비밀번호 찾기</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal">

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
						<button type="submit" class="btn btn-default disabled">수정
							완료</button>
					</div>
				</div>

			</form>
		</div>
	</div>
</body>
</html>