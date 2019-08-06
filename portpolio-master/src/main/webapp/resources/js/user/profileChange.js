/**
 * 
 */

var profile = document.getElementById("profile");
profile.addEventListener("click", function(e) {
	e.preventDefault();
	$.ajax({
		url : '/profile/insert',
		success : function(data) {

			const image = document.getElementById("image");
			const inputTag = document.getElementById("inputs");
			// 기존에 있던 이미지 태그 삭제
			profile.removeChild(image);

			if (inputTag != null) {
				profile.removeChild(inputTag);
			}

			var img = document.createElement('img');
			img.setAttribute('src', '/resources/img/' + data);
			img.setAttribute('alt', "");
			img.setAttribute('name', 'image');
			img.setAttribute('id', 'image');
			img.setAttribute('style', 'width:10%');

			var input = document.createElement('input');
			input.setAttribute('type', 'hidden');
			input.setAttribute('value', data);
			input.setAttribute('name', 'image');
			input.setAttribute('id', 'inputs');
			profile.appendChild(img);
			profile.appendChild(input);

		}
	});
});