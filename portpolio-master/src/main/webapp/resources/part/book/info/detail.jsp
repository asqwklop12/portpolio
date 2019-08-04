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
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">책 소개</h3>
					</div>
					<div class="panel-body">${book.summary}</div>
				</div>

			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">목차</h3>
			</div>
			<div class="panel-body">${book.bookIndex}</div>
		</div>
	</div>
</div>
