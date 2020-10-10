<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="include/mainHead.jsp" %>
</head>
<body>

    <div id="joinFormHeader">
        <h1><a href="main.do">WITHWORK</a></h1>
    </div>
    <form id="signup" action="register.do" method="post">
        <div class="signupForm">
            <input type="email" id="id" name="id" placeholder="아이디로 사용 할 이메일">
            <div class="test"></div>
            <input type="password" name="password" id="pwd1" placeholder="비밀번호">
            <input type="password" name="pwdConfirm" id="pwd2" placeholder="비밀번호 확인">
            <input type="text" name="g_name" placeholder="성함">
            <input type="email" name="email" placeholder="인증받을 이메일" >
        </div>
        <div>
            <button type="button" class="signupBtn">회 원 가 입</button>
        </div>
    </form>
</body>

</html>