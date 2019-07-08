<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="/resources/css/part/main/notice+login.css">

       
</head>
<body>
<header>
	<%@include file="/resources/part/main/headerForHome.jsp" %>
</header>
<nav>

<%@include file="/resources/part/main/wellcome.jsp" %>
	  <div class="center container-fluid">
    <div class="center_notice">
    <%@include file="/resources/part/main/notice.jsp" %>
    </div>

    <div class="center_Login">
    <%@include file="/resources/part/main/login.jsp" %>
    </div>
  </div>
</nav>
<section>
     <%@include file="/resources/part/main/bookList.jsp" %>
</section>
<footer>
       <%@include file="/resources/part/footer/info.jsp" %>
</footer>
</body>
</html>