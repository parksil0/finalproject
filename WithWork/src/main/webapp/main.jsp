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
    <link rel="stylesheet" href="css/main1.css">
    
    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="js/main.js"></script>
    
     <title>withWork</title>
     
</head>
<style>

.subMenu {
	display: none;
	float: none;
}

.client:hover .subMenu {
	display: block;
}

</style>
<body>
	<!--상단 네비게이션-->
    <div id="mainNav">
        <ul class="leftNav">
            <li class="homePage"><a href="main.do">WITHWORK</a></li>
            <c:choose>
            	<c:when test="${empty sessionScope.id}">
	           		<li class="login">로그인</li>
            	</c:when>
            	<c:otherwise>
            		<li class="client">
            			${sessionScope.id } 님
            			<ul class="subMenu">
            				<li><a>그룹 생성</a></li>
            				<li><a>나의 그룹</a></li>
            			</ul>
            		</li>
            		<li class="logout"><a href="logout.do">로그아웃</a></li>
            	</c:otherwise>
            </c:choose>
            <li class="snsLink"><a href="#"><img src="img/facebookicon.jpg"></a></li>
            <li class="snsLink"><a href="#"><img src="img/twittericon.jpg"></a></li>
            <li class="snsLink"><a href="#"><img src="img/instagramicon.jpg"></a></li>
        </ul>
    </div>
    <!--로그인 창-->
    <div class="popup loginPopup">
        <dl>
            <dt>LOGIN</dt>
            <dd>
                <form class="loginForm" action="main.do" method="get">
                    <input type="email" name="id" placeholder="이메일">
                    <input type="password" name="password" placeholder="비밀번호">
                    <button type="submit" class="loginBtn">로 그 인</button>
                    <div class="findIdPwd">
                        <a href="#">이메일 찾기 </a>ㅣ
                        <a href="#">비밀번호 찾기 </a>ㅣ
                        <a href="join.do">회원가입</a>
                    </div>
                    <br><br><br>
                </form>
                <div class="otherLoginBtn">
                    <button class="otherLogin1">Google 로그인</button>
                    <button class="otherLogin2">Kakao 로그인</button>
                </div>
            </dd>
        </dl>
    </div>
    <div class="popup mainPopup">
    	<dl>
    		<dt>WithWork</dt>
    		<dd>
    			<div class="notiMsg"></div>
    		</dd>
    		<dd>
    			<button class="popup btnBox">
    				<a>확인</a>
    			</button>
    		</dd>
    	</dl>
    </div>
    <div class="darkBack"></div>
</body>
<script>

	function openPopup() {
		$(".mainPopup").show();
		$(".darkBack").show();
	}
	
	
	$(document).ready(function(){
		$(".darkBack, .btnBox a").on("click", function(){
			$(".popup").hide();
			$(".darkBack").hide();
		});
		
		// controller에서 보낸 result 메세지를 변수에 저장
		var result = '<c:out value="${regResult}" />';
		
		checkPopup(result);
		
		function checkPopup(result) {
			if(result == '') {
				return;
			}
			
			if(parseInt(result) == 1) {
				$(".notiMsg").html("회원가입이 정상적으로 완료되었습니다.");
			} else if(parseInt(result) == 2) {
				$(".notiMsg").html("가입 시 입력한 이메일로 인증메일을 보냈습니다.<br>인증버튼을 누르면 회원가입이 완료됩니다.");
			}
			
			openPopup();
		}
		
		//로그인 ajax
		
		$(".loginBtn").on("click", function(e){
			
			e.preventDefault();
			
			formObj = $(".loginForm");
			
			var id = $("input[name=id]").val();
			var password = $("input[name=password]").val();
			
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
						formObj.submit();
					} else {
						console.log("로그인 실패");
						$(".notiMsg").html("로그인에 실패하였습니다.<br>아이디와 비밀번호를 다시 입력해주세요.");
						openPopup();
						$("input[name=password]").val('');
						$("input[name=id]").val('').focus();
						return;
					}
				},
				error: function(error) {
					alert("에러 : " + error);
				}
			});
			
		})
	});
</script>
</html>