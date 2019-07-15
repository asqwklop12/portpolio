/**
 * 
 */

window.onload = function() {
	let email = document.querySelector("#email");
	let name = document.querySelector("#name");
	let password = document.querySelector("#Password");
	let rePassword = document.querySelector("#rePassword");
	let context = document.querySelector("#context");
	let confirm = document.getElementById("confirm");
	const emailExp = "/^\w([._-]?\w)*@\w([._-]?[a-zA-Z])*.[a-zA-Z]{2,3}$/g";
	
	password.onkeydown = function() {
		if (password.value == "" && rePassword.value != "") {
			rePassword.value = "";
			return;
		}
	}
	
	rePassword.onkeyup = function() {
		if (password.value == "") {
			rePassword.value = "";
			return;
		}
		
		if (rePassword.value == "") {
			context.style = "visibility: hidden;";
			return;
		}
		
		if (password.value != "" && password.value != rePassword.value) {
			context.style = "visibility: display;";
			return;
		}
		context.style = "visibility: hidden;";
	}
	
	password.onkeyup = function() {
		
		if (rePassword.value != "" && password.value != rePassword.value) {
			context.style = "visibility: display;";
			return;
		}
		context.style = "visibility: hidden;";
	}
	
	confirm.onclick = function() {
		
		if (email.value == "" || name.value == "" || password.value == ""
				|| rePassword.value == "") {
			alert("빈칸이 존재합니다. 회원가입을 할 수 없습니다.");
			return;
		}
		
		if (context.style == "visibility: display;") {
			alert("비밀번호가 다릅니다. 확인해주세요");
			return;
		}
		
		return "home";
		
	}
}



	



