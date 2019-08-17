<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<%@ include file="/resources/bootstrap/package.jsp"%>

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
		const sessionEmail = '${sessionScope.data.email}';

		document.addEventListener(`DOMContentLoaded`, list());

		btn.addEventListener('click', function() {
			$.ajax({
				url : '/comment/insert',
				data : 'bno=' + bno + "&content=" + area.value,
				method : 'post',
				success : function(data) {
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
				url : '/comment/list',
				data : 'bno=' + bno,
				dataType : 'json',
				method : 'post',
				success : function(data) {
					tab(data[data.length - 1].userEmail);
					commentContext(data[data.length - 1]);
					remove(data[data.length - 1]);

				},

				error : function(e) {
					alert(e)
				}
			});
		}

		function list() {
			$.ajax({
				url : '/comment/list',
				data : 'bno=' + bno,
				dataType : 'json',
				method : 'post',
				success : function(data) {

					for (var i = 0; i < data.length; i++) {
						tab(data[i].userEmail);
						commentContext(data[i]);
						remove(data[i]);
					}
				},      

				error : function(e) {
					alert(e)
				}
			});
		}

		function commentContext(data) {
			let media = document.createElement('div');
			media.setAttribute('class', 'media');
			comment.appendChild(media);

			let media_header = document.createElement('div');
			media_header.setAttribute('class', 'user media-left media-middle');
			media.appendChild(media_header);

			let img = document.createElement('img');
			img.setAttribute('class', 'media-object');
			img.setAttribute('src', "/resources/img/" + data.commentProfile);
			media_header.appendChild(img);

			let userName = document.createElement('p');
			userName.innerHTML = data.commentWriter;
			media_header.appendChild(userName);

			let media_body = document.createElement('div');
			media_body.setAttribute('class', 'media-body');
			media.appendChild(media_body);

			let content = document.createElement('h4');
			content.setAttribute('class', 'media-heading');
			content.innerHTML = data.commentContent;
			media_body.appendChild(content);

		}

		function tab(data) {
			if (sessionEmail == data) {
				let items = document.createElement('ul');
				items.setAttribute('class', 'nav nav-tabs');
				comment.appendChild(items);

				let item = document.createElement('li');
				item.setAttribute('role', 'presentation');
				item.setAttribute('id', 'remove');
				items.appendChild(item);

				let aTag = document.createElement('a');
				aTag.setAttribute('href', '#');
				aTag.innerHTML = '삭제';
				item.appendChild(aTag);

			}
		}

		function remove(data) {
			const removeItem = document.getElementById('remove');
			removeItem.addEventListener('click', removeAction);
		}

		function removeAction() {
			$.ajax({
				url : '/comment/remove',
				data : "email=" + data.userEmail,
				method : 'post',
				success : function() {
					window.location.reload();
				},
				error : function() {
					alert("삭제에 실패하셨습니다.");
				}
			});
		};

	</script>
</body>

</html>