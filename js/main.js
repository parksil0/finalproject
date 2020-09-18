
/* joinForm.html */

$(document).ready(function(){

    /* 체크박스 모두선택 처리 */
    $(".chkAll").click(function(){
        if($(".chkAll").prop("checked")){
            $("input[name=chk]").prop("checked", true);
        } else {
            $("input[name=chk]").prop("checked",false);
        }
    });

    /* 필수항목 동의 하지 않고 확인 버튼클릭시 알람창 설정 */
    $(".fpmgBt1 a").click(function(){
        if(!$(".requiredBtn").prop("checked")) {
            alert("이용약관과 개인정보 수집 및 이용에 대한 안내 모두 동의해주세요.");
            return false;
        }
    });
});

/* mainPage.html */ 


$(document).ready(function(){

    /* 네비게이션 바 우측 상단 로그인 클릭 시 팝업 창 열림 처리 */
    $(".login").click(function(){
        $(".loginPopup").css("display", "block");
        $(".darkBack").css("display","block");
    });

    /* 네비게이션 바 우측 상단 로그인 클릭 시 팝업 창 닫힘 처리 */
    $(".darkBack").click(function(){
        $(".loginPopup").css("display", "none");
        $(".darkBack").css("display", "none");
    });
});