<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- font-family: 'Montserrat', sans-serif; -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,500i,600,600i,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean" rel="stylesheet">

    <!-- css -->
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/common.css">

    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="js/common.js"></script>

    <link rel="stylesheet" href="css/work.css">
    <script src="js/work.js"></script>

    <title>withWork</title>
</head>
<body>
	<header>
        <dl class="groupInfo headerInner">
            <dt>GOOGLE</dt>
            <dd>
                <img src="img/user.png" alt="">
                <span>최은서</span>님, 안녕하세요.
            </dd>
        </dl>
        <ul class="allInfo">
            <li class="active"><a href="todo.html" class="todoIcon">TO-DO</a></li>
            <li><a href="confirm.html" class="confirmIcon">CONFIRM</a></li>
            <li><a href="roadmap.html" class="roadMapIcon">ROADMAP</a></li>
        </ul>
        <dl class="headerInner">
            <dt>참여중인 프로젝트</dt>
            <dd class="projectSearch">
                <input type="text" placeholder="프로젝트명을 입력해주세요.">
                <input type="button" value="">
            </dd>
        </dl>
        <ul class="projectList">
            <li>
                <a href="#" class="projectTit">SAMSUNG 리뉴얼</a>
                <ul>
                    <li><a href="notice.html">TO-DO</a></li>
                    <li><a href="notice.html">NOTICE</a></li>
                </ul>
            </li>
            <li>
                <a href="#" class="projectTit">LG 유지보수</a>
                <ul>
                    <li><a href="notice.html">TO-DO</a></li>
                    <li><a href="notice.html">NOTICE</a></li>
                </ul>
            </li>
        </ul>
    </header>
    <section>
        <dl class="conTit department" style="border-bottom: 0;">
            <dt>
                TO-DO
                <a href="#" class="workAddBtn"><img src="img/todoAdd.png" alt="" width="35"></a>
            </dt>
            <dd>오늘의 할 일을 확인해보세요.</dd>
        </dl>
        <div class="todoTab">
            <ul class="todoNav">
                <li class="active"><a href="#">All</a></li>
                <li><a href="#">DESIGN TEAM</a></li>
                <li class="project"><a href="#">SAMSUNG 리뉴얼</a></li>
                <li class="project"><a href="#">LG 유지보수</a></li>
                <li><a href="#">그 외</a></li>
            </ul>
            <ul class="todoCont">
                <li class="active">
                    <ul class="todoContList listItem">
                        <li class="import">
                            <a href="#">
                                <span class="todoContTxt">11111111111111</span>
                                <span class="deadLine">(3일 남았습니다.)</span>
                            </a>
                        </li>
                        <li class="import">
                            <a href="#">
                                <span class="todoContTxt">222222222222222222222222222222222</span>
                                <span class="deadLine">(1일 남았습니다.)</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="todoContTxt">333333333333333</span>
                                <span class="deadLine">(7일 남았습니다.)</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="todoContTxt">4444444444444444</span>
                                <span class="deadLine">(3일 남았습니다.)</span>
                            </a>
                        </li>
                        <li class="import">
                            <a href="#">
                                <span class="todoContTxt">55555555555555</span>
                                <span class="deadLine">(1일 남았습니다.)</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="todoContTxt">666</span>
                                <span class="deadLine">(7일 남았습니다.)</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <ul class="todoContList listItem">
                        <li>
                            <a href="#">
                                <span class="todoContTxt">DESIGN TEAM 영역</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <ul class="todoContList listItem">
                        <li>
                            <a href="#">
                                <span class="todoContTxt">SAMSUNG 리뉴얼 영억</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <ul class="todoContList listItem">
                        <li>
                            <a href="#">
                                <span class="todoContTxt">LG 유지보수 영역</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <ul class="todoContList listItem">
                        <li>
                            <a href="#">
                                <span class="todoContTxt">그 외 영역</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <dl class="conTit department bigMG">
            <dt class="dtImg">
                DESIGN TEAM
                <a href="#" class="teamAddBtn"><img src="img/teamAdd.png" alt="" width="35"></a>
            </dt>
            <dd>팀원들의 업무를 확인해보세요.</dd>
        </dl>
        <div class="departTodo smallMG">
            <dl>
                <dt>
                    <span class="memberName">권은영 팀장</span>
                    <span class="todoType">
                        <span class="bullet">&bull;</span>
                        2
                        <span class="bullet">&bull;</span>
                        4
                    </span>
                </dt>
                <dd>
                    <ul class="listItem">
                        <li class="import"><a href="#">과제 컨펌</a></li>
                        <li class="import"><a href="#">넷플릭스 미팅</a></li>
                        <li><a href="#">가진동 내조</a></li>
                        <li><a href="#">CF역할놀이</a></li>
                        <li><a href="#">가진동 내조</a></li>
                        <li><a href="#">CF역할놀이</a></li>
                    </ul>
                </dd>
            </dl>
            <dl>
                <dt>
                    <span class="memberName">곽은진 과장</span>
                    <span class="todoType">
                        <span class="bullet">&bull;</span>
                        1
                        <span class="bullet">&bull;</span>
                        1
                    </span>
                </dt>
                <dd>
                    <ul class="listItem">
                        <li class="import"><a href="#">종이의집 시청</a></li>
                        <li><a href="#">찜닭 먹기</a></li>
                    </ul>                   
                </dd>
            </dl>
            <dl>
                <dt>
                    <span class="memberName">이민형 주임</span>
                    <span class="todoType">
                        <span class="bullet">&bull;</span>
                        3
                        <span class="bullet">&bull;</span>
                        1
                    </span>
                </dt>
                <dd>
                    <ul class="listItem">
                        <li class="import"><a href="#">포동이 놀아주기</a></li>
                        <li class="import"><a href="#">프리즌 브레이크 시청</a></li>
                        <li class="import"><a href="#">스크류바 사주기</a></li>
                        <li><a href="#">마스크 벗고 얘기하기</a></li>
                    </ul>                    
                </dd>
            </dl>
            <dl>
                <dt>
                    <span class="memberName">이충진 사원</span>
                    <span class="todoType">
                        <span class="bullet">&bull;</span>
                        0
                        <span class="bullet">&bull;</span>
                        1
                    </span>
                </dt>
                <dd>
                    <ul class="listItem">
                        <li><a href="#">DB 설계하기</a></li>
                    </ul>                    
                </dd>
            </dl>
        </div>        
    </section>
    <!-- popup include -->
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
                <!-- 전체보기 영역 -->
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
    <div class="popup workPopup">
        <dl>
            <dt>
                업무 상세보기
            </dt>
            <dd>
                <div class="table workDetail">
                    <table>
                        <colgroup>
                            <col width="15%">
                            <col width="30%">
                            <col width="15%">
                            <col width="30%">
                        </colgroup>
                        <tr>
                            <th>업무</th>
                            <td colspan="3">포동이 놀아주기</td>
                        </tr>
                        <tr>
                            <th>내용</th>
                            <td colspan="3">포동이를 놀이방으로 데려가세요.</td>
                        </tr>
                        <tr>
                            <th>지시자</th>
                            <td>권은영 팀장<br>(DESIGN TEAM)</td>
                            <th>업무자</th>
                            <td>이민형 주임<br>(DESIGN TEAM)</td>
                        </tr>
                        <tr>
                            <th>기한</th>
                            <td colspan="3">20200101 ~ 20200124</td>
                        </tr>
                        <tr>
                            <th>상태</th>
                            <td colspan="3">진행 중</td>
                        </tr>
                    </table>
                </div>               
                <div class="btnBox">
                    <a href="#" class="popupOK">확인</a>
                </div>
            </dd>
        </dl>
    </div>     
    <div class="popup workAddPopup">
        <dl>
            <dt>
                업무 추가
                <a href="#" class="popupOK">X</a>
            </dt>
            <dd>
                <div class="table workDetail">
                    <table>
                        <colgroup>
                            <col width="15%">
                            <col width="30%">
                            <col width="15%">
                            <col width="30%">
                        </colgroup>
                        <tr>
                            <th>업무</th>
                            <td colspan="3"><input type="text"></td>
                        </tr>
                        <tr>
                            <th>내용</th>
                            <td colspan="3"><input type="text"></td>
                        </tr>
                        <tr>
                            <th>지시자</th>
                            <td>
                                <select disabled>
                                    <option value="최은서(사원)">최은서(사원)</option>
                                </select>
                            </td>
                            <th>업무자</th>
                            <td>
                                <select>
                                    <option value="최은서(사원)">최은서(사원)</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th>기한</th>
                            <td colspan="3">
                                <input type="date">
                                &nbsp;~&nbsp;
                                <input type="date">
                            </td>
                        </tr>
                    </table>
                </div>               
                <div class="btnBox">
                    <a href="#" class="popupOK">확인</a>
                </div>
            </dd>
        </dl>
    </div>     
    <div class="darkBack"></div>
</body>
</html>