<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="UTF-8">
<title>검색 결과</title>
<link rel="stylesheet" href="/resources/css/part/feild.css">
</head>
<body>
	<c:if test="${not empty sessionScope.data}">
		<%@include file="/resources/part/user/info.jsp"%>
	</c:if>

	<main> <header> </header>
	<section>
		<div class="panel panel-primary">
			<div class="panel-heading">
				<b>${book.title}</b> <a href="out">
					<button type="button" class="close" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</a>
				<c:if test="${not empty sessionScope.data}">
					<div class="glyphicon glyphicon-heart-empty" id="heart"></div>
				</c:if>
			</div>

			<div role="tabpanel">
				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#summary"
						aria-controls="summary" role="tab" data-toggle="tab">중요정보</a></li>
					<li role="presentation"><a href="#detail"
						aria-controls="detail" role="tab" data-toggle="tab">상세정보</a></li>
				</ul>
				<div class="tab-content">

					<div role="tabpanel" class="tab-pane active" id="summary">
						<%@include file="/resources/part/book/info/summary.jsp"%>
					</div>

					<div role="tabpanel" class="tab-pane" id="detail">
						<%@include file="/resources/part/book/info/detail.jsp"%>
					</div>
				</div>
			</div>
			<!-- tappannel -->
		</div>

	</section>
	</main>
	<c:if test="${not empty sessionScope.data}">
		<script type="text/javascript">
			document.addEventListener(`DOMContentLoaded`, function() {
				var count = '${result}';
				if (count == 1) {
					like.setAttribute("class", solid);
				}
			});
			var like = document.getElementById("heart");
			var empty = "glyphicon glyphicon-heart-empty";
			var solid = "glyphicon glyphicon-heart";
			var count = '${count}';

			var title = '${book.title}';

			like.addEventListener("click", function() {

				$.ajax({
					url : '/search/heart',
					data : 'title=' + title,
					dataType : 'json',
					success : function() {

						if (like.getAttribute("class") === empty) {
							like.setAttribute("class", solid);
							count++;
						}

						else {
							like.setAttribute("class", empty);
							count--;
						}

						console.log(count);
					}
				});

			});
		</script>
	</c:if>
</body>
</html>

