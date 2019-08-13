<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>축하합니다</title>
  <!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
  <br/>
  <br/>

   <div class="media container">
       <div class="media-left">

           <img class="media-object"  src="/resources/img/kakao.png" alt="...">

       </div>
       <div class="media-body">
           <h4 class="media-heading">해당 아이디로 접속이 가능합니다.</h4>
           <div>${name}님, 만나서 반갑습니다.</div>
           <a href="${pageContext.request.contextPath}/">로그인하러 가기</a>
       </div>

   </div>
</body>
</html>