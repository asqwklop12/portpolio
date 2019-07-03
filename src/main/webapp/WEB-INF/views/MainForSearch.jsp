<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
   
<head>
<meta charset="UTF-8">
<title>검색 결과</title>
	   <style type="text/css">
      		<%@ include file="./css/part/feild.css" %>
       </style>
</head>
<body>
	<%@include file="./part/user/info.jsp" %>
	<main>
	<header>
	
	</header>
	<%@include file="./part/main/headerForSearch.jsp" %>
	<section>
	
	<div class="panel panel-primary">
    	<div class="panel-heading">
    	  <h3 class="panel-title">검색 결과</h3>
    	</div>
    
    <div class="panel-body result_click">
		<%@include file="./part/book/result.jsp" %>

      <div class="text-center">

        <ul class="pagination">
          <li class="active"><a href="#">1</a></li>
        </ul>
      </div>
    </div>
  </div>
		</section>
</main>

</body>
</html>