<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="include/mainHead.jsp" %>
    
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
    <script src="https://apis.google.com/js/platform.js?onload=init" async defer></script>
    <script src="js/nav.js"></script>
</head>
<body>
	<%@ include file="include/nav.jsp" %>
	<form id="signup" action="insertGroup.do" method="post">
		<div class="mainInner">
			<div class="innerTit">
				<dl>
					<dt>협업을 위한 그룹을 생성해보세요.</dt>
					<dd>withWork의 회원이라면 누구든 그룹을 생성할 수 있습니다.</dd>
				</dl>
			</div>
	        <table class="mainTableForm">
	        	<colgroup>
	        		<col width="20%"/>
	        		<col width="70%"/>
	        	</colgroup>
	        	<tr>
	        		<th>그룹 이름</th>
	        		<td>
			            <input type="text" name="name" placeholder="그룹이름을 입력하세요.">        		
	        		</td>
	        	</tr>
	        	<tr>
	        		<th>그룹 테마</th>
	        		<td>
			            <input type="text" name="subject" placeholder="그룹주제를 입력하세요.">        		      		
	        		</td>
	        	</tr>
	        </table>
	        <div class="navBtn">
	            <input type="hidden" name="id" value="${sessionScope.id }">
	            <button class="defaultBtn insertGroup">그룹 생성</button>
	        </div>
		</div>
    </form>
	
</body>
</html>