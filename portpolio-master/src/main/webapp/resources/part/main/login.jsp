<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<c:choose>
	<c:when test="${not empty sessionScope.data}">
		<%@include file="/resources/part/user/afterLogin.jsp"%>
	</c:when>

	<c:otherwise>
		<%@include file="/resources/part/user/beforeLogin.jsp"%>
	</c:otherwise>
</c:choose>
