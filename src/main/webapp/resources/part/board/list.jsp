<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/resources/css/part/board/list.css">

</head>
<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">게시판</h3>
		</div>
		<div class="panel-body">

			<div class="container">
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>제목</th>
							<th>작성자</th>
							<th>날짜</th>
							<th>조회수</th>
							<th><span class="glyphicon glyphicon-heart"
								aria-hidden="true"></span></th>
							<th><span class="glyphicon glyphicon-share"
								aria-hidden="true"></span></th>
						</tr>
					</thead>
					
					<tbody onclick="go()">

						<tr>
							<td>0</td>
							<td>제목명</td>
							<td>어드민</td>
							<td>0000-00-00</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
						</tr>

					</tbody>
			
				</table>
				<br /> <a href="board/write" class="btn btn-default pull-right">글쓰기</a>

				<div class="text-center">

					<ul class="pagination">
						<li><a href="#">1</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function go() {
			location.href="board/into";
		}
	</script>	
</body>
</html>