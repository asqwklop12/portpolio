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
						<th>제목</th>
						<th>작성자</th>
						<th>날짜</th>
						<th>조회수</th>

					</tr>
				</thead>

				<tbody id="board">
					<c:forEach var="board" items="${list}">
						<tr>
							<td><a href="/board/into/${board.boardId}">${board.boardTitle}</a></td>
							<td>${board.boardWriter}</td>
							<td>${board.boardDate}</td>
							<td>${board.boardView}</td>
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