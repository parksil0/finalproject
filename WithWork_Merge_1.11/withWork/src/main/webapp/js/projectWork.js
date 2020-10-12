function insertTodo(frm){
	frm.action="pjInsertTodo.do";
	frm.submit();
}

function updateTodo(frm){
	frm.action="pjupdateTodo.do";
	frm.submit();
}

function getProjectJoiner(p_num){
	$.ajax("getProjectJoiner.do", {
		type : "get",
		dataType : "json",
		data : { "p_num":  p_num },
		async: false,
		success : function(data){
			var JoinerListHtml = "";
			var JoinerTodoList = "";
			var loginMNUM = $(".loginMNUM").val();
			
			$.each(data, function(){
				JoinerListHtml += "<option value='"+ this.m_num +"'>"+ this.g_name;
				JoinerListHtml += " " + this.role;
				JoinerListHtml += " (" + this.depart + ")</option>";
				
				if(this.m_num != loginMNUM){
					JoinerTodoList += "<dl><dt>";
					JoinerTodoList += "<span class='memberName' data-index='"+ this.m_num +"'>";
					JoinerTodoList += this.g_name + " "+ this.role + " (" + this.depart + ")</span>";
					JoinerTodoList += "<span class='todoType'>";
	                JoinerTodoList += "</span></dt></dl>";
                }
			});
			
			$(".workPopWorker select").html(JoinerListHtml);
			$(".departTodo").html(JoinerTodoList);
		}
	});	
}

function getTodoCnt(){
    $(".departTodo dl").each(function(){
		var allCnt = $(this).find(".listItem li").length;
		var importCnt = $(this).find(".listItem li.import").length;
		var normalCnt = allCnt - importCnt;
		
		var cntHtml = "";
		cntHtml += "<span class='bullet'>&bull;</span>" + importCnt;
		cntHtml += "<span class='bullet'>&bull;</span>" + normalCnt;
		
		$(this).find(".todoType").html(cntHtml);
    });
}

function getProjectTodo(worker_m, p_num){
	$.ajax("getProjectTodo.do", {
		type : "get",
		dataType : "json",
		data : { "worker_m":  worker_m, "p_num": p_num },
		async: false,
		success : function(data){
			var projcetTodoHtml = "";
			
			$.each(data, function(){
				if(this.betweendate <= 1){
					projcetTodoHtml += "<li class='import'>";
				}else{
					projcetTodoHtml += "<li>";
				}
				
				projcetTodoHtml += "<a href='#' data-index='"+ this.t_num +"'>";
				projcetTodoHtml += "<span class='todoContTit'>" + this.title + "</span>";
				projcetTodoHtml += "<span class='deadLine'>";
				
				if(this.progress == '완료'){
					projcetTodoHtml += "(컨펌 진행중입니다.)</dd>";								
				}else{
					projcetTodoHtml += "(마감일까지  "+ this.betweendate +"일 남았습니다)</dd>";				
				}
				
				projcetTodoHtml += "</span><span class='todoContTxt'>"+ this.text +"</span>";
				projcetTodoHtml += "</a></li>";
				
			});
			$(".projectTodo").html(projcetTodoHtml);
		}
	});	
}

function dragTodoUpdate(worker_m, t_num){
	$.ajax("dragTodoUpdate.do", {
		type : "get",
		dataType : "json",
		data : { "worker_m":  worker_m, "t_num": t_num },
		async: false,
		success : function(data){
		}
	});	
}

function getProjectMemberTodo(worker_m, p_num){
	var dispHtml = "";
	$.ajax("getProjectTodo.do", {
		type : "get",
		dataType : "json",
		data : { "worker_m":  worker_m, "p_num": p_num },
		async: false,
		success : function(data){
			dispHtml = "<dd><ul class='listItem connectedSortable'>";
			
			$.each(data, function(){
				var workerTNUM = this.t_num;
				
				if(this.betweendate <= 1){
					dispHtml += "<li class='import'>";
				}else{
					dispHtml += "<li>";
				}
				dispHtml += "<a href='#' data-index='"+ workerTNUM +"'>";
				dispHtml += "<span class='todoContTit'>"+ this.title +"</span>";
				dispHtml += "<span class='deadLine'>(마감일까지  "+ this.betweendate +"일 남았습니다.)</span>";
				dispHtml += "<span class='todoContTxt'>"+ this.text +"</span>";
				dispHtml += "</a></li>";
			});
			dispHtml += "</ul></dd>";
		}
	});	
	return dispHtml;
}

