$().ready(function(){
    $(".add").click(function(){
        $(".memberInvite").show();
        $(".darkBack").show();
    });
    $(".popup dt a, .btnBox a").click(function(){
        $(".memberInvite").hide();
        $(".darkBack").hide();
    });
    $(".change").click(function(){
        $(".memberChange").show();
        $(".darkBack").show();
    });
    $(".popup dt a, .btnBox a").click(function(){
        $(".memberChange").hide();
        $(".darkBack").hide();
    });
    $(".remove").click(function(){
        $(".memberRemove").show();
        $(".darkBack").show();
    });
    $(".popup dt a, .btnBox a").click(function(){
        $(".memberRemove").hide();
        $(".darkBack").hide();
    });
    
    $(".memberTeam").each(function(){
        var team = $(this).find("li:first-child");
        var member = $(this).find("li:nth-child(2)");
        team.click(function(){
            member.toggle();
        });
    });
});