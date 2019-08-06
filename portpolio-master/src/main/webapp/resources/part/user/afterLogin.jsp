<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="panel panel-primary" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">회원 정보</h3>
	</div>
	<div class="panel-body ">

		<div class="form-group ">  
			<img width="50%" src="/resources/img/${sessionScope.data.image}" alt="" class="img-circle"/>
			
		</div>

		<div class="form-group">
			<p>
				<b>${sessionScope.data.name}</b>님 만나서 반갑습니다.
			</p>
		</div>

		<div class="form-group">
			<a href="login/edit">
				<button type="button" class="btn btn-default">정보 수정</button>
			</a>
		</div>

		<div class="form-group">
			<a href="login/logout">
				<button type="button" class="btn btn-default">로그아웃</button>
			</a>
		</div>
	</div>
</div>
