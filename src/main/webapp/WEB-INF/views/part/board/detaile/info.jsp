<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>
<body>
  <div class="panel panel-primary">
    <div class="panel-heading">
      <b>번호</b> <b>제목</b>
    </div>


    <div class="panel-body">

      <div class="form-group">

        <div class="media">
          <div class="media-left media-top" align="center">
            <img src="./img/kakao.png" alt="" class="img-circle imgSize" />
            <br />
            <br />
            <b id="id">asqwklop12</b>
          </div>
          <div class="media-body">
            <div class="panel panel-default">
              <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#">원문</a></li>
                <li role="presentation"><a href="#">수정</a></li>
                <li><a href="#">삭제</a></li>
              </ul>

              <div class="panel-body">
                 글작성 부분
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>