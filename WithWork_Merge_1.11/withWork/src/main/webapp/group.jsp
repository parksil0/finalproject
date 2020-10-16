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
<!-- 임시 css -->
<style>
	.addedR, .addedD {
		cursor: pointer;
	}
</style>
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
			            <input type="text" id="groupName" name="name" placeholder="그룹이름을 입력하세요.">        		
	        		</td>
	        	</tr>
	        	<tr>
	        		<th>그룹 테마</th>
	        		<td>
			            <input type="text" id="groupSub" name="subject" placeholder="그룹주제를 입력하세요.">        		      		
	        		</td>
	        	</tr>
	        	<tr>
	        		<th rowspan="2">부서</th>
	        		<td id="departResult"></td>
	        	</tr>
	        	<tr>
	        		<td>
	        			<input type="text" id="addD" placeholder="부서를 입력하세요">
	        			<button type="button" class="addD">추가</button>
        			</td>
	        	</tr>
	        	<tr>
	        		<th rowspan="2">직책</th>
	        		<td id="roleResult"></td>
	        	</tr>
	        	<tr>
	        		<td>
	        			<input type="text" id="addR" placeholder="직책을 입력하세요">
	        			<button type="button" class="addR">추가</button>
        			</td>
	        	</tr>
	        </table>
	        <div class="navBtn">
	            <input type="hidden" name="email" value="${sessionScope.email }">
	            <button class="defaultBtn insertGroup">그룹 생성</button>
	        </div>
		</div>
    </form>
</body>
<script>
	/* EL 변수 */
	var g_num = '<c:out value="${guest.g_num}" />';
</script>
</html>