<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title"><b>아이디</b>
        <button type="button" name="button" class="pull-right ">취소</button>
        <button type="button" name="button" class="pull-right">완료</button>
      </h3>
    </div>
    <div class="panel-body">
      <div class="media">
        <div class="media-right media-middle">
          <a href="#">
            <img class="media-object"  src="/resources/img/kakao.png" alt="...">
          </a>
        </div>
        <div class="media-body">

          <textarea class="form-control" rows="7">내용 변경</textarea>
        </div>
      </div>
    </div>
  </div>
</body>
</html>