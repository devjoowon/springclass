// 자바스크립트 코드를 넣어요!

function myFunc(){
	
	let url = $("#myForm > select > option:selected").text()
	
	$("#myForm").attr("action", url);
}