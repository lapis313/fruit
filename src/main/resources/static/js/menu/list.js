function init(){
	
	$.ajax({
	  	 type: "POST"
	    , url: "http://localhost:8080/menu/list"
	    , contentType: "application/json"
	    , data: JSON.stringify({
			
		})
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



/*
	function test() {
	    $.ajax({
	        url: "<c:url value="/test" />",
	        type: "post",
	        data: JSON.stringify(obj),
	        dataType: "json",
	        contentType: "application/json",
	        success: function(data) {
	            alert("성공");
	        },
	        error: function(errorThrown) {
	            alert(errorThrown.statusText);
	        }
	    });
	}
*/