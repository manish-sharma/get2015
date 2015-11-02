/**
 * 
 */
$(document).ready(function(){
	$("#name").on('change',function(){
	$(this).blur(function(){
		$(this).css({'backgroud-color':'pink','border':'1px solide blue'}).animate(2000);
		$("#name_label").html($(this).val());
	});
	function explode(){
		$("#name").css({'backgroud-color':'white','border':'1px solide grey'}).animate().stop();
	}
	setTimeout(explode,3000);
	});
	
	$("#age").on('change',function(){
		$(this).blur(function(){
			$(this).css({'backgroud-color':'pink','border':'1px solide blue'}).animate(2000);
			$("#age_label").html($(this).val());
		});
		function explode(){
			$("#age").css({'backgroud-color':'white','border':'1px solide grey'}).animate().stop();
		}
		setTimeout(explode,3000);
		});
	
	$("#address").on('change',function(){
		$(this).blur(function(){
			$(this).css({'backgroud-color':'pink','border':'1px solide blue'}).animate(2000);
			$("#address_label").html($(this).val());
		});
		function explode(){
			$("#address").css({'backgroud-color':'white','border':'1px solide grey'}).animate().stop();
		}
		setTimeout(explode,3000);
		});
});