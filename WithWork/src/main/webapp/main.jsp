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
    <script src="js/nav.js"></script>
    
    <!-- Google API -->
    <script>
    	
    	function checkLoginStatus() {
	    	var loginBtn = document.querySelector(".googleBtn");
	    	if(gauth.isSignedIn.get()) {
	    		console.log('logined');
	    		var profile = gauth.currentUser.get().getBasicProfile();
	    		googleLogin(profile)
	    		} else {
	    		console.log('not logined');
	    	}
    	}
    	function init() {
    		console.log("init");
    		gapi.load('auth2', function() {
    		    /* Ready. Make a call to gapi.auth2.init or some other API */
    		    console.log("auth2");
    		    window.gauth = gapi.auth2.init({
    		    	client_id: '940869694876-gflbqncmm64cb9h041j0a8ilepps113l.apps.googleusercontent.com'
    		    })
    		    gauth.then(function(){
    		    	console.log("googleAuth success.");
    		    	checkLoginStatus();
    	    		//googleLogin(profile);
    		    }, function(){
    		    	console.log("googleAuth fail.");
    		    });
    		});
    	}
    </script>
    <script>
    	function googleLogin(profile) {
    		
    		formObj = $("#otherLoginForm");
    		googleBtn = $(".googleBtn");
    		
    		id = profile.getId();
    		email = profile.getEmail();
    		name = profile.getName();
    		authStatus = 'google';
    		
    		console.log('id : ' + id + ', email : ' + email + ', name : ' + name);
    		
    		$.ajax({
				url: "/login.do",
				type: "post",
				data: "email=" + email+ "&g_name=" + name + "&id=" + id + "&authStatus=" + authStatus,
				success: function(data) {
					
					console.log("login ajax 전달받은 값 data : " + data);
					
					if(parseInt(data) == 1) {
						console.log("아이디 전달 받음");
						var id = profile.getId();
						console.log("전달받은 아이디 : " + id);
						googleBtn.attr("onclick", "");
						formObj.html("<input type='hidden' name='id' value='"+id+"'>");
						formObj.attr("action", "loginSuccess.do");
						formObj.submit();
					} else {
						
						/*
						console.log("로그인 실패");
						alert("로그인에 실패하였습니다.<br>아이디와 비밀번호를 다시 입력해주세요.");
						//$(".notiMsg").html("로그인에 실패하였습니다.<br>아이디와 비밀번호를 다시 입력해주세요.");
						//openPopup();
						$("#id").val('');
						$("#password").val('').focus();
						return;
						*/
					}
				},
				error: function(error) {
					alert("에러 : " + error);
				}
			});
   		}
    </script>
    <title>withWork</title>
     
</head>
<body>
<%@ include file="include/nav.jsp" %>
<script src="https://apis.google.com/js/platform.js?onload=init" async defer></script>
</body>

</html>