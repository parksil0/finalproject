$(document).ready(function() {
    $(".tab_content").hide();
    $(".tabs li:first").addClass("active").show();
    $("#tab1").show();

    $(".tabs li").click(function(){
        $(".tabs li").removeClass("active");
        $(this).addClass("active");
        $(".tab_content").hide();

        var activeTap = $(this).find('a').attr('href');
        $(activeTap).fadeIn();
        return false;
    });

    
    $("#mess").click(function(){
        $(".confirmPopup").show();
        $(".darkBack").show();
    });

    $(".popup .btnBox a").click(function(){
        $(".confirmPopup").hide();
        $(".darkBack").hide();
    });


    $(".tabs li:first").on('click',function(){
        
        $(this).addClass("active").show();
        $("#tab1").show();
    });

});
