
	/* joinForm.jsp */

	$(document).ready(function(){
	
	    /* 체크박스 모두선택 처리 */
	    $(".chkAll").on("click", function(){
	        if($(".chkAll").prop("checked")){
	            $("input[name=chk]").prop("checked", true);
	        } else {
	            $("input[name=chk]").prop("checked",false);
	        }
	    });
	
	    /* 필수항목 동의 하지 않고 확인 버튼클릭시 알람창 설정 */
	    $(".fpmgBt1 a").on("click", function(){
	        if(!$(".requiredBtn").prop("checked")) {
	            alert("이용약관과 개인정보 수집 및 이용에 대한 안내 모두 동의해주세요.");
	            return false;
	        }
	    });
	});

	
	/* signup.jsp */
	

	var chkMessage = "";
	
	function openPopup() {
		$(".signupWarn").show();
		$(".darkBack").show();
	}
	
	$(document).ready(function(){
		$(".darkBack, .loginBtn").on("click", function(){
			$(".popup").hide();
			$(".darkBack").hide();
		});
	});

	// 이메일이 잘못되었는지 확인하는 함수 
	function CheckEmail(str) {                                                 
		var reg_email = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
		if(!reg_email.test(str)) {
			return false;         
		} else {                       
			return true;         
		}                            
	}   
	
	function checkId() {

		var id = $("#id").val();
		
		
		if(id == "") {
			$(".signupMessage").html("아이디를 입력해주세요.");
			openPopup();
			return;
		}
		
		if(!CheckEmail(id)) {
			$(".signupMessage").html("이메일 형식으로 입력해주세요.");
			openPopup();
			return;
		};
		
		$.ajax({
			url: "/checkId.do?id="+id,
			type: "get",
			data: id,
			success: function(data){
				if(data == 0) {
					text = "생성 가능한 아이디입니다.";
				} else {
					text = "이미 존재하는 아이디입니다.";
				}
				
				$(".signupMessage").html(text);
				chkMessage = $(".signupMessage").html();
				openPopup();
			},
			error: function(error) {
				alert(error);
			}
		});
	}
	
	$(document).ready(function(){
		
		formObj = $("#signup");
		
		$(".signupBtn").on("click", function(){
			
			if(chkMessage == "생성 가능한 아이디입니다.") {
				
			} else if (chkMessage == "이미 존재하는 아이디입니다.") {
				$(".signupMessage").html("이미 존재하는 아이디입니다.<br>다시 아이디를 입력하고 이메일 확인 버튼을 눌러주세요.");
				openPopup();
				return;
			} else {
				$(".signupMessage").html("이메일 확인버튼을 눌러주세요.");
				openPopup();
				return;
			}
			
			var pwd1 = $("#pwd1").val();
			var pwd2 = $("#pwd2").val();
			
			console.log("pwd1 : " + pwd1 + ", pwd2 : " + pwd2);
			
			if(pwd1 == "" || pwd2 == "") {
				$(".signupMessage").html("비밀번호를 입력해주세요.");
				openPopup();
				return;
			}
			
			if(pwd1 === pwd2) {
				
			} else {
				$(".signupMessage").html("비밀번호가 일치하지 않습니다.");
				openPopup();
				return;
			}
			
			var name = $("input[name=g_name]").val();
			if(name == "") {
				$(".signupMessage").html("성함을 입력해주세요.");
				openPopup();
				return;
			}
			
			var email = $("input[name=email]").val();
			
			if(email == "") {
				$(".signupMessage").html("이메일을 입력해주세요.");
				openPopup();
				return;
			}
			
			if(!CheckEmail(email)) {
				$(".signupMessage").html("이메일 형식으로 입력해주세요.");
				openPopup();
				return;
			};
			
			formObj.submit();
			
		});
		
	});