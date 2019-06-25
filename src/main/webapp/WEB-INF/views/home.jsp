<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="./css/index.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<header class="jumbotron">

		<div>

			<div class="col-lg-6">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Search for...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">GO!</button>
					</span>
				</div>
				<!-- /input-group -->
			</div>
			<!-- /.col-lg-6 -->
		</div>
		<!-- /.row -->

		<button class="btn btn-primary btn-lg pull-right" data-toggle="modal"
			data-target="#myModal" type="button" name="button">로그인</button>

	</header>



	<div class="row center-block list-inline board">
		<div class="col-md-7">
			<div class="panel panel-primary inline">
				<div class="panel-heading ">
					<h4 class="panel-title ">공지사항</h4>
				</div>

				<div class="panel-body well">
					<ul class="list-unstyled text-center">
					<c:forEach var="user_item" items="${users}">
						<li> 
						 	   <span>${user_item.email}</span>
						 	   <span>${user_item.password}</span>
						</li>
					
					</c:forEach>

					</ul>
				</div>
			</div>
		</div>

	</div>

	<div class="box" align="center">
		<ul class="list-unstyled">
			<li>반디엔루디스<br /> 
			<img class="box_bandi" src="" alt=""> 
			<img class="box_bandi" src="" alt=""> 
			<img class="box_bandi" src="" alt="">
			<img class="box_bandi" src="" alt=""> 
			<img class="box_bandi" src="" alt="">

			</li>

			<li>영풍문고<br /> 
			<img class="box_ypbooks" src="" alt=""> 
			<img class="box_ypbooks" src="" alt=""> 
			<img class="box_ypbooks" src="" alt=""> 
			<img class="box_ypbooks" src="" alt="">
			<img class="box_ypbooks" src="" alt="">

			</li>
			<li>교보문고<br/> 
			<img class="box_kyobobook" src="" alt=""> 
			<img class="box_kyobobook" src="" alt=""> 
			<img class="box_kyobobook" src="" alt=""> 
			<img class="box_kyobobook" src="" alt=""> 
			<img class="box_kyobobook" src="" alt="">
			</li>
			
			<li>yes24<br/> 
			<img class="box_yes24" src="" alt=""> 
			<img class="box_yes24" src="" alt=""> 
			<img class="box_yes24" src="" alt=""> 
			<img class="box_yes24" src="" alt=""> 
			<img class="box_yes24" src="" alt="">
			</li>
			
			<li>알라딘<br/> 
			<img class="box_aladin" src="" alt=""> 
			<img class="box_aladin" src="" alt=""> 
			<img class="box_aladin" src="" alt=""> 
			<img class="box_aladin" src="" alt=""> 
			<img class="box_aladin" src="" alt="">
			</li>
			
			<li>좋아요<br/> 
			<img class="box_userSelect" src="" alt=""> 
			<img class="box_userSelect" src="" alt=""> 
			<img class="box_userSelect" src="" alt=""> 
			<img class="box_userSelect" src="" alt=""> 
			<img class="box_userSelect" src="" alt="">
			</li>
			
		</ul>
	</div>


	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">로그인</h4>
				</div>


				<div id="login modal-body">
					<form>

						<input type="text" placeholder="Username"> <input
							type="password" placeholder="Password">

						<button>Sign in</button>
						<a href="#">forgot password</a>
					</form>
				</div>
				<div class="shadow"></div>

				<div class="modal-footer">
					<a data-toggle="modal" href="#signUp" class="btn btn-primary">Sign</a>
				</div>
			</div>
		</div>
	</div>

	<div class="modal" id="signUp">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title">회원가입</h4>
				</div>
				<div class="container"></div>
				<div class="modal-body">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="@example.com">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">확인</button>
						</span>

					</div>
					<!-- /input-group -->


					<div class="input-group">
						<input type="text" class="form-control" placeholder="nickName">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">확인</button>
						</span>
					</div>
					<!-- /input-group -->

					<input type="text" class="form-control" placeholder="Password">
					<div class="input-group">

						<input type="text" class="form-control" placeholder="Password">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">확인</button>
						</span>
					</div>
					<!-- /input-group -->

				</div>
				<div class="modal-footer">
					<a href="#" data-dismiss="modal" class="btn">Close</a> <a href="#"
						class="btn btn-primary">Sign up</a>
				</div>
			</div>
		</div>
	</div>
	<footer> </footer>
</body>
</html>
