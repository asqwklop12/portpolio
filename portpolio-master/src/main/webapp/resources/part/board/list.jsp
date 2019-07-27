<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

				<tbody>
					<c:forEach var="board" items="${list}" varStatus="status">

						<tr>
							<td>${status.count}</td>
							<td><a href="board/into?no=${board.no}">${board.title}</a></td>
							<td>${board.writer}</td>
							<td>${board.date}</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td hidden="true">${board.content}</td>
							<td hidden="true">${board.userId}</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
			<br /> <a href="board/write" class="btn btn-default pull-right">글쓰기</a>

			<div class="text-center">

				<ul class="pagination">
					<c:forEach begin="1" end="${page}" var="num">
						<li><a href="?num=${num}">${num}</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</div>
