<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="panel panel-success container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">반디엔루디스</h3>
	</div>
	<div class="panel-body">
		<div class="row">

			<c:forEach var="bandi" begin="0" end="5" items="${bandi}">
				<div class="col-xs-6 col-md-2">
					<a href="#" class="thumbnail"> <img src="${bandi}" alt="반디엔루디스">
					</a>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<div class="panel panel-info container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">교보문고</h3>
	</div>
	<div class="panel-body">
		<div class="row">
			<c:forEach var="kyobo" begin="0" end="5" items="${kyobo}">
				<div class="col-xs-6 col-md-2">
					<a href="#" class="thumbnail"> <img src="${kyobo}" alt="교보문고">
					</a>
				</div>
			</c:forEach>

		</div>
	</div>
</div>

<div class="panel panel-success container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">알라딘</h3>
	</div>
	<div class="panel-body">
		<div class="row">
			<c:forEach var="aladin" begin="0" end="5" items="${aladin}">
				<div class="col-xs-6 col-md-2">
					<a href="#" class="thumbnail"> <img src="${aladin}" alt="알라딘">
					</a>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<div class="panel panel-warning container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">영풍문고</h3>
	</div>
	<div class="panel-body">
		<div class="row">
			<c:forEach var="ypbook" begin="0" end="5" items="${ypbook}">
				<div class="col-xs-6 col-md-2">
					<a href="#" class="thumbnail"> <img src="${ypbook}" alt="영풍문고">
					</a>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<div class="panel panel-info container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">yes24</h3>
	</div>
	<div class="panel-body">
		<div class="row">
			<c:forEach var="yes24" begin="0" end="5" items="${yes24}">
				<div class="col-xs-6 col-md-2">
					<a href="#" class="thumbnail"> <img src="${yes24}" alt="Yes24">
					</a>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<div class="panel panel-warning container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">유저 선택</h3>
	</div>
	<div class="panel-body">
		<div class="row">
			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>
		</div>
	</div>
</div>
