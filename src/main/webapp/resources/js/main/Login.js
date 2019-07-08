/**
 * 
 */
$(document).ready(function(){
	$("#confirm").click(function() {
		  if($("#email").val() == "" || $("#password").val() == "") {
		    	alert("로그인을 할수 없습니다.");
		    }else {
		    	location.href ="login";
		    }
	 })
 });