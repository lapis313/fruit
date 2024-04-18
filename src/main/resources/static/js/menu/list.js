function getJSON(){
	/**
	 * JSON.parse -> 객체화
	 * JSON.stringify -> 문자열로 형변환
	 */
	let data = {};

	$.ajax({
	  	 type: "GET"
	    //, url: "/menu/list2-data"
	    , url: "/menu/list2-allData"
	    , contentType: 'application/json'
	    //, dataType : 'text'		//됨 //컨트롤러에서 메소드의 리턴이 String이면 text로 받아야 한다(json으로하면 못받음)
	    , dataType : 'json'	//됨
	    , async : false
	    , data: data	//됨
	    , success: function(data) {
			//alert('성공');
			console.log('성공');
			//console.log(data);
			data.forEach(index =>{
				console.log(index);
			})
			/********************************************************************************************* */

			let html = '';
			html += '<nav class="topMenu" role="navigation">'
				html += '<ul class="navlist">'
				///////////////
				data.forEach(i =>{
					//html += '<li><a class="menuLink" href="#">'+i+'</a></li>';
					html += '<li><a class="menuLink" href="/home">'+i.menu_name+'</a></li>';
					})
				///////////////
				html += '</ul>'
			html += '</nav>'
			$('#menu-list').append(html);
            /********************************************************************************************* */
		   }
	    , error: function(e) {
	        alert('실패');
	    }
	});
}
getJSON();
