function insertTodo(frm){
	frm.action="insertTodo.do";
	frm.submit();
}

function updateTodo(frm){
	frm.action="updateTodo.do";
	frm.submit();
}

function getTodoMeHtml(htmlSource, todoTNUM, todoTITLE, todoPROGRESS, todoBD){

	if(todoBD <= 1){
		htmlSource += "<li class='import'>";
	}else{
		htmlSource += "<li>";
	}
	
	htmlSource += "<a href='#' data-index='" + todoTNUM +"'><span class='todoContTit'>";
	htmlSource += todoTITLE;
	
	if(todoPROGRESS == '완료'){
		htmlSource += "</span><span class='deadLine'>(결재 진행중)</span></a></li>";
	}else{
		htmlSource += "</span><span class='deadLine'>("+ todoBD +"일 남았습니다.)</span></a></li>";
	}
	return htmlSource;
}

function getDetailSelect(option, data){
	$(option).each(function(){
		var optionVal = $(this).val();
		if(data == optionVal){
			$(this).prop('selected', true);
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

function getAllTodo(worker_m, p_num) {
	var dispHtml = "";
	
	$.ajax("getAllTodo.do", {
		type : "get",
		data : { "worker_m":  worker_m },
		dataType : "json",
		async: false,
		success : function(data){
			$.each(data, function(){
				var todoTNUM = this.t_num;
				var todoPNUM = this.p_num;
				var todoTITLE = this.title;
				var todoPROGRESS = this.progress;
				var todoBD = this.betweendate;
				
				if(p_num != ""){
					if(todoPNUM == p_num){
						dispHtml = getTodoMeHtml(dispHtml, todoTNUM, todoTITLE, todoPROGRESS, todoBD);
					}
				}else{
					dispHtml = getTodoMeHtml(dispHtml, todoTNUM, todoTITLE, todoPROGRESS, todoBD);
				}
			});
		}
	});
	
	return dispHtml;
}

function getTeamTodo(worker_m) {
	var dispHtml = "";
	$.ajax("getAllTodo.do", {
		type : "get",
		data : { "worker_m":  worker_m },
		dataType : "json",
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
				dispHtml += "<span class='deadLine'>("+ this.betweendate +"일 남았습니다.)</span>";
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
				var dataOrderer = this.orderer + " " + this.o_role; 
				var dataWorkerM = this.worker_m; 
				var dataWorker = this.worker + " " + this.w_role; 
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
					
					if(dataPNUM == 0){
						var depart = $(".todoNav li").eq(1).text();
						$(".workPopup .workCategory option").text(depart);
						$(".workPopup input[name=p_num]").val(0);		
						getAllDepart();			
					}else{
						$(".workPopup .workCategory option").text(dataPNAME);
						$(".workPopup input[name=p_num]").val(dataPNUM);		
						getProjectJoiner(dataPNUM); 			
					}
					
					var workerOption = $(".workPopup .workPopWorker option");
					getDetailSelect(workerOption, dataWorkerM);
					
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

function getAllDepartTodo() {
	$.ajax("getAllDepart.do", {
		type : "get",
		dataType : "json",
		async: false,
		success : function(data){
			var teamDispHtml = "";
			$.each(data, function(){
				var nameRole = this.g_name + " " + this.role;
				var loginMNUM = $(".loginMNUM").val();
				
				if(this.m_num != loginMNUM){
					teamDispHtml += "<dl><dt>";
					teamDispHtml += "<span class='memberName' data-index='"+ this.m_num +"'>"+ nameRole + " (" + this.depart + ")</span>";
					teamDispHtml += "<span class='todoType'>";
	                teamDispHtml += "</span></dt></dl>";
				}
			});
			
			$(".departTodo").html(teamDispHtml);
		}
	});
}

function getAllDepart() {
	$.ajax("getAllDepart.do", {
		type : "get",
		dataType : "json",
		async: false,
		success : function(data){
			var dispHtml = "";
			$.each(data, function(){
				var nameRole = this.g_name + " " + this.role;
				var loginMNUM = $(".loginMNUM").val();
			
				dispHtml += "<option value='";
				dispHtml += this.m_num + "'>";
				dispHtml += nameRole + "</option>";
			});
			
			$(".workPopWorker select").html(dispHtml);
		}
	});
}

function projectNav(m_num){
	$.ajax("getAllProject.do", {
		type : "get",
		dataType : "json",
		data : { "m_num":  m_num },
		async: false,
		success : function(data){
			var originTxt = $(".todoNav").html();
			
			$.each(data, function(){
				if(this.p_num != 0){
					originTxt += "<li class='project' data-index='" + this.p_num + "'>";
				}else{
					originTxt += "<li data-index='" + this.p_num + "'>";
				}
				originTxt += "<a href='#'>" + this.p_name + "</a></li>";
			});
			
			$(".todoNav").html(originTxt);
		}
	});	
}

function getMemberProject(m_num, p_num){
	$.ajax("getAllProject.do", {
		type : "get",
		dataType : "json",
		data : { "m_num":  m_num },
		async: false,
		success : function(data){
			$.each(data, function(){
				if(this.p_num == p_num){
					return true;
				}else{
					return false;
				}
			});
		}
	});	
}

function projectOption(m_num){
	var categoryTxt = "";
	$.ajax("getAllProject.do", {
		type : "get",
		dataType : "json",
		data : { "m_num":  m_num },
		async: false,
		success : function(data){
			$.each(data, function(){
				categoryTxt += "<option value='"+ this.p_num +"'>" + this.p_name + "</option>";
			});
		}
	});	
	return categoryTxt;
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

function todoSetInterval(){
	$(".todoNav li").eq(0).trigger("click");
}

function getProjectJoiner(p_num){
	$.ajax("getProjectJoiner.do", {
		type : "get",
		dataType : "json",
		data : { "p_num":  p_num },
		async: false,
		success : function(data){
			var JoinerListHtml = "";
			
			$.each(data, function(){
				JoinerListHtml += "<option value='"+ this.m_num +"'>"+ this.g_name;
				JoinerListHtml += " " + this.role + "</option>";
			});
			
			$(".workPopWorker select").html(JoinerListHtml);
			console.log(JoinerListHtml);
		}
	});	
}

$().ready(function(){

	$(".header li").removeClass("active");
	$(".allInfo li").eq(0).addClass("active");

	var loginMNUM = $(".loginMNUM").val();
	
	projectNav(loginMNUM);
	projectOption(loginMNUM);
	
	var navSize = $(".todoNav > li").length;
	var contSize = $(".todoCont > li").length;
	var originCont = $(".todoCont").html();
	
	for(var i=contSize; i<=navSize; i++){
		originCont += "<li><ul class='todoContList listItem'></ul></li>";
	};
	
	$(".todoCont").html(originCont);
	
	$(document).on("click", ".todoNav li", function(){    
		var tabTodoHtml = "";
		var tabPNUM = $(this).attr("data-index");
		var idx = $(this).index();
		
		$(".todoNav li").removeClass("active");
		$(this).addClass("active");
        $(".todoCont > li").removeClass("active");
        $(".todoCont > li").eq(idx).addClass("active");	
		
		if(idx == 0){
			tabTodoHtml = getAllTodo(loginMNUM, "");
		}else{
			tabTodoHtml = getAllTodo(loginMNUM, tabPNUM);
		}
		
		$(".todoCont li.active").find(".todoContList").html(tabTodoHtml);
	});
	
	//setInterval("todoSetInterval()", 1000);
	$(".todoNav li").eq(0).trigger("click");
	
	$(document).on("click", ".todoContList li a", function(){ 
		var detailTNUM = $(this).attr("data-index");
		
		$('.workPopup td *').prop('disabled', false);
		$('.workPopup .workPopLeader select').prop('disabled', true);
		$('.workPopup .workCategory select').prop('disabled', true);
		$('.workPopup .popupOK').show();
		
		getTodoDetail(detailTNUM);
		
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
	
	getAllDepartTodo();
	
	$(".departTodo dl").each(function(){
		var teamTodo = $(this).html();
		var workerM = $(this).find(".memberName").attr("data-index");
		
		teamTodo += getTeamTodo(workerM);
		$(this).html(teamTodo);
	});
	
	getTodoCnt();
	
    $(".workAddPopup .workCategory").on('change', function(){
    	var option = $(this).val();
    	
    	if(option == 0){
    		getAllDepart();
    	}else{
	    	getProjectJoiner(option);    	
    	}
    });
	
    $(".workAddBtn").click(function(){
        $("input[name=progress]:first-child").prop('checked', true);
        $(".workAddPopup .workPopWorker option").eq(0).prop('selected', true);
    	
    	var depart = $(".todoNav li").eq(1).text();
    	var selectHtml = "<option value='0'>"+ depart +"</option>";
    	selectHtml += projectOption(loginMNUM);
    	
		$(".workCategory").html(selectHtml);
		getAllDepart();
        $(".workAddPopup").show();
        $(".darkBack").show();
    });
    
    $(".todoContList, .departTodo ul").sortable({
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
				
				$(".todoContList li, .departTodo ul li").each(function(){
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
});
