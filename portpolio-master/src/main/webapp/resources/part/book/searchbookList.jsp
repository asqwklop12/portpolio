<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">검색목록</h3>
	</div>
	<div class="panel-body">
		<div class="container">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>#</th>
						<th>제목</th>
						<th>작가</th>
						<th>출판사</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="search" items="${list}">
						<tr>
							<td>${search.searchNumber}</td>
							<td>${search.bookTitle}</td>
							<td>${search.searchAuthor}</td>
							<td>${search.searchPublisher}</td>
							<td><a
								href="/list/${search.searchId}/${search.searchNumber}">삭제</a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>


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
