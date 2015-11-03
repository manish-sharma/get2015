$(document).ready(function(){
    $("button#start").click(function(){
        $("div").animate({left: '100%'},5000);
    });
$("button#back").click(function(){
        $("div").animate({left: '0%'},5000);
    });
$("button#stop").click(function(){
        $("div").stop();
    });
$("button#right").click(function(){
$("div").stop();
        $("div").animate({left: '+=100px'},5000);
    });
$("button#left").click(function(){
$("div").stop();
        $("div").animate({left: '-=100px'},5000);
    });
$("button#top").click(function(){
 $("div").stop();
        $("div").animate({top: '-=100px'},5000);
    });
$("button#bottom").click(function(){
 $("div").stop();
        $("div").animate({top: '+=100px'},5000);
    });
});
