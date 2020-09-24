
	$(document).ready(function(){
	
	    /* 네비게이션 바 우측 상단 로그인 클릭 시 팝업 창 열림 처리 */
	    $(".login").on("click", function(){
	        $(".loginPopup").show();
	        $(".darkBack").show();
	    });
	
	    /* 네비게이션 바 우측 상단 로그인 클릭 시 팝업 창 닫힘 처리 */
	    $(".darkBack").on("click", function(){
	        $(".popup").hide();
	        $(".darkBack").hide();
	    });
	});
	
	// 팝업창이 열리는 함수
	function openPopup() {
		$(".mainPopup").show();
		$(".darkBack").show();
	}
	
	
	$(document).ready(function(){
		
		var id = '';
		
		//로그인 창에서 popup 설정
		$(".darkBack").on("click", function(){
			$(".popup").hide();
			$(".darkBack").hide();
			$(".displayNone").hide();
		});
		
		//로그인 창 위에 알림 창 popup 설정
		
		$(".btnBox").on("click", function(){
			$(".mainPopup").hide();
			
			if($('.loginPopup').css('display') === 'none') {
			    $(".darkBack").hide();
			}
	
		});
		
		// controller에서 보낸 result 메세지를 변수에 저장
		//var result = '<c:out value="${regResult}" />';
		
		checkPopup(result);
		console.log("result : " + result);
		function checkPopup(result) {
			if(result == '') {
				return;
			}
			
			if(parseInt(result) == 1) {
				alert("회원가입이 정상적으로 완료되었습니다.");
				// $(".notiMsg").html("회원가입이 정상적으로 완료되었습니다.");
				// openPopup();
			} else if(parseInt(result) == 2) {
				alert("가입 시 입력한 이메일로 인증메일을 보냈습니다.<br>인증버튼을 누르면 회원가입이 완료됩니다.");
				// $(".notiMsg").html("가입 시 입력한 이메일로 인증메일을 보냈습니다.<br>인증버튼을 누르면 회원가입이 완료됩니다.");
				//openPopup();
			}
			
			
			
		}
		
		//로그인 ajax
		
		$(".loginBtn").on("click", function(e){
			
			e.preventDefault();
			
			formObj = $(".loginForm");
			
			id = $("#id").val();
			var password = $("#password").val();
			
			$.ajax({
				url: "/login.do",
				type: "post",
				data: "id=" + id + "&password=" + password,
				success: function(data) {
					
					console.log("login ajax 전달받은 값 data : " + data);
					
					if(parseInt(data) == 1) {
						console.log("아이디 전달 받음");
						var id = '<c:out value="${sessionScope.id}" />';
						console.log("전달받은 아이디 : " + id);
						formObj.attr("action", "loginSuccess.do");
						formObj.submit();
					} else {
						console.log("로그인 실패");
						alert("로그인에 실패하였습니다.<br>아이디와 비밀번호를 다시 입력해주세요.");
						//$(".notiMsg").html("로그인에 실패하였습니다.<br>아이디와 비밀번호를 다시 입력해주세요.");
						//openPopup();
						$("#id").val('');
						$("#password").val('').focus();
						return;
					}
				},
				error: function(error) {
					alert("에러 : " + error);
				}
			});
		})
		
		
		//아이디 찾기 클릭시 팝업창 
		$(".findId").on("click", function(e){
			$(".loginPopup").hide();
			$(".findIdPwd").show();
			$(".findIdPopup").show();
		});
		
		//암호 찾기 클릭시 팝업창
		$(".findPwd").on("click", function(){
			$(".loginPopup").hide();
			$(".findIdPwd").show();
			$(".findPwdPopup").show();
		});
		
		//비밀번호 찾기(아이디체크) ajax
		
		$(".chkId").on("click", function(e){

			e.preventDefault();
			var str = '';
			
			id = $("#findId").val();
			var g_name = $("#findName").val();
			
			$.ajax({
				url: "findPassword.do",
				type: "post",
				data: "id=" + id + "&g_name=" + g_name,
				success: function(data) {
					console.log("전달받은 값 : " + data);
					if(parseInt(data) == 1) {
						$(".findPwdPopup").hide();
						$(".findPwdPopup2").show();
					} else {
						alert("입력한 정보가 일치하지 않습니다.");
						//$(".notiMsg").html("입력한 정보가 일치하지 않습니다.");
						$("#findId").val('');
						$("#findName").val('');
						//openPopup();
					}
				},
				error: function(error) {
					alert(error);
				}
			})
		});
		
		$(".updatePwd").on("click", function(e){
			
			e.preventDefault();
			
			pwd1 = $("#chkPwd").val();
			pwd2 = $("#chkPwd2").val();
			console.log("pwd1 : " + pwd1 + "pwd2 : " + pwd2);
			if(pwd1 === pwd2) {
				alert("맞아");
			} else {
				alert("틀려;");
				alert("비밀번호가 일치하지 않습니다.<br>다시 입력해 주세요.");
				//$(".notiMsg").html("비밀번호가 일치하지 않습니다.<br>다시 입력해 주세요.");
				pwd1.val('');
				pwd2.val('');
				//openPopup();
				return;
			}
			console.log("비밀번호 변경 id : " + id);
			
			$.ajax({
				url: "updatePassword.do",
				type: "post",
				data: "id=" + id + "&password=" + pwd1,
				success: function(data) {
					
					if(parseInt(data) == 1) {
						console.log("암호 변경처리 됐?? : " + data);
						alert("비밀번호가 변경되었습니다.");
						//$(".notiMsg").html("비밀번호가 변경되었습니다.");
						//$(".okBtn").html("<a href='main.do'>확인</a>");
						//openPopup();
					}
				},
				error: function(error) {
					alert(error);
				}
			});
		});
		
		$(".chkId2").on("click", function(e){
			
			e.preventDefault();
			findEmail = $("#findEmail").val();
			findName2 = $("#findName2").val();
			console.log("email : " + findEmail + ", name : " + findName2);
			
			$.ajax({
				url: "findId.do",
				type: "post",
				data: "g_name=" + findName2 + "&email=" + findEmail,
				success: function(data) {
					console.log("FindId id : " + data);
					alert("찾으시는 아이디는 " + data + " 입니다.");
					//$(".notiMsg").html("찾으시는 아이디는 " + data + " 입니다.");
					//$(".okBtn").html("<a href='main.do'>확인</a>");
					//openPopup();
				},
				error: function(error) {
					alert(error);
				}
			});
		});
		
		$(".googleBtn").on("click", function(){
			
		
		});
	});