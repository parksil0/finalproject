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
    <form id="joinForm">
        <ul class="join_box">
            <li class="checkBox check01">
                <ul class="clearfix">
                    <li class="checkAllBtn">
                        <input type="checkbox" name="chkAll" id="chk" class="chkAll">
                    </li>
                    <li id="checkAllContent">
                        이용약관, 개인정보 수집 및 이용,
                        위치정보 이용약관(선택), 프로모션 정보 수신(선택)
                        에 모두 동의합니다.
                    </li>
                </ul>
            </li>
            <li class="checkBox check02">
                <ul class="clearfix">
                    <li class="checkBtn">
                        <input type="checkbox" name="chk" class="requiredBtn1">
                    </li>
                    <li>이용약관 동의<span>(필수)</span></li>
                </ul>
                <textarea>
                    여러분을 환영합니다.
                    네이버 서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 네이버 서비스의 이용과 관련하여 네이버 서비스를 제공하는 네이버 주식회사(이하 ‘네이버’)와 이를 이용하는 네이버 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 네이버 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.

                    네이버 서비스를 이용하시거나 네이버 서비스 회원으로 가입하실 경우 여러분은 본 약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기 바랍니다.

                    다양한 네이버 서비스를 즐겨보세요.
                </textarea>
            </li>
            <li class="checkBox check03">
                <ul class="clearfix">
                    <li class="checkBtn">
                        <input type="checkbox" name="chk" class="requiredBtn2">
                    </li>
                    <li>개인정보 수집 및 이용 동의<span>(필수)</span></li>
                </ul>
                <textarea>
                    여러분을 환영합니다.
                    네이버 서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 네이버 서비스의 이용과 관련하여 네이버 서비스를 제공하는 네이버 주식회사(이하 ‘네이버’)와 이를 이용하는 네이버 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 네이버 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.

                    네이버 서비스를 이용하시거나 네이버 서비스 회원으로 가입하실 경우 여러분은 본 약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기 바랍니다.

                    다양한 네이버 서비스를 즐겨보세요.
                </textarea>
            </li>
            <li class="checkBox check04">
                <ul class="clearfix">
                    <li class="checkBtn">
                        <input type="checkbox" name="chk">
                    </li>
                    <li>위치정보 이용약관 동의<span>(선택)</span></li>
                    
                </ul>
                <textarea>
                    여러분을 환영합니다.
                    네이버 서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 네이버 서비스의 이용과 관련하여 네이버 서비스를 제공하는 네이버 주식회사(이하 ‘네이버’)와 이를 이용하는 네이버 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 네이버 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.

                    네이버 서비스를 이용하시거나 네이버 서비스 회원으로 가입하실 경우 여러분은 본 약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기 바랍니다.

                    다양한 네이버 서비스를 즐겨보세요.
                </textarea>
            </li>
            <li class="checkBox check04">
                <ul class="clearfix">
                    <li class="checkBtn">
                        <input type="checkbox" name="chk">
                    </li>
                    <li>프로모션 정보 수신 동의<span>(선택)</span></li>
                    
                </ul>
                <textarea>
                    네이버에서 제공하는 이벤트/혜택 등 다양한 정보를 휴대전화(네이버앱 알림 또는 문자), 이메일로 받아보실 수 있습니다. 일부 서비스(별도 회원 체계로 운영하거나 네이버 가입 이후 추가 가입하여 이용하는 서비스 등)의 경우, 개별 서비스에 대해 별도 수신 동의를 받을 수 있으며, 이때에도 수신 동의에 대해 별도로 안내하고 동의를 받습니다.
                </textarea>
            </li>
        </ul>
        <ul class="footBtwrap clearfix">
            <li><button class="fpmgBt1"><a href="register.do">동의</a></button></li>
            <li><button class="fpmgBt2"><a href="main.do">비동의</a></button></li>
        </ul>
    </form>

</body>
</html>