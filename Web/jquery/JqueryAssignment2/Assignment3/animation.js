
$(document).ready(function() {
    $('#back').click(function() {
        $('#div').animate({
        'marginLeft' : "-=300px" //moves left
        },5000);
    });
    $('#start').click(function() {
        $('#div').animate({
        'marginLeft' : "+=300px" //moves right
        },5000);
    });
    $('#stop').click(function() {
        $('#div').stop()
    });
    $('#moveleft').click(function() {
        $('#div').animate({
        'marginLeft' : "-=30px" //moves left
        });
    });
    $('#moveright').click(function() {
        $('#div').animate({
        'marginLeft' : "+=30px" //moves right
        });
    });
    $('#movedown').click(function() {
        $('#div').animate({
        'marginTop' : "+=30px" //moves down
        });
    });
    $('#moveup').click(function() {
        $('#div').animate({
        'marginTop' : "-=30px" //moves up
        });
    });

});
