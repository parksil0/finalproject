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
    <script src="js/join-signup.js"></script>

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

</html>