<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  <link rel="stylesheet" href="/resources/css/part/user/info.css">

<input type="checkbox" id="menu_state" checked>
<nav>  
	<div class="nav" align="center">
        <div class="nav_img"><img width="50%"  src="/resources/img/${sessionScope.data.image}" alt="..." class="img-circle"></div>
        <div class="nav_name">
            <p>${sessionScope.data.name}님 <br/> 반갑습니다.</p>
        </div>
    
        <div class="nav_button"><a href="login/edit">
            <button type="button" class="btn btn-primary btn-lg">정보 수정</button></a>
        </div>

        <div class="nav_button"><a href="login/logout">
            <button type="button" class="btn btn-primary btn-lg">로그 아웃</button></a>
        </div>
    </div>
</nav>