<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<div class="media">

	<c:forEach var="book" items="${bookList}">
		<div class="media-left media-top">
			<img class="media-object" src="${book.image}" alt="...">
		</div>


		<div class="media-body" onclick="enterInfo()">

			<div class="form-group">
				<label for="title">제목: </label><a href="search/info?title=${book.title}"><span id="title">${book.title}</span></a>
			</div>
  
			<div class="form-group">
				<label for="author">작가: </label> <span id="author">${book.author}</span>
			</div>

			<div class="form-group hidden">
				<label for="translator">역자: </label> <span id="translator">${book.translator}</span>
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
				<label for="like">좋아요: </label> <span id="like">-</span>
			</div>

		</div>
		<br />
	</c:forEach>
</div>

<div class="border"></div>
<script type="text/javascript">
	function enterInfo() {
		location.href = "";
	}
</script>