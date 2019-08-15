<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="well well-lg">

	<div class="list-group" align="center">
	     <c:forEach var="board" items="${notice}">
			<a href="#" class="list-group-item">${board.boardTitle}</a>
		</c:forEach>
	</div>
</div>
