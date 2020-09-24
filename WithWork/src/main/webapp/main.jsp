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
	    		loginBtn.value = 'Logout';
	    		var profile = gauth.currentUser.get().getBasicProfile();
	    		console.log(profile);
	    		} else {
	    		console.log('not logined');
	    		loginBtn.value = 'Login';
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
    		    }, function(){
    		    	console.log("googleAuth fail.");
    		    });
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