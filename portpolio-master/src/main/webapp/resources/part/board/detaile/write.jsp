<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

  <!-- 부가적인 테마 -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

  <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<div class="panel panel-primary">
        <div class="panel-heading">
            <b>글쓰기</b>
        </div>

        <div class="panel-body">
            <div class="form-group">

                <div class="media">
                    <div class="media-left media-middle">

                    </div>
                    <div class="media-body">
                        <div class="panel panel-default">
                            <ul class="nav nav-tabs">
                                <li role="presentation" class="active"><a href="#">작성</a></li>
                                <li><a href="confirm">완료</a></li>
                            </ul>

                            <div class="panel-body">
                                <input type="text" class="form-control" placeholder="제목">
                                <textarea class="form-control" rows="25"></textarea>
                            </div>
                        </div>

                    </div>
                </div>

            </div>
        </div>
    </div>
</body>
</html>