<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="panel-body">

	<div class="form-group">
  
		<div class="media">                  
			<div class="media-left media-top" style="width: 10%" align="center">
				<img src="/resources/img/${detail.boardProfile}" alt=""
					class="img-circle imgSize" /> <br /> <br /> <b id="id">${detail.boardWriter}</b>
			</div>    
			<div style="margin-left: 20%" class="media-body">
				<div class="panel panel-default">
					<div class="panel-body">${detail.boardContent}</div>
				</div>
			</div>
		</div>
	</div>
</div>