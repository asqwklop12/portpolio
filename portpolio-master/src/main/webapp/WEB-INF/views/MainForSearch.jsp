<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<%@ include file="/resources/bootstrap/package.jsp"%>
<link rel="stylesheet" href="/resources/css/part/feild.css">

<head>
<meta charset="UTF-8">
<title>검색 결과</title>

</head>
<body>

	<c:choose>
		<c:when test="${not empty sessionScope.data}">
		
			<%@include file="/resources/part/user/info.jsp"%>
			<%@include file="/resources/part/search/afterLogin.jsp"%>
		</c:when>

		<c:otherwise>
			<%@include file="/resources/part/search/beforeLogin.jsp"%>
		</c:otherwise>
	</c:choose>
</body>
</html>