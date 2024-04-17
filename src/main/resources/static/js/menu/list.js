function init(){
	
	let params = {};
	
	$.ajax({
	  	 type: "GET"
//	    , url: "http://localhost:8080/menu/list"
	    , url: "/menu/list"
	    , contentType: 'application/json'
	    , dataType : 'json'
	    , async : false
	    , data: JSON.stringify(params)
	    , success: function(data) {
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
	
}
