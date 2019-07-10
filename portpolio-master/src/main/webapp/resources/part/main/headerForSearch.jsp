<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="/resources/css/part/main/header.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
 

</head>
<body>
  <div class="margin3 navbar navbar-inverse">
    <ul class="nav nav-pills pull-right">
      <li role="presentation"><a href="home">Home</a></li>
      <li role="presentation" ><a href="list">검색목록</a></li>
      <li role="presentation"><a href="board">게시판</a></li>
    </ul>

      <%@include file="./search.jsp" %>
  </div>
  
</body>
</html>