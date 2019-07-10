/**
 * 
 */

$(document).ready(function(){
	$("#confirm").click(function() {
		  if($("#email").val() == "" ) {
		    	alert("이메일을 입력해주시기바랍니다.");
		    }else {
		    	location.href ="home";
		    }
	 })
 });