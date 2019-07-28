<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="panel panel-primary">
	<div class="panel-heading">
		<b>글쓰기</b>
	</div>

	<div class="panel-body">
		<div class="form-group">

			<div class="media">
				<div class="media-left media-middle"></div>

				<form action="confirm" method="post">
					<div class="media-body">
						<div class="panel panel-default">
							<ul class="nav nav-tabs">
								<li role="presentation" class="active"><a href="#">작성</a></li>
								<li><button type="submit">완료</button></li>
								<li><a href="close">취소</a></li>
							</ul>

							<div class="panel-body">
								<input type="text" name="userEmail" hidden="true"
									value="${sessionScope.data.email}"> <input type="text"
									name="writer" hidden="true" value="${sessionScope.data.name}">
								<input type="text" class="form-control" placeholder="제목"
									name="title">

								<textarea class="form-control" rows="25" name="content">
									
									</textarea>
							</div>

						</div>

					</div>
				</form>

			</div>


		</div>
	</div>
</div>