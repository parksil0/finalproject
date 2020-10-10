function projectList(m_num){
	$.ajax("getAllProject.do", {
		type : "get",
		dataType : "json",
		data : { "m_num":  m_num },
		async: false,
		success : function(data){
			var pjListHtml = "";
			
			$.each(data, function(){
				pjListHtml += "<li data-index='"+ this.p_num +"'>";
				pjListHtml += "<a href='projectTodo.do?p_num="+ this.p_num +"' class='projectTit'>"+ this.p_name +"</a>";
				pjListHtml += "<ul>";
				pjListHtml += "<li><a href='projectTodo.do?p_num="+ this.p_num +"'>TO-DO</a></li>";
				pjListHtml += "<li><a href='notice.html'>NOTICE</a></li>";
				pjListHtml += "</ul>";
				pjListHtml += "</li>";
			});
			
			$(".projectList").html(pjListHtml);
		}
	});	
}

$().ready(function(){
	
	var loginMNUM = $(".loginMNUM").val();
	projectList(loginMNUM);
	

   
})
