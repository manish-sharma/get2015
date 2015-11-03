$(document).ready(function(){
    $("#assignment-1").click(function(){
        $(".message").css("color", "red");
    });
    $("#assignment-2").click(function(){
        $(".box").first().css("color", "red");
    });
    $("#assignment-3").click(function(){
        $("button").css("background-color", "red");
    });
    $("#assignment-4").click(function(){
        $("img[alt='hello']").css("border", "15px solid red");
    });
    $("#assignment-5").click(function(){
        $("#myDiv input").css("border", "4px solid black");
    });
    $("#assignment-6").click(function(){
        $("input[name^='txt']").css("border", "1px solid red");
    });
    $("#assignment-7").click(function(){
        $("p:not(.box)").css("border", "1px solid red");
    });
    $("#assignment-8").click(function(){
        $(".thisdiv .error, .thisdiv .box").css("color", "red");
    });
    $("#assignment-9").click(function(){
        $(".error.box").css("color", "red");
    });
    $("#assignment-10").click(function(){
        $("#myDiv span[class='info']").css("color", "red");
    });
    $("#assignment-11").click(function(){
        $("tr:odd").css("background-color", "red");
    });
});