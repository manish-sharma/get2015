 $(window).resize(function(){
     var w = Math.max(document.documentElement.clientWidth, window.innerWidth || 0);
     if(w < 767){ // or replace with your mobile version's max width
        $("#movie_title").attr("placeholder", "Enter Movie Title");
        $("#Genre").attr("placeholder", "Select Genre");
		$("#Director").attr("placeholder", "Enter Director Name");
		$("#Writer").attr("placeholder", "Enter  Writer Name ");
		$("#Producer").attr("placeholder", "Enter Producer Name ");
		$("#Composer").attr("placeholder", "Enter Composer");
		$("#WebSite").attr("placeholder", "Enter WebSite Name");
		$("#YoutubeTrailer").attr("placeholder", "Youtube Trailer");
		$("#Review").attr("placeholder", "Review");
		
	 
	 }
	 else
	 { 
	   $(':text').attr("placeholder", "");
	 }
});