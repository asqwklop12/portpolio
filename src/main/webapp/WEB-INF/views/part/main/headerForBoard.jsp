<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  
   <style type="text/css">
      	<%@ include file="../../css/part/main/header.css" %>
    </style>
</head>
<body>
  <div class="margin3 navbar navbar-inverse">
    <ul class="nav nav-pills pull-right">
      <li role="presentation"><a href="#">Home</a></li>
      <li role="presentation" ><a href="#">검색목록</a></li>
      <li role="presentation" class="active"><a href="#">게시판</a></li>
    </ul>
    <%@include file="./search.jsp" %>
  </div>
</body>
</html>