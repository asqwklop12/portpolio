<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="panel-body">

		<div class="form-group">

			<div class="media">
				<div class="media-left media-middle">
					<img
						 src="/resources/img/kakao.png"
						alt="" class="img-circle imgSize" />
				</div>
				<div class="media-body">

					<ul>
						<li><label for="author">저자: </label> <b id="author">저자명</b></li>
						<li><label for="translator">역자: </label> <b id="translator">역자명</b></li>

						<li><label for="publisher">출판사: </label> <b id="publisher">출판사명</b></li>

						<li><label for="date">출판일: </label> <b id="date">1999-09-09</b>
						</li>

						<li><label for="page">페이지: </label> <b id="page">380</b>p</li>

						<li><label for="cost">판매 가격: </label> <b id="cost">9999</b>원
						</li>
					</ul>

				</div>
			</div>

		</div>
	</div>
</body>
</html>