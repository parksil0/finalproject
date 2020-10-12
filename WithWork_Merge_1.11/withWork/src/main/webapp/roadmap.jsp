<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="include/head.jsp" %>
    
    <link rel="stylesheet" href="css/roadmap.css">
    <script src="js/roadmap.js"></script>

    <title>withWork</title>
  </head>
  
  <!-- 임시 css -->
  
  <style>
  
  .right33 {
  	text-align: right;
  }
  
  .workDetail input[type=text], .workDetail select{
  	width: 100%;
  	outline: none;
  }
  
  </style>
  <!-- 임시 스크립트 -->
  <script>
  
  	/* 
  		임시 로그인 
  		넘겨받은 값 변수처리
	*/
	var g_name = '<c:out value="${guest.g_name}" />';
	var id = '<c:out value="${guest.id}" />';
	var c_num = '<c:out value="${guest.c_num}" />';
	var auth = '<c:out value="${guest.authority}" />';
	console.log(' g_name: '+g_name+'\n id: '+id+'\n c_num: '+c_num+'\n auth: '+auth);

  </script>
<body>
	<%@ include file="include/header.jsp" %>
    <section>
        <dl class="conTit department">
            <dt>
            	ROADMAP
            	<c:if test="${auth eq '관리자'}">
            	<a href="#" id="insertProject"><img src="img/todoAdd.png" alt="" width="35"></a>
         	    </c:if>
            </dt>
            <dd>현재 회사에서 진행 또는 심사 중인 프로젝트를 확인해보세요.</dd>
            
            <!-- role = manager만 프로젝트 생성 버튼을 볼 수 있음.  -->
            <%-- <c:if test="${auth eq '관리자'}">
            	<dd class="right33"><button type="button" id="insertProject">버튼</button></dd>
            </c:if> --%>
            
        </dl>
        <div class="roadMapTab">
            <ul class="roadMapNav">
                <li class="active"><a href="#">전체일정</a></li>
                <li><a href="#">스케줄러</a></li>
            </ul>
            <div class="roadMapCont">
                <div class="progress" style="display: block;">
                   
                   	<!-- 
                   			프로젝트 찾기(search)
                   			담당자(관리자), 프로젝트이름으로 프로젝트를 찾을 수 있음.
                   	 -->
                   
                    <div class="roadMapSearch">
                    	<form id="searchForm">
	                        <select name="type">
	                            <option value="P">프로젝트 이름</option>
	                            <option value="M">담당자</option>
	                        </select>
	                        <input type="text" id="keyword"> 
                        	<button type="button" id="searchBtn">검색</button>
                        </form>
                    </div>
                    
                    <!-- 
                    		프로젝트 출력부분
                    		DB 데이터를 가져와서 출력하는 부분
                     -->
                    
                    <div class="roadMapState smallMG">
                        <dl class="stateForm prjB">
                            <dt class="waiting">시작 전</dt>
                           	<dd id="prjB"></dd>
                        </dl>
                        <dl class="stateForm prjO">
                            <dt class="starting">진행 중</dt>
                            <dd id="prjO"></dd>
                        </dl>
                        <dl class="stateForm prjF">
                            <dt class="stopping">완료</dt>
                            <dd id="prjF"></dd>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- ----------------------------------------------------- -->
    <footer>
      <ul class="quickBar">
          <li class="members">
              <a href="#"><img src="img/users.png" alt=""></a>
          </li>
          <li class="chatBtn">
              <a href="#"><img src="img/chat.png" alt=""></a>
          </li>
      </ul>
    </footer>
    <dl class="pop memberCont">
      <dt>
          그룹멤버
          <a href="#">X</a>
      </dt>
      <dd>
          <div class="memberTab">
              <ul class="tabs">
                  <li class="active"><a href="#">전체보기</a></li>
                  <li><a href="#">멤버초대</a></li>
                  <li><a href="#">멤버수정</a></li>
                  <li><a href="#">멤버삭제</a></li>
              </ul>
          </div>
          <!-- 검색 영역 -->
          <div class="projectSearch search">
              <input type="text" placeholder="이름, 아이디, 이메일 중 하나를 입력해주세요.">
              <input type="button" value="">
          </div>
          <div class="tab_content">
              <!--전체보기 영역 -->
              <div>
                  <ul class="memberTeam">
                      <li><a href="#">> 디자인팀</a></li>
                      <li class="memberList">
                          <ul>
                              <li><img src="img/usericon.png"  alt="">곽은진&nbsp&nbsp&nbsptest.com</li>
                          </ul>
                      </li>
                  </ul>  
                  <ul class="memberTeam">
                      <li><a href="#">> 마케팅팀</a></li>
                      <li class="memberList">
                          <ul class="memberName">
                              <li><img src="img/usericon.png"  alt="">최은서</li>
                          </ul>
                      </li>
                  </ul>  
                  <ul class="memberTeam">
                      <li><a href="#">> 기획팀</a></li>
                      <li class="memberList">
                          <ul>
                              <li><img src="img/usericon.png"  alt="">권은영</li>
                          </ul>
                      </li>
                  </ul>
              </div>
              <!-- 멤버검색 영역 -->
              <div>
                  <div class="table searchMember">
                      <table>
                          <colgroup>
                              <col width="10%">
                              <col width="40%"/>
                              <col width="17.5%"/>
                              <col width="17.5%"/>
                              <col width="15%"/>
                          </colgroup>
                          <tr>
                              <th><img src="img/usericon.png"  alt=""></th>
                              <td>
                                  <p>곽은진</p>
                                  <p class="emailTxt">test@test.com</p>
                              </td>
                              <td>
                                  <select class="sel">
                                      <option>그룹선택</option>
                                      <option>마케팅팀</option>
                                      <option>디자인팀</option>
                                      <option>기획팀</option>
                                      <option>재무관리팀</option>
                                  </select>
                              </td>
                              <td>
                                  <select class="sel">
                                      <option>권한선택</option>
                                      <option>관리자</option>
                                      <option>멤버</option>
                                  </select>
                              </td>
                              <td>초대<!-- <input type="checkbox"> --></td>
                          </tr>
                      </table>
                  </div>
              </div>
              <!-- 멤버수정 영역 -->
              <div>
                  <div class="table searchMember">
                      <table>
                          <colgroup>
                              <col width="10%">
                              <col width="40%"/>
                              <col width="17.5%"/>
                              <col width="17.5%"/>
                              <col width="15%"/>
                          </colgroup>
                          <tr>
                              <th><img src="img/usericon.png"  alt=""></th>
                              <td>
                                  <p>최은서</p>
                                  <p class="emailTxt">test@test.com</p>
                              </td>
                              <td>
                                  <select class="sel">
                                      <option>그룹선택</option>
                                      <option>마케팅팀</option>
                                      <option>디자인팀</option>
                                      <option>기획팀</option>
                                      <option>재무관리팀</option>
                                  </select>
                              </td>
                              <td>
                                  <select class="sel">
                                      <option>권한선택</option>
                                      <option>관리자</option>
                                      <option>멤버</option>
                                  </select>
                              </td>
                              <td>수정</td>
                          </tr>
                      </table>
                  </div>
              </div>
              <!-- 멤버삭제 영역 -->
              <div>
                  <div class="table searchMember">
                      <table>
                          <colgroup>
                              <col width="10%">
                              <col width="40%"/>
                              <col width="17.5%"/>
                              <col width="17.5%"/>
                              <col width="15%"/>
                          </colgroup>
                          <tr>
                              <th><img src="img/usericon.png"  alt=""></th>
                              <td>
                                  <p>권은영</p>
                                  <p class="emailTxt">test@test.com</p>
                              </td>
                              <td>마케팅팀</td>
                              <td>관리자</td>
                              <td>삭제</td>
                          </tr>
                      </table>
                  </div>
              </div>
          </div>
      </dd>
    </dl>
    <div class="popupM msgPopup">
      <dl>
          <dt>
              SAMSUNG 리뉴얼
              <a href="#" class="popupOK">X</a>
          </dt>
      </dl>
      <ul class="msgPopupC">
          <li><a href="#" class="chatMenu1">멤버</a></li>
          <li><a href="#" class="chatMenu2">대화방</a></li>
      </ul>
      <div class="projectSearch searchMemberChat">
          <input type="text" placeholder="&nbsp&nbsp멤버를 검색하세요.">
          <input type="button" value="">
      </div>
      <div class="msgPopupAll">
          <div class="msgPopupA">
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">권은영 팀장</dt>
                      <dd class="onlineId">카트 들어오세요</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">이충진 상무</dt>
                      <dd class="onlineId">이클립스 끊었습니다.</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">곽은진 과장</dt>
                      <dd class="onlineId">아 배고파 ㅠㅠㅠ</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">박실 대리</dt>
                      <dd class="onlineId">아니,, 그니까~~</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">이민형 사원</dt>
                      <dd class="onlineId">자리비움</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">원윤희 사원</dt>
                      <dd class="onlineId">다들 말 좀 걸어줘요~</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">유영준 인턴</dt>
                      <dd class="onlineId">소곤 소곤..</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">유영준 인턴</dt>
                      <dd class="onlineId">소곤 소곤..</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">유영준 인턴</dt>
                      <dd class="onlineId">소곤 소곤..</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">유영준 인턴</dt>
                      <dd class="onlineId">소곤 소곤..</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">유영준 인턴</dt>
                      <dd class="onlineId">소곤 소곤..</dd>
                  </dl>
              </a>
          </div>
          <div class="msgPopupB">
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">권은영 팀장, 최은서 부사장, 곽은진 과장</dt>
                      <dd class="onlineId">카트중...</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">이충진 상무, 박실 대리</dt>
                      <dd class="onlineId">의왕 단톡방입니다.</dd>
                  </dl>
              </a>
              <a href="#" class="profileImg">
                  <dl>
                      <dt class="memPopup">이민형 사원, 유영준 인턴</dt>
                      <dd class="onlineId">인턴 정신교육중..</dd>
                  </dl>
              </a>
          </div>            
      </div>
    </div>
    <div class="popupP chatProfile">
      <dl>
          <dt>
              프로필
              <a href="#" class="popupOK1">X</a>
          </dt>
          <dd>
              <ul>
                  <li>
                      <img src="img/profile.png" alt="" width="110px">
                  </li>
                  <li>권은영 팀장</li>
                  <li>카트 들어오세요</li>
              </ul>
              <div class="btnBox set2">
                  <a href="#">1:1 채팅</a>
                  <a href="#">채팅방 초대</a>
              </div>
          </dd>
      </dl>
    </div>
    
    <!-- 
    		프로젝트 생성 팝업창
     -->
    
    <div class="popup insertProject">
       	<dl>
       		<dt>프로젝트 생성</dt>
       		<dd>
       			<div class="table workDetail">
        			<table>
        				<tbody>
        					<tr>
        						<th>프로젝트 이름</th>
        						<td><input type="text" id="prjName"></td>
        					</tr>
        					<tr>
        						<th>프로젝트 주제</th>
        						<td><input type="text" id="prjSubject"></td>
        					</tr>
        					<tr>
        						<th>상태</th>
        						<td>
        							<input type="radio" name="prjChk_status" value="시작 전" checked="checked"> 시작 전 &nbsp;&nbsp;
        							<input type="radio" name="prjChk_status" value="진행 중"> 진행 중 &nbsp;&nbsp;
        							<input type="radio" name="prjChk_status" value="완료"> 완료
        						</td>
        					</tr>
        					<tr>
       							<th>관리자</th>
        						<td id="instSelect" class="mngList"></td>
        					</tr>
       						<tr>
       							<th>기한</th>
       							<td>
									<input type="date" id="prjStartDate">&nbsp;&nbsp;&nbsp;~&nbsp;&nbsp;&nbsp;					
									<input type="date" id="prjEndDate">       							
       							</td>
       						</tr>
       						<tr>
       							<th>내용</th>
       							<td>
       								<textarea id="prjContent" placeholder="내용을 입력하세요."></textarea>
       							</td>
       						</tr>
        				</tbody>
        			</table>
       			</div>
       			<div class="btnBox">
       				<button type="button" id="insertProjectBtn" class="popupOk">확인</button>
       			</div>
       		</dd>
   		</dl>
    </div>
    
    <!-- 
    		프로젝트 상세창
    		직원은 확인만 할 수 있고,
    		관리자는 수정이 가능하다.
     -->
    
    <div class="popup prjInfo">
    	<dl>
    		<dt>프로젝트 상세</dt>
    		<dd>
    			<div class="table workDetail">
	    			<table>
	    				<tbody id="getPrj"></tbody>
	    			</table>
    			</div>
    			<div class="btnBox updatePrjBtn"></div>
    		</dd>
    	</dl>
    </div>
    <div class="darkBack"></div>
  </body>
</html>

  
  
