<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>축하합니다</title>
<%@ include file="/resources/bootstrap/package.jsp"%>
</head>
<body>
  <br/>
  <br/>

   <div class="media container">
       <div class="media-left">

           <img class="media-object"  src="${pageContext.request.contextPath}/resources/img/owl.png"  alt="...">

       </div>
       <div class="media-body">
           <h4 class="media-heading">해당 아이디로 접속이 가능합니다.</h4>
           <div>${name}님, 만나서 반갑습니다.</div>
           <a href="${pageContext.request.contextPath}/">로그인하러 가기</a>
       </div>

   </div>
</body>
</html>