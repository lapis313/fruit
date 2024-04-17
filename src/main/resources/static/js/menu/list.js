function getJSON(){
	alert(111);
	$.ajax({
	  	 type: "GET"
//	    , url: "http://localhost:8080/menu/list"
	    , url: "/menu/list"
	    , contentType: 'application/json'
	    , dataType : 'json'
	    , async : false
	    //, data: JSON.stringify(data)
	    , success: function(data) {
			let test = JSON.parse(data);
			console.log(data);
			console.log(test);
	        if (data.result == 'success') {
	            //tagBtn.text(data.status);
	            alert('성공');
	            //$("#menuList").append(html);
	        }
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
