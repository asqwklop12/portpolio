<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="panel-body">
	<div class="form-group">
		<div class="media">
			<div class="media-left media-middle"></div>
			<div class="media-body">
				<form action="edit?id=${detail.no}" method="post">
					<input hidden="true" value="${detail.no}" name="no">
					<div class="panel panel-default">
						<div class="panel-body">
							<input name="title" type="text" class="form-control"
								placeholder="${detail.title}">
							<textarea name="content" class="form-control" rows="10"
								placeholder="${detail.content}"></textarea>
						</div>
					</div>
					<button type="submit" class="pull-right">확인</button>
				</form>
			</div>
		</div>
	</div>
</div>
