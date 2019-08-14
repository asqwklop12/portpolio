<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="panel-body">
	<div class="form-group">
		<div class="media">
			<div class="media-left media-middle"></div>
			<div class="media-body">
				<form action="edit/${detail.boardId}" method="post">
					<div class="panel panel-default">  
						<div class="panel-body">
							<input name="boardTitle" type="text" class="form-control"
								placeholder="제목">  
							<textarea name="boardContent" class="form-control" rows="10"
								placeholder="내용"></textarea>
						</div>
					</div>
					<button type="submit" class="pull-right">확인</button>
				</form>
			</div>
		</div>
	</div>
</div>
