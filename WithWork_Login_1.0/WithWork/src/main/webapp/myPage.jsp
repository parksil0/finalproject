<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
    <script src="https://apis.google.com/js/platform.js?onload=init" async defer></script>
    <script src="js/nav.js"></script>
    
    <title>withWork</title>
    <style>
    	.mypageBorder {
    		border: 3px solid black;
    	}
    	
    	.mypageBorder input {
		    font-size: 20px;
		    line-height: 30px;
		    border: 1px solid #ddd;
    	}
    	
    	.mypageBorder h2 {
   		    font-size: 30px;
		    font-weight: bold;
    	}
    	
    	.mypageNone {
    		display: none;
    	}
    </style>
<body>
	<%@ include file="include/nav.jsp" %>
	<ul>
		<li><span id="1">회원정보 변경</span></li>
		<c:if test="${sessionScope.authstatus == withwork }">
			<li><span id="2">비밀번호 변경</span></li>
		</c:if>
		<li><span id="3">회원탈퇴</span></li>
	</ul>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<div class="mypageBorder mypageNone" id="11">
		<form id="updateName" method="post">
			<h2>회원정보 변경</h2>
			<p>성함</p>
			<input type="text" name="g_name" value='<c:out value="${sessionScope.g_name }" />'>
			<input type="hidden" name="id" value='<c:out value="${sessionScope.id}" />'>
			<input type="button" id="updateNameBtn" value="수정하기">
		</form>
	</div>
	
	<br>
	
	<div class="mypageBorder mypageNone" id="22">
		<form id="updatePwd" method="post">
			<h2>비밀번호 변경</h2>
			<p>기존 비밀번호</p>
			<input type="password" name="mypagePwd1">
			<p>변경 할 비밀번호</p>
			<input type="password" name="mypagePwd2">
			<p>변경 할 비밀번호 확인</p>
			<input type="password" name="mypagePwd3">
			<input type="hidden" name="id" value='<c:out value="${sessionScope.id}" />'>
			<input type="button" id="updatePwdBtn" value="수정하기">
		</form>
	</div>
	
	<br>
	
	<div class="mypageBorder mypageNone" id="33">
		<form id="withdrawal" method="post">
			<h2>회원탈퇴</h2>
			<p>한번 삭제된 계정은 더이상 복구가 불가능합니다.</p>
			<p>또한 삭제된 계정과 관련된 데이터도 삭제되므로 신중하게 선택하시길 부탁드립니다.</p>
			<br><br><br>
			<p>아래 입력창에 '회원탈퇴'를 입력해주세요</p>
			<input type="text" name="withdrawal" placeholder="회원탈퇴">
			<input type="hidden" name="id" value='<c:out value="${sessionScope.id}" />'>
			<input type="button" id="withdrawalBtn" value="회원탈퇴">
		</form>
	</div>
</body>
<script>
	
	$(document).ready(function(){
		
		$("#1").on("click", function(){
			$("#11").show();
			$("#22").hide();
			$("#33").hide();
		});
		$("#2").on("click", function(){
			$("#22").show();
			$("#11").hide();
			$("#33").hide();
		});
		$("#3").on("click", function(){
			$("#33").show();
			$("#11").hide();
			$("#22").hide();
		});
		
		$("#updateNameBtn").on("click", function(){
			name = $("input[name=updateName]").val();
			formObj = $("#updateName");
			formObj.attr("action", "updateName.do");
			alert("정보 변경 완료되었습니다.\n로그아웃 후 다시 로그인 하면 새로운 정보로 변경됩니다.");			
			formObj.submit();
		});
		
		$("#updatePwdBtn").on("click", function(){
			pwd1 = $("input[name=mypagePwd1]").val();
			pwd2 = $("input[name=mypagePwd2]").val();
			pwd3 = $("input[name=mypagePwd3]").val();
			
			$.ajax({
				url: "checkPwd.do",
				type: "post",
				data: "password=" + pwd1 + "&id=" + id,
				success: function(data) {
					
					console.log("비밀번호 유효값 : " + data);
					
					if(parseInt(data) == 1) {
						console.log("password check complete");
					} else {
						console.log("password check false");
						return;
					}
				},
				error: function(error) {
					alert("에러 : " + error);
				}
			});
			
			if(pwd2 === pwd3) {
				console.log('비밀번호 일치');
			} else {
				console.log('비밀번호 불일치');
				alert('변경 할 비밀번호가 일치하지 않습니다.\n다시입력해주세요.');
				$("input[name=mypagePwd2]").val('');
				$("input[name=mypagePwd3]").val('');
				return;
			}
			
			$.ajax({
				url: "updatePassword.do",
				type: "post",
				data: "id=" + id + "&password=" + pwd3,
				success: function(data) {
					
					if(parseInt(data) == 1) {
						console.log("암호 변경처리 여부 : " + data);
						alert("비밀번호가 변경되었습니다.");
						
					}
				},
				error: function(error) {
					alert(error);
				}
			});
			
			window.location.reload();
		});
		
		$("#withdrawalBtn").on("click", function(){
			
			formObj = $("#withdrawal");
			withdrawal = $("input[name=withdrawal]").val();
			console.log("withdrawal : " + withdrawal);
			
			if(withdrawal == 'withdrawal') {
				console.log("회원탈퇴 진행");
				formObj.attr("action", "withdrawal.do");
				formObj.submit();
			} else {
				alert("잘 못 입력하였습니다. 다시 입력해주세요.");
				$("input[name=withdrawal]").val('')
				return;
			}
			
			
		});
	});
</script>
</html>