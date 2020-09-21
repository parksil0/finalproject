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
    <script src="js/main.js"></script>
    
    <title>withWork</title>
     
</head>
<body>
	<%@ include file="include/nav.jsp" %>
	<form id="signup" action="register.do" method="post">
        <div class="signupForm">
            <input type="text" name="name" placeholder="그룹 이름">
            <input type="text" name="g_name" placeholder="성함">
        </div>
        <div>
            <button type="button" class="loginBtn">그 룹 생 성</button>
        </div>
    </form>
	
</body>
</html>