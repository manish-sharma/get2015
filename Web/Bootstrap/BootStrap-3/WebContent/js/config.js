/**
 * 
 */
$('.carousel slide').carousel({
	interval:2000,
    pause:"false"
});

var $item = $('.carousel slide .item');
var $wHeight = $(window).height();

$item.height($wHeight); 
$item.addClass('full-screen');

$(window).on('resize', function (){
	  $wHeight = $(window).height();
	  $item.height($wHeight);
});