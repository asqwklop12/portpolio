<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
   
   <style type="text/css">
      	<%@ include file="../../css/part/book/result.css" %>
    </style>
    
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
      <div class="media">
      
        <div class="media-left media-top">
          <img class="media-object" src="D:/younghun/Project/src/main/webapp/WEB-INF/views/img/kakao.png" alt="...">
        </div>
        
        <div class="media-body" onclick="enterInfo()">
        
          <div class="form-group">
            <label for="title">제목: </label>
            <span id="title">-</span>
          </div>

          <div class="form-group">
            <label for="author">작가: </label>
            <span id="author">-</span>
          </div>

          <div class="form-group hidden">
            <label for="translator">역자: </label>
            <span id="translator">-</span>
          </div>

          <div class="form-group">
            <label for="publish">출판사: </label>
            <span id="publish">-</span>
          </div>

          <div class="form-group">
            <label for="price">정가: </label>
            <span id="price">-</span>
          </div>

          <div class="form-group">
            <label for="like">좋아요: </label>
            <span id="like">-</span>
          </div>
          
        </div>
        
      </div>

      <div class="border">
      </div>
<script type="text/javascript">
	function enterInfo() {
		location.href = "search/info";
	}
</script>
</body>
</html>