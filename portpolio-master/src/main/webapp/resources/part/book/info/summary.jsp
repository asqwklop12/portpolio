<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="panel-body">

	<div class="form-group">

		<div class="media">
			<div class="media-left media-middle">
				<img src="${book.image}" alt=""
					class="imgSize" />
			</div>    	
			<div class="media-body">

				<ul>
					<li><label for="author">저자: </label> <b id="author">${book.author}</b></li>
  
					<li><label for="publisher">출판사: </label> <b id="publisher">${book.publisher}</b></li>

					<li><label for="date">출판일: </label> <b id="date">1999-09-09</b>
					</li>

					<li><label for="page">페이지: </label> <b id="page">${book.page}</b>p</li>

					<li><label for="cost">판매 가격: </label> <b id="cost">${book.price}</b>원</li>
				</ul>

			</div>
		</div>

	</div>
</div>
