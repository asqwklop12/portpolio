<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="/resources/css/part/user/info.css">

     
     <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <!-- 합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

    <!-- 부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

    <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
     
</head>
<body>
<input type="checkbox" id="menu_state" checked>
<nav>
	<div class="nav" align="center">
        <div class="nav_img"><img  src="/resources/img/kakao.png" alt="..." class="img-circle icon"></div>
        <div class="nav_name">
            <p>${sessionScope.userLogin.UserName}님 <br/> 반갑습니다.</p>
        </div>

        <div class="nav_button"><a href="login/edit">
            <button type="button" class="btn btn-primary btn-lg">정보 수정</button></a>
        </div>

        <div class="nav_button"><a href="login/logout">
            <button type="button" class="btn btn-primary btn-lg">로그 아웃</button></a>
        </div>
    </div>
</nav>
</body>
</html>