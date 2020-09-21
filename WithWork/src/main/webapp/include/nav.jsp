<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            			${sessionScope.g_name } 님
            			<ul class="subMenu">
            				<li><a href="insertGroup.do">그룹 생성</a></li>
            				<li><a href="todo.jsp">나의 그룹</a></li>
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
                <form class="navForm loginForm" action="main.do" method="post">
                    <input type="email" name="id" id="id" placeholder="이메일">
                    <input type="password" name="password" id="password" placeholder="비밀번호">
                    <div class="navBtn">
                    	<button type="submit" class="defaultBtn loginBtn">로 그 인</button>
                    </div>
                    <div id="findIdPwd">
                        <a class="findId">이메일 찾기 </a>ㅣ
                        <a class="findPwd">비밀번호 찾기 </a>ㅣ
                        <a href="join.do">회원가입</a>
                    </div>
                    <br><br><br>
                </form>
                <div class="navBtn">
                    <button class="googleBtn">Google 로그인</button>
                    <button class="kakaoBtn">Kakao 로그인</button>
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
    			<button class="btnBox okBtn">
    				<a>확인</a>
    			</button>
    		</dd>
    	</dl>
    </div>
    
    <div class="popup findIdPwd">
    	<dl>
    		<dt>WithWork</dt>
    		<dd>
    			<div class="displayNone findPwdPopup">
					<form class="navForm findPwdForm" action="findPassword.do" method="post">
						<input type="text" name="id" id="findId" placeholder="아이디">
						<input type="text" name="g_name" id="findName" placeholder="이름">
						<div class="navBtn">
							<button class="defaultBtn chkId">확 인</button>
						</div>
					</form>
				</div>
				<div class="displayNone findIdPopup">
					<form class="navForm findIdForm" action="findId.do" method="post">
						<input type="text" name="email" id="findEmail" placeholder="가입 당시 인증했던 이메일 주소">
						<input type="text" name="g_name" id="findName2" placeholder="이름">
						<div class="navBtn">
							<button class="defaultBtn">확 인</button>
						</div>
					</form>
				</div>
    		</dd>
    	</dl>
    </div>
    
    <div class="darkBack"></div>
    
    
<!-- js -->
<script>
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
						$(".notiMsg").html("로그인에 실패하였습니다.<br>아이디와 비밀번호를 다시 입력해주세요.");
						openPopup();
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
						str += '<form class="navForm findPwdForm" action="updatePassword.do" method="post">';
						str += '<input type="password" name="password" id="chkPwd" placeholder="비밀번호">';
						str += '<input type="password" name="password2" id="chkPwd2" placeholder="비밀번호 확인">';
						str += '<input type="hidden" name="id" value="${resultId}" >';
						str += '<div class="navBtn"><button class="defaultBtn updatePwd">확 인</button></div></form>';
						$(".findPwdPopup").html(str);
					} else {
						$(".notiMsg").html("입력한 정보가 일치하지 않습니다.");
						$("#findId").val('');
						$("#findName").val('');
						openPopup();
					}
				},
				error: function(error) {
					alert(error);
				}
			})
		});
		
		$(".updatePwd").on("click", function(e){
			
			e.preventDefault();
			
			pwd1 = $(".chkPwd").val();
			pwd2 = $(".chkPwd2").val();
			alert("id : " + id);
			
			if(pwd1 == pwd2) {
			} else {
				$(".notiMsg").html("비밀번호가 일치하지 않습니다.<br>다시 입력해 주세요.");
				pwd1.val('');
				pwd2.val('');
				openPopup();
				return;
			}
			console.log("비밀번호 변경 id : " + id);
			$.ajax({
				url: "updatePassword.do",
				type: "post",
				success: function(data) {
					
					if(parseInt(data) == 1) {
						$(".notiMsg").html("비밀번호가 변경되었습니다.");
						$(".okBtn").html("<a href='main.do'>확인</a>");
						openPopup();
					}
				},
				error: function(error) {
					alert(error);
				}
			});
		});
		
	});
</script>