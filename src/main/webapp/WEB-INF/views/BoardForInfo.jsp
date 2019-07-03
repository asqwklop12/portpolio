<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
<%@ include file ="./css/part/feild.css" %>
</style>

</head>
<body>
	<%@include file="./part/user/info.jsp"%>
	<main> 
	<header> </header> 
	<%@include file="./part/main/headerForBoard.jsp"%>
	<section>
		<div role="tabpanel">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<b>번호</b> <b>제목</b>
				</div>

				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#original" aria-controls="original" role="tab" data-toggle="tab">원문</a></li>
					<li role="presentation"><a href="#edit" aria-controls="edit" role="tab" data-toggle="tab">수정</a></li>
					<li><a href="delete" id="change">삭제</a></li>
				</ul>

				<div class="tab-content">
					<div role="tabpanel" class="tab-pane active" id="original">
						<%@include file="./part/board/detaile/info.jsp"%>
					</div>
					<div role="tabpanel" class="tab-pane" id="edit">
					<%@include file="./part/board/detaile/edit.jsp"%>
					</div>
				</div>
			</div>
		</div>
	</section>
	</main>

</body>
</html>