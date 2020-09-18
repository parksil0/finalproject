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
	<!--상단 네비게이션-->
    <div id="mainNav">
        <ul class="leftNav">
            <li class="homePage"><a href="main.do">WITHWORK</a></li>
            <li class="login">로그인</li>
            <li class="facebookLink"><a href="#"><img src="img/facebookicon.jpg"></a></li>
            <li class="twitterLink"><a href="#"><img src="img/twittericon.jpg"></a></li>
            <li class="instagramLink"><a href="#"><img src="img/instagramicon.jpg"></a></li>
        </ul>
    </div>
    <!--로그인 창-->
    <div class="popup loginPopup">
        <dl>
            <dt>LOGIN</dt>
            <dd>
                <form class="loginForm">
                    <input type="email" name="id" placeholder="이메일">
                    <input type="password" name="pwd" placeholder="비밀번호">
                    <button class="loginBtn">로 그 인</button>
                    <div class="findIdPwd">
                        <a href="#">이메일 찾기 </a>ㅣ
                        <a href="#">비밀번호 찾기 </a>ㅣ
                        <a href="join.jsp">회원가입</a>
                    </div>
                    <br><br><br>
                    <div class="otherLoginBtn">
                        <button class="otherLogin1">Google 로그인</button>
                        <button class="otherLogin2">Kakao 로그인</button>
                    </div>
                </form>
            </dd>
        </dl>
    </div>
    <div class="darkBack"></div>
</body>
</html>