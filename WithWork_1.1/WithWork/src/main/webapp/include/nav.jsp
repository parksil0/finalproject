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
            				<li><a href="myPage.do">마이 페이지</a></li>
            			</ul>
            		</li>
            		<li class="logout"><button type="button" id="logout" onclick="
            			if(authstatus == 'google') {
	            			gauth.signOut().then(function(){
	                    		console.log('gauth.signOut()');
	                    	});
            			} else if(authstatus == 'kakao') {
            				Kakao.Auth.logout(function() {
           						console.log(Kakao.Auth.getAccessToken());
           					});
            			}
            			javascript:location.href='logout.do';
            		">로그아웃</button></li>
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
                <form class="navForm loginForm" action="login.do" method="post">
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
                <form class="otherLoginForm google" action="otherLogin.do" method="post">
	                <div class="navBtn">
	                    <button type="button" class="googleBtn" onclick="
	                    	gauth.signIn().then(function(){
	                    		console.log('gauth.signIn()');
	                    		init();
	                    	});
	                    ">Google 로그인</button>
	                </div>
                </form>
            <!-- 
            	카카오로그인은 사용하지 않음
            
                <form class="otherLoginForm kakao" action="otherLogin.do" method="post">
                	<div class="navBtn">
                		<button type="button" class="kakaoBtn" onclick="
	                    	loginWithKakao();
	                    ">Kakao 로그인</button>
                	</div>
                </form>
            -->
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
				<div class="displayNone findPwdPopup2">
					<form class="navForm findPwdForm2" action="updatePassword.do" method="post">
						<input type="password" name="password" id="chkPwd" placeholder="비밀번호">
						<input type="password" name="password2" id="chkPwd2" placeholder="비밀번호 확인">
						<input type="hidden" name="id" value="${resultId }" >
						<div class="navBtn">
							<button class="defaultBtn updatePwd">확 인</button>
						</div>
					</form>
				</div>
				<div class="displayNone findIdPopup">
					<form class="navForm findIdForm" action="findId.do" method="post">
						<input type="text" name="email" id="findEmail" placeholder="가입 당시 인증했던 이메일 주소">
						<input type="text" name="g_name" id="findName2" placeholder="이름">
						<div class="navBtn">
							<button class="defaultBtn chkId2">확 인</button>
						</div>
					</form>
				</div>
    		</dd>
    	</dl>
    </div>
    
    <div class="darkBack"></div>
    
    
    <!-- EL 로드가 안되어 따로 지정해놓음. -->
    <script>
    	var result = '<c:out value="${regResult}" />';
    	var id = '<c:out value="${sessionScope.id}" />';
    	var authstatus = '<c:out value="${sessionScope.authstatus}" />'
    </script>
