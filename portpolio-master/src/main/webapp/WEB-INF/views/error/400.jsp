<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 에러</title>
<%@ include file="/resources/bootstrap/package.jsp"%>
</head>
<body>
  <br/>
  <br/>

   <div class="media container">
       <div class="media-left">

           <img class="media-object"  src="/resources/img/owl.svg" alt="...">

       </div>
       <div class="media-body">
           <h4 class="media-heading">오류</h4>
           죄송합니다. 요청하신 경로로는 접속이 불가능합니다.
           <button type="button" id="btn" class="btn btn-info">돌아가기</button>
       </div>
   </div>
   <script type="text/javascript" src="/resources/js/error/error.js"></script>
</body>
</html>