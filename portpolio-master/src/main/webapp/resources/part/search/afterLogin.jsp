<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main> <header> </header> 
<%@include file="/resources/part/main/headerForSearch.jsp"%>
	<section>

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">검색 결과</h3>
			</div>

			<div class="panel-body result_click">
				<%@include file="/resources/part/book/result.jsp"%>

				<div class="text-center">

					<ul class="pagination">
						<c:forEach begin="1" end="${page}" var="num">
							<li><a href="?keyword=${keyword}&num=${num}">${num}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</section>
	</main>