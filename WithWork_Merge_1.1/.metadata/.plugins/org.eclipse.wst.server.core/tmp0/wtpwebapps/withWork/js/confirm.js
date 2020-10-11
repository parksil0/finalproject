$(document).ready(function() {
    $(".confirmTabMenu .tab_content").hide();
    $(".confirmTabMenu .tabs li:first").addClass("active").show();
    $(".confirmTabMenu #tab1").show();

    $(".confirmTabMenu .tabs li").click(function(){
        $(".confirmTabMenu .tabs li").removeClass("active");
        $(this).addClass("active");
        $(".confirmTabMenu .tab_content").hide();

        var activeTap = $(this).find('a').attr('href');
        $(activeTap).fadeIn();
        return false;
    });

    
    $("#mess").click(function(){
        $(".confirmPopup").show();
        $(".darkBack").show();
    });

    $(".confirmTabMenu .tabs li:first").on('click',function(){
        $(this).addClass("active").show();
        $("#tab1").show();
    });

});
