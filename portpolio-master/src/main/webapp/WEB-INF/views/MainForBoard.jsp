<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/resources/bootstrap/package.jsp"%>
<link rel="stylesheet" href="/resources/css/part/feild.css">

<meta charset="UTF-8">
<title>게시판</title>

</head>
<body>
	<%@include file="/resources/part/user/info.jsp" %>
 <main>
	<header>

	</header>
	<%@include file="/resources/part/main/headerForBoard.jsp" %>
	<section>
		<%@include file="/resources/part/board/list.jsp" %>
	</section>
  </main>

</body>
</html>