function getJSON(){
	/**
	 * JSON.parse -> 객체화
	 * JSON.stringify -> 문자열로 형변환
	 */
	let data = {};

	$.ajax({
	  	 type: "GET"
	    , url: "/menu/list"
	    , contentType: 'application/json'
	    , dataType : 'text'		//컨트로ㅑㄹ러에서 메소드의 리턴이 String이면 text로 받아야 한다(json으로하면 못받음)
	    //, dataType : 'json'
	    , async : false
	    , data: JSON.parse(data)
	    , success: function(data) {
			alert('성공');
			console.log(data);
			/*
	        if (data.result == 'success') {
	            //tagBtn.text(data.status);
	            alert('성공');
	            //$("#menuList").append(html);
	        }
	        */
	    }
	    , error: function(e) {
	        alert('실패');
	    }
	});
	alert(222);
}
let a = 111;
getJSON();
console.log(a);
alert(111);
