<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<div class="media">

	<c:forEach var="book" items="${bookList}">
		<div class="media-left media-top">
			<img class="media-object" src="${book.image}" alt="...">
		</div>

		<div class="media-body">

			<div class="form-group">
				<label for="id">번호: </label> <span id="id">${book.ISBN}</span>
			</div>
			
			<div class="form-group">

				<label for="title">제목: </label>

				<c:choose>
					<c:when test="${not empty sessionScope.data}">
						<a href="search/sInfo/${book.title}"><span id="title">${book.title}</span></a>
					</c:when>
					<c:otherwise>
						<a href="search/info/${book.title}"><span id="title">${book.title}</span></a>
					</c:otherwise>
				</c:choose>

			</div>

			<div class="form-group">
				<label for="author">작가: </label> <span id="author">${book.author}</span>
			</div>


			<div class="form-group">
				<label for="publish">출판사: </label> <span id="publish">${book.publisher}</span>
			</div>


			<div class="form-group">
				<label for="price">페이지: </label> <span id="price">${book.page}</span>
			</div>


			<div class="form-group">
				<label for="price">정가: </label> <span id="price">${book.price}</span>
			</div>

			<div class="form-group">
				<label for="like">좋아요: </label> <span id="like">${book.heart}</span>
			</div>

		</div>
		<br />
	</c:forEach>
</div>

<div class="border"></div>
