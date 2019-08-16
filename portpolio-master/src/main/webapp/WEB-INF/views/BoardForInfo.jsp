<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<%@ include file="/resources/bootstrap/package.jsp" %>

<link rel="stylesheet" href="/resources/css/part/feild.css">
<!-- awesome font -->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="/resources/css/part/comment/comment.css">
</head>
<body>
	<%@include file="/resources/part/user/info.jsp"%>
	<main> <header> </header>
	<section>
		<div role="tabpanel">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<b>${detail.boardTitle}</b>
					<div class="glyphicon glyphicon-heart-empty" id="heart"></div>

					<button type="button" class="close" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>

				</div>

				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#original"
						aria-controls="original" role="tab" data-toggle="tab">원문</a></li>
					<c:if test="${sessionScope.data.email eq detail.userEmail}">
						<li role="presentation"><a href="#edit" aria-controls="edit"
							role="tab" data-toggle="tab">수정</a></li>
						<li><a href="delete/${detail.boardId}" id="change">삭제</a></li>
					</c:if>
				</ul>

				<div class="tab-content">
					<div role="tabpanel" class="tab-pane active" id="original">
						<%@include file="/resources/part/board/detail/info.jsp"%>
					</div>
					<div role="tabpanel" class="tab-pane" id="edit">
						<%@include file="/resources/part/board/detail/edit.jsp"%>
					</div>
				</div>

			</div>
			<%@ include file="/resources/part/comment/write.jsp"%>
			
			<%@ include file="/resources/part/comment/list.jsp"%>
		</div>
	</section>
	</main>
	<script type="text/javascript">
		const close = document.getElementsByClassName("close")[0];
		close.addEventListener('click', function() {
			history.go(-1);
		});
	</script>
	<script type="text/javascript">
		var bno = '${detail.boardId}';
		var like = document.getElementById("heart");
		var empty = "glyphicon glyphicon-heart-empty";
		var solid = "glyphicon glyphicon-heart";
		var count = 0;
		like.addEventListener("click", function() {
			if (like.getAttribute("class") === empty) {
				like.setAttribute("class", solid);
				count++;
			} else {
				like.setAttribute("class", empty);
				count--;
			}

		});
	</script>
	<script type="text/javascript">
		const btn = document.getElementById("btn");
		const area = document.getElementById("area");
		const comment = document.getElementById("comment_main");
		
		document.addEventListener(`DOMContentLoaded`,list());
	
		btn.addEventListener('click', function() {
			$.ajax({
				url : '/comment/insert',
				data : 'bno='+bno +"&content="+area.value,
				method : 'get',
				success: function(data) {
					area.value = "";
					one();
				},
				error : function(e) {
					alert(e)
				}
			});
		});

		function one() {
			$.ajax({
				url:'/comment/list',
				data : 'bno='+bno,
				dataType : 'json',
				method : 'get',
					success : function(data) {
						var sub = document.createElement('div');
						sub.setAttribute("class","comment_sub");
						comment.appendChild(sub);
						  
						var user = document.createElement('div');
						user.setAttribute("class","box");
						user.setAttribute("id","user");
						sub.appendChild(user);
						
						var img = document.createElement('img');
						img.setAttribute("src","/resources/img/"+data[data.length - 1].commentProfile);
						user.appendChild(img);
						 
						var userName = document.createElement('p');
						userName.innerHTML = data[data.length - 1].commentWriter;
						user.appendChild(userName);
						      
						var content = document.createElement('div');
						content.setAttribute("class","box");
						content.innerHTML = data[data.length - 1].commentContent;
						sub.appendChild(content);
						    
						var enter = document.createElement('br');
						sub.appendChild(enter);
				},
				
				error : function(e) {
					alert(e)
				}
			});
		}
	
		function list() {
			$.ajax({
				url:'/comment/list',
				data : 'bno='+bno,
				dataType : 'json',
				method : 'get',
					success : function(data) {
				
					for (var i = 0; i < data.length; i++) {
						
						var sub = document.createElement('div');
						sub.setAttribute("class","comment_sub");
						comment.appendChild(sub);
						  
						var user = document.createElement('div');
						user.setAttribute("class","box");
						user.setAttribute("id","user");
						sub.appendChild(user);
						
						var img = document.createElement('img');
						img.setAttribute("src","/resources/img/"+data[i].commentProfile);
						user.appendChild(img);
						 
						var userName = document.createElement('p');
						userName.innerHTML = data[i].commentWriter;
						user.appendChild(userName);
						      
						var content = document.createElement('div');
						content.setAttribute("class","box");
						content.innerHTML = data[i].commentContent;
						sub.appendChild(content);
						    
						var enter = document.createElement('br');
						sub.appendChild(enter);
					}
				},
				
				error : function(e) {
					alert(e)
				}
			});
		}
	</script>
</body>

</html>