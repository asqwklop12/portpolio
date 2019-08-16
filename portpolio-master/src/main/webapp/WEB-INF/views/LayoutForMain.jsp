<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<%@ include file="/resources/bootstrap/package.jsp" %>
    
<link rel="stylesheet" href="/resources/css/part/main/notice+login.css">
<link rel="stylesheet" href="/resources/css/part/main/footer.css">

<!-- 로그인이 된후 -->
<link rel="stylesheet" href="/resources/css/part/main/afterLogin.css">


<!-- 로그인 전 -->
<link rel="stylesheet" href="/resources/css/part/main/afterLogin.css">


</head>
<body>
	
	<header> </header>
	<c:choose>
		<c:when test="${empty sessionScope.data}">
			<%@include file="/resources/part/main/notLoginMainHeader.jsp"%>
		</c:when>
		<c:otherwise>
			<%@include file="/resources/part/main/headerForHome.jsp"%>
		</c:otherwise>
	</c:choose>
	<nav>
    
		<%@include file="/resources/part/main/wellcome.jsp"%>
		<div class="center container-fluid">
			<div class="center_notice">
				<%@include file="/resources/part/main/notice.jsp"%>
			</div>

			<div class="center_Login">
				<%@include file="/resources/part/main/login.jsp"%>
			</div>
		</div>
	</nav>
	<section>
		<%@include file="/resources/part/main/bookList.jsp"%>
	</section>
	<footer>
		<%@include file="/resources/part/footer/info.jsp"%>
	</footer>
</body>
</html>