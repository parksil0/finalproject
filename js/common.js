$().ready(function(){

    // 팝업 닫기
    $(".pop dt a, .darkBack").click(function(){
        $(".pop").removeClass("show");
        $(".darkBack").hide();
    });

    // 팝업닫기
    $(".popupOK, .darkBack").click(function(){
        $(".popup").hide();
        $(".popupM").removeClass("show");
        $(".popupP").hide();
        $(".darkBack").hide();
    });

    /********** 멤버팝업(은진) **********/

    // 아이콘 클릭 -> 팝업창띄우기 
    $(".members").click(function(){
        $(".pop").addClass("show");
        $(".darkBack").show();
        $(".memberCont .tab_content > div").hide();
        $(".memberCont .tab_content > div").eq(0).show();
        $(".memberCont .tabs li").removeClass("active");
        $(".memberCont .tabs li").eq(0).addClass("active"); 
    });
    
    // 첫 팝업창에서 전체보기 default
    $(".memberCont .tabs li:first").click(function(){
        $(this).addClass("active").show();
        $(".memberCont .allTap").show();
    });
    
    // 탭메뉴 선택
    $(".memberCont .tabs li").click(function(){
        var idx = $(this).index();
        $(".memberCont .tab_content > div").hide()
        $(".memberCont .tab_content > div").eq(idx).show();
        $(".memberCont .tabs li").removeClass("active");
        $(this).addClass("active");
        $(".memberCont .sel option").prop("selected", false);
        
    });

    // 전체보기에서 토글
    $(".memberTeam").each(function(){
        var team = $(this).find("li:first-child");
        var member = $(this).find("li:nth-child(2)");
        team.click(function(){
            member.toggle();
            $(this).toggleClass("active");
        });
    });    

    /********** 채팅팝업(민형) **********/

    // 팝업열기
    $(".chatBtn a").click(function(){
        $(".msgPopup").toggleClass("show");
        $(".msgPopupAll > div").hide();
        $(".msgPopupAll > div").eq(0).show();
        $(".msgPopupC li").removeClass("active");
        $(".msgPopupC li").eq(0).addClass("active");
        $(".darkBack").show();
    });

    //채팅 멤버/대화방 탭
    $(".msgPopupC li").click(function(){
        var idx = $(this).index(); // --> 0
        $(".msgPopupC li").removeClass("active");
        $(this).addClass("active");
        $(".msgPopupAll > div").hide();
        $(".msgPopupAll > div").eq(idx).show();
    });
    
    //프로필 창 열기
    $(".profileImg").click(function(){
        $(".chatProfile").show();
        $(".darkBack").show();
    });
    
    //프로필 창 닫기
    $(".popupOK1").click(function(){
        $(".chatProfile").hide();
        $(".msgPopup").show();
    });
})
