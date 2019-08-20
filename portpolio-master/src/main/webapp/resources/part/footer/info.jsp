<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="footer">

	<div class="footer_text">
		이 웹페이지는 포트폴리오로 만들어 졌습니다.
		<img class="logo" id="git" alt="git" src="/resources/img/git.png"> 
		<img class="logo" id="naver" alt="naver" src="/resources/img/blog.png">
	</div>

</div>
<script>
const github = document.getElementById('git');
const naver = document.getElementById('naver');

const gitUrl = "https://github.com/asqwklop12/portpolio/tree/master/portpolio-master";
const naverUrl = "https://blog.naver.com/asqwklop12";

github.addEventListener('click',git);
naver.addEventListener('click',blog);

function git() {
	window.open(gitUrl);
}

function blog() {
	
	window.open(naverUrl);
	}

</script>