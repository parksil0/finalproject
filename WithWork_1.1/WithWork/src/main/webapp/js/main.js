
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
	        if(!$(".requiredBtn1").prop("checked")) {
	            alert("이용약관과 개인정보 수집 및 이용에 대한 안내 모두 동의해주세요.");
	            return false;
	        }
	        if(!$(".requiredBtn2").prop("checked")) {
	            alert("이용약관과 개인정보 수집 및 이용에 대한 안내 모두 동의해주세요.");
	            return false;
	        }
	    });
	});

	
	/* signup.jsp */
	
	
	var chkMessage = "";
	setInterval(function(){checkId()}, 500);

	/* 이메일이 잘못되었는지 확인하는 함수 */
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
		/* 올바른 형식의 아이디를 받기위한 로직 설정 */
		if(id != '') {
			
			/* 입력한 아이디의 값이 중복된 값인지 확인하기 위한 기능 */
			$.ajax({
				url: "/checkId.do?id="+id,
				type: "get",
				data: id,
				success: function(data){
					if(!CheckEmail(id)) {
						chkMessage = "이메일 형식으로 입력해주세요.";
						$(".test").css("color","red");
						return;
					};
					if(data == 0) {
						chkMessage = "생성 가능한 아이디입니다.";
						$(".test").css("color","green");
					} else {
						chkMessage = "이미 존재하는 아이디입니다.";
						$(".test").css("color","red");
					}
				},
				error: function(error) {
					alert(error);
				}
			});
			
			
		}
		
		$(".test").html(chkMessage);
	}
	
	$(document).ready(function(){
		
		formObj = $("#signup");
		
		/* 마지막으로 회원가입 이전에 형식에 맞는 올바른 값인지에 대한 여부 확인 */
		$(".signupBtn").on("click", function(){
		
			if(id == "") {
				alert("아이디를 입력해주세요.");
				return;
			}
			
			if(chkMessage == "생성 가능한 아이디입니다.") {
				
			} else if (chkMessage == "이미 존재하는 아이디입니다.") {
				alert("이미 존재하는 아이디입니다.\n다시 아이디를 입력하고 이메일 확인 버튼을 눌러주세요.");
				return;
			} else {
				alert("이메일 형식에 맞춰서 작성해주세요.");
				return;
			}
			
			var pwd1 = $("#pwd1").val();
			var pwd2 = $("#pwd2").val();
			
			console.log("pwd1 : " + pwd1 + ", pwd2 : " + pwd2);
			
			if(pwd1 == "" || pwd2 == "") {
				alert("비밀번호를 입력해주세요.");
				return;
			}
			
			if(pwd1 === pwd2) {
				
			} else {
				alert("비밀번호가 일치하지 않습니다.");
				return;
			}
			
			var name = $("input[name=g_name]").val();
			if(name == "") {
				alert("성함을 입력해주세요.");
				return;
			}
			
			var email = $("input[name=email]").val();
			
			if(email == "") {
				alert("이메일을 입력해주세요.");
				return;
			}
			
			if(!CheckEmail(email)) {
				alert("이메일 형식으로 입력해주세요.");
				return;
			};
			
			formObj.submit();
			
		});
		
	});
	
	/* myPage.jsp */
	
	$(document).ready(function(){
		
		/* 클릭한 부분만 block 처리 */
		
		$("#menu1").on("click", function(){
			$("#mypageUpdateName").show();
			$("#mypageUpdatePwd").hide();
			$("#mypageWithdrawal").hide();
		});
		$("#menu2").on("click", function(){
			$("#mypageUpdatePwd").show();
			$("#mypageUpdateName").hide();
			$("#mypageWithdrawal").hide();
		});
		$("#menu3").on("click", function(){
			$("#mypageWithdrawal").show();
			$("#mypageUpdateName").hide();
			$("#mypageUpdatePwd").hide();
		});
		
		/* 
			회원정보 수정 - 이름 
			딱히 ajax의 필요성을 못느껴 사용하지 않았음.
		*/
		
		$("#updateNameBtn").on("click", function(){
			name = $("input[name=updateName]").val();
			formObj = $("#updateName");
			formObj.attr("action", "updateName.do");
			alert("정보 변경 완료되었습니다.\n로그아웃 후 다시 로그인 하면 새로운 정보로 변경됩니다.");			
			formObj.submit();
		});
		
		/*
			비밀번호 변경부분.
			1차로 비밀번호를 확인하고
			2차로 비밀번호 변경을 처리한다.
		*/
		
		$("#updatePwdBtn").on("click", function(){
			pwd1 = $("input[name=mypagePwd1]").val();
			pwd2 = $("input[name=mypagePwd2]").val();
			pwd3 = $("input[name=mypagePwd3]").val();
			
			
			/* 비밀번호 체크. 기존 비밀번호가 실제 db의 비밀번호와 같은지 확인 */
			$.ajax({
				url: "checkPwd.do",
				type: "post",
				data: "password=" + pwd1 + "&id=" + id,
				success: function(data) {
					
					console.log("비밀번호 유효값 : " + data);
					if(parseInt(data) == 1) {
						
						/* 변경 할 비밀번호와 비밀번호 확인 input이 동일한지 확인 */
						if(pwd2 === pwd3) {
							/* 마지막으로 비밀번호 변경처리 */
							updatePassword(pwd3);
						} else {
							alert('변경 할 비밀번호가 일치하지 않습니다.\n다시입력해주세요.');
							$("input[name=mypagePwd2]").val('');
							$("input[name=mypagePwd3]").val('');
							return;
						}
						
					} else {
						alert("비밀번호가 틀립니다.");
						return;
					}
				},
				error: function(error) {
					alert("에러 : " + error);
				}
			});
		});
		
		function updatePassword(pwd3) {
			$.ajax({
				url: "updatePassword.do",
				type: "post",
				data: "id=" + id + "&password=" + pwd3,
				success: function(data) {
					
					if(parseInt(data) == 1) {
						alert("비밀번호가 변경되었습니다.");
						
					}
				},
				error: function(error) {
					alert(error);
				}
			});
			
			window.location.reload();
		}
		
		/*
			회원탈퇴
			회원 db의 authstatus를 withdrawal로 update.
		*/
		
		$("#withdrawalBtn").on("click", function(){
			
			formObj = $("#withdrawal");
			withdrawal = $("input[name=withdrawal]").val();
			console.log("withdrawal : " + withdrawal);
			
			/* input창의 입력값이 같은지 확인하고 회원탈퇴 진행 */
			if(withdrawal == '회원탈퇴') {
				alert("회원탈퇴 완료되었습니다.");
				formObj.submit();
			} else {
				alert("잘 못 입력하였습니다. 다시 입력해주세요.");
				$("input[name=withdrawal]").val('')
				return;
			}
		});
	});