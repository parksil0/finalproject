$().ready(function(){
    // 탭메뉴
    $(".todoNav li").click(function(){
        var idx = $(this).index();
        $(".todoNav li").removeClass("active");
        $(this).addClass("active");
        $(".todoCont > li").removeClass("active");
        $(".todoCont > li").eq(idx).addClass("active");
    });

    // 팝업열기
    $(".todoContList li a, .departTodo dd li a").click(function(){
        $(".workPopup").show();
        $(".darkBack").show();
    });

    // 팝업닫기
    $(".popupOK").click(function(){
        $(".workPopup").hide();
        $(".darkBack").hide();
    });
});