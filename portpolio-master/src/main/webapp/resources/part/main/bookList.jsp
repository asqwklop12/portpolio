<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="panel panel-success container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">반디엔루디스</h3>
	</div>
	<div class="panel-body">
		<div class="row" id="bandi">	
		</div>
	</div>
</div>


<div class="panel panel-info container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">교보문고</h3>
	</div>
	<div class="panel-body">
		<div class="row" id="kyobo">

		</div>
	</div>
</div>

<div class="panel panel-success container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">알라딘</h3>
	</div>
	<div class="panel-body">
		<div class="row" id="aladin">
		</div>
	</div>
</div>

<div class="panel panel-warning container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">영풍문고</h3>
	</div>
	<div class="panel-body">
		<div class="row" id="ypbook">
		</div>
	</div>
</div>

<div class="panel panel-info container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">yes24</h3>
	</div>
	<div class="panel-body">
		<div class="row" id="yes24">
		
		
		</div>
	</div>
</div>




<div class="panel panel-warning container-fluid" align="center">
	<div class="panel-heading">
		<h3 class="panel-title">유저 선택</h3>
	</div>
	<div class="panel-body">
		<div class="row">
			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>

			<div class="col-xs-6 col-md-2">
				<a href="#" class="thumbnail"> <img
					src="/resources/img/kakao.png" alt="...">
				</a>
			</div>
			
		</div>
	</div>
</div>


<script type="text/javascript">
	
	initial();
	
	var book = ['${bandi}','${kyobo}','${aladin}','${ypbook}','${yes24}'];
	
	var book = {
			
			bandi :'${bandi}',
			kyobo : '${kyobo}', 
			aladin :'${aladin}',
			ypbook :'${ypbook}', 
			yes24 :'${yes24}'
			
	};
	
	
	function arr(data) {
		return data.replace('[','').replace(']','').split(',');
	}
	
	
	
	$.ajax({
		type : "get",
		url : "/",
		data : arr(book.bandi),
		success : function(data) {
			
			for (var i = 0; i < arr(book.bandi).length; i++) {
			
				// row밑에 추가
				var col = document.createElement('div');
				col.setAttribute('class','col-xs-6 col-md-2');
				bandi.appendChild(col);
				
				// 썸네일 추가
				var thumbnail = document.createElement('a');
				thumbnail.setAttribute('href','#');
				thumbnail.setAttribute('class','thumbnail');
				col.appendChild(thumbnail);
				
				// 이미지 추가
				var img = document.createElement('img');
				img.setAttribute('src',arr(book.bandi)[i]);
				thumbnail.appendChild(img);
				
			}
		}

	})

	
		$.ajax({
		type : "get",
		url : "/",
		data : arr(book.kyobo),
		success : function(data) {
			
			for (var i = 0; i < arr(book.kyobo).length; i++) {
			
				// row밑에 추가
				var col = document.createElement('div');
				col.setAttribute('class','col-xs-6 col-md-2');
				kyobo.appendChild(col);
				
				// 썸네일 추가
				var thumbnail = document.createElement('a');
				thumbnail.setAttribute('href','#');
				thumbnail.setAttribute('class','thumbnail');
				col.appendChild(thumbnail);
				
				// 이미지 추가
				var img = document.createElement('img');
				img.setAttribute('src',arr(book.kyobo)[i]);
				thumbnail.appendChild(img);
				
			}
		}

	})
	
		$.ajax({
		type : "get",
		url : "/",
		data : arr(book.aladin),
		success : function(data) {
			
			for (var i = 0; i < arr(book.aladin).length; i++) {
			
				// row밑에 추가
				var col = document.createElement('div');
				col.setAttribute('class','col-xs-6 col-md-2');
				aladin.appendChild(col);
				
				// 썸네일 추가
				var thumbnail = document.createElement('a');
				thumbnail.setAttribute('href','#');
				thumbnail.setAttribute('class','thumbnail');
				col.appendChild(thumbnail);
				
				// 이미지 추가
				var img = document.createElement('img');
				img.setAttribute('src',arr(book.aladin)[i]);
				thumbnail.appendChild(img);
				
			}
		}

	})
	
		$.ajax({
		type : "get",
		url : "/",
		data : arr(book.ypbook),
		success : function(data) {
			
			for (var i = 0; i < arr(book.ypbook).length; i++) {
			
				// row밑에 추가
				var col = document.createElement('div');
				col.setAttribute('class','col-xs-6 col-md-2');
				ypbook.appendChild(col);
				
				// 썸네일 추가
				var thumbnail = document.createElement('a');
				thumbnail.setAttribute('href','#');
				thumbnail.setAttribute('class','thumbnail');
				col.appendChild(thumbnail);
				
				// 이미지 추가
				var img = document.createElement('img');
				img.setAttribute('src',arr(book.ypbook)[i]);
				thumbnail.appendChild(img);
				
			}
		}

	})
	
		$.ajax({
		type : "get",
		url : "/",
		data : arr(book.yes24),
		success : function(data) {
			
			for (var i = 0; i < arr(book.yes24).length; i++) {
			
				// row밑에 추가
				var col = document.createElement('div');
				col.setAttribute('class','col-xs-6 col-md-2');
				yes24.appendChild(col);
				
				// 썸네일 추가
				var thumbnail = document.createElement('a');
				thumbnail.setAttribute('href','#');
				thumbnail.setAttribute('class','thumbnail');
				col.appendChild(thumbnail);
				
				// 이미지 추가
				var img = document.createElement('img');
				img.setAttribute('src',arr(book.yes24)[i]);
				thumbnail.appendChild(img);
				
			}
		}

	})
	
	function initial() {

		const bandi = document.getElementById('bandi');
		const kyobo = document.getElementById('kyobo');
		const aladin = document.getElementById('aladin');
		const ypbook = document.getElementById('ypbook');
		const yes24 = document.getElementById('yes24');
		
	}
	
</script>