function getTodoDetail(t_num) {
	$.ajax("getTodoDetail.do", {
		type : "get",
		dataType : "json",
		async: false,
		success : function(data){
			$.each(data, function(){
				var dataTNUM = this.t_num;
				var dataOrderer = this.orderer + " " + this.o_role + " (" + this.depart + ")"; 
				var dataWorkerM = this.worker_m; 
				var dataWorker = this.worker + " " + this.w_role + " (" + this.depart + ")"; 
				var dataProgress = this.progress; 
				var dataPNUM = this.p_num; 
				var dataPNAME = this.p_name; 
				
				if(dataTNUM == t_num){
					$(".workPopup .t_num").val(dataTNUM);
					$(".workPopup .workPopTit input").val(this.title);
					$(".workPopup .workPopTxt input").val(this.text);
					$(".workPopup .workPopLeader option").text(dataOrderer);
					$(".workPopup .workPopLeader input").val(this.order_m);
					$(".workPopup input[name=orderdate]").val(this.orderdate);
					$(".workPopup input[name=enddate]").val(this.enddate);
					
					if(dataProgress == '시작 전'){
						$(".workPopup #todoStateBefore").prop('checked', true);
					}else if(dataProgress == '진행 중'){
						$('.workPopup #todoStateIng').prop('checked', true);
					}else{
						$('.workPopup #todoStateEnd').prop('checked', true);
						$('.workPopup td *').prop('disabled', true);
						$('.workPopup .popupOK').hide();
					}
				}
			});
		}
	});
}

function getParam(sname) {
    var params = location.search.substr(location.search.indexOf("?") + 1);
    var sval = "";
    params = params.split("&");
    for (var i = 0; i < params.length; i++) {
        temp = params[i].split("=");
        if ([temp[0]] == sname) { sval = temp[1]; }
    }
    return sval;
}

$().ready(function(){
	
	var locationPNUM = getParam("p_num");
	var loginMNUM = $(".loginMNUM").val();
	
	$(".projectList li").each(function(){
		var p_num = $(this).attr("data-index");
		if(locationPNUM == p_num){
			$("header li").removeClass("active");
			$(this).addClass("active");
		}
	});
	
	getProjectJoiner(locationPNUM);
	
	$(".departTodo dl").each(function(){
		var teamTodo = $(this).html();
		var workerM = $(this).find(".memberName").attr("data-index");
		
		teamTodo += getProjectMemberTodo(workerM, locationPNUM);
		$(this).html(teamTodo);
	});
	
	$(".workAddBtn").click(function(){
		$("input[name=progress]:first-child").prop('checked', true);
	    $(".workAddPopup").show();
	    $(".darkBack").show();
	});
	
	$(document).on("click", ".projectTodo li a", function(){ 
		$('.workPopup td *').prop('disabled', false);
		$('.workPopup .workCategory select').prop('disabled', true);
		$('.workPopup .workPopLeader select').prop('disabled', true);
		$('.workPopup .popupOK').show();	
		
		getTodoDetail($(this).attr('data-index'));
        $(".workPopup").show();
        $(".darkBack").show();
	});	
	
	$(document).on("click", ".departTodo li a", function(){ 
		var detailTNUM = $(this).attr("data-index");
		
		$('.workPopup td *').prop('disabled', true);
		$('.workPopup .popupOK').hide();
		
		getTodoDetail(detailTNUM);
		
        $(".workPopup").show();
        $(".darkBack").show();
	});	
	
    $(".projectTodo, .departTodo ul").sortable({
        connectWith: ".connectedSortable",
		stop: function(event, ui) {
            getTodoCnt();
		},
		update: function(event, ui){
		    if (this === ui.item.parent()[0]) {
				var dragMNUM = ui.item.closest("dl").find(".memberName").attr("data-index");
				var dragTNUM = ui.item.find('a').attr('data-index');
				
				if(dragMNUM){
					dragTodoUpdate(dragMNUM, dragTNUM);			
				}else{
					dragTodoUpdate(loginMNUM, dragTNUM);
				}
				
				$(".projectTodo li, .departTodo ul li").each(function(){
					var liParent = $(this).parent();
					var idx = $(this).find("a").attr('data-index');
					
					if(dragTNUM == idx){
						$(this).remove();
						$(liParent).prepend($(this));
					}
				});
		    }
		}
    }).disableSelection();
    
	getTodoCnt();

});