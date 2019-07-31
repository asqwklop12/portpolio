<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
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
<link rel="stylesheet" href="/resources/css/part/feild.css">
<link rel="stylesheet" href="/resources/css/part/board/info.css">

<!-- awesome font -->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<%@include file="/resources/part/user/info.jsp"%>
	<main> <header> </header>
	<section>
		<div role="tabpanel">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<b>${detail.title}</b>
					<button id="share" class="glyphicon glyphicon-share"
						aria-hidden="true"></button>
					<div class="glyphicon glyphicon-heart-empty" id="heart"></div>
					<a href="close">
						<button type="button" class="close" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</a>
				</div>

				<script type="text/javascript">
					document.addEventListener(`DOMContentLoaded`, function() {
						var count = '${user}';
						  
						 if (count == 1) {
							like.setAttribute("class", solid);
						} 
						
					});
					
					var bno = '${detail.no}';
					var like = document.getElementById("heart");
					var empty = "glyphicon glyphicon-heart-empty";
					var solid = "glyphicon glyphicon-heart";

					var count = '${result}';

					like.addEventListener("click", function() {
						$.ajax({
							url : "/board/like",
							type : 'post',

							dataType : "json",
							data : 'no=' + bno,
							success : function(data) {

								if (like.getAttribute("class") === empty) {
									like.setAttribute("class", solid);
									count++;
								}

								else {
									like.setAttribute("class", empty);
									count--;
								}

								console.log(count);

							},

						});
					});
				</script>
				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#original"
						aria-controls="original" role="tab" data-toggle="tab">원문</a></li>
					<li role="presentation"><a href="#edit" aria-controls="edit"
						role="tab" data-toggle="tab">수정</a></li>
					<li><a href="delete?no=${detail.no}" id="change">삭제</a></li>
				</ul>

				<div class="tab-content">
					<div role="tabpanel" class="tab-pane active" id="original">
						<%@include file="/resources/part/board/detaile/info.jsp"%>
					</div>
					<div role="tabpanel" class="tab-pane" id="edit">
						<%@include file="/resources/part/board/detaile/edit.jsp"%>
					</div>
				</div>
			</div>
		</div>

		<%@ include file="/resources/part/comment/write.jsp"%>
	</section>
	</main>

</body>
</html>