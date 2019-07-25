<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>검색 결과</title>
 <link rel="stylesheet" href="/resources/css/part/feild.css">
</head>
<body>
	<%@include file="/resources/part/user/info.jsp"%>
	<main>   
	<header> </header>   
	<section>
		<div class="panel panel-primary">
			<div class="panel-heading">
				<b>특정책명</b>
			</div>

			<div role="tabpanel">
				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#summary"
						aria-controls="summary" role="tab" data-toggle="tab">중요정보</a></li>
					<li role="presentation"><a href="#detaile"
						aria-controls="detaile" role="tab" data-toggle="tab">상세정보</a></li>
				</ul>
				<div class="tab-content">
					
					<div role="tabpanel" class="tab-pane active" id="summary">
						<%@include file="/resources/part/book/info/summary.jsp"%>
					</div>
					
					<div role="tabpanel" class="tab-pane" id="detaile">
						<%@include file="/resources/part/book/info/detaile.jsp"%>
					</div>
				</div>
			</div>
			<!-- tappannel -->
		</div>

	</section>
	</main>

</body>
</html>