<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

    <!-- font-family: 'Montserrat', sans-serif; -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,500i,600,600i,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean" rel="stylesheet">

    <!-- css -->
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/main.css">

    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="js/main.js"></script>

    <title>withWork</title>
    
</head>
<body>

    <div id="joinFormHeader">
        <h1>WITHWORK</h1>
    </div>
    <form id="signup" action="register.do" method="post">
        <div class="signupForm">
            <input type="email" id="id" name="id" placeholder="이메일">
            <button type="button" class="checkId" onclick="checkId()">이메일 확인</button>        
            <input type="password" name="password" id="pwd1" placeholder="비밀번호">
            <input type="password" name="pwdConfirm" id="pwd2" placeholder="비밀번호 확인">
            <input type="text" name="g_name" placeholder="성함">
            <input type="email" name="email" placeholder="인증받을 이메일" >
        </div>
        <div class="dateOfBirth">           
            <label>Date of birth : </label><br>
            <input type="number" name="year" placeholder="년도">
            <input type="number" name="month" placeholder="월">
            <input type="number" name="day" class="day" placeholder="일">
        </div>
        <div>
            <button type="button" class="signupBtn">회 원 가 입</button>
        </div>
    </form>
    <div class="popup signupWarn">
    	<dl>
    		<dt>WithWork</dt>
    		<dd>
    			<div class="signupMessage"></div>
    		</dd>
    		<dd>
    			<button class="loginBtn">확인</button>
    		</dd>
    	</dl>
    </div>
    <div class="darkBack"></div>
</body>
<script>
	
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
</script>
</html>