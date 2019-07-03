<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <style type="text/css">
      	<%@ include file="../../css/part/main/afterLogin.css" %>
    </style>
</head>
<body>
  <div class="panel panel-primary" align="center">
    <div class="panel-heading">
      <h3 class="panel-title">회원 정보</h3>
    </div>
    <div class="panel-body ">

      <div class="form-group ">
        <img  src="/resources/img/kakao.png" alt="" class="img-circle imgSize"/>
      </div>

        <div class="form-group">
            <p><b>닉네임</b>님 만나서 반갑습니다.</p>
        </div>

        <div class="form-group"><a href="login/edit">
            <button type="button" class="btn btn-default">정보 수정</button></a>
        </div>

        <div class="form-group"><a href="login/logout">
            <button type="button" class="btn btn-default">로그아웃</button></a>
        </div>
      </div>
    </div>
</body>
</html>