$().ready(function(){
    $("header > ul > li").click(function(){
        $("header > ul > li").removeClass("active");
        $(this).addClass("active");
    });
})
