
<!DOCTYPE html>
<html lang="en">
  <head>
    
    <title>Car Dekho</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">  


   
  </head>

  <body>

   <%@ include file="menu.jsp" %>


	
	<div id="home" class="slideshow">
	
		<img class="photo" src="images/bmw1.jpg" alt="" /> 
		<img class="photo" src="images/bmw2.jpg" alt="" /> 
		<img class="photo" src="images/bmw3.jpg" alt="" />
		<img class="photo" src="images/bmw4.jpg" alt="" />
	</div>
	
	
	<section id="about" class="about">
		<div class="row" style="margin: 0;">
		<div class="col-md-12">
			<h1 class="title-text">ABOUT</h1>
			<h3 class="caption-text">This auto-portal talks about every existing car-breed ranging from hatchbacks, which are the smallest and yet the smartest members of the automobile community, to the electrifying super cars, which reign over the fantasies of car-enthusiasts across the globe.</h3>
			
		</div>
	</div>
	<div class="row" style="margin: 0;">
		<div class="col-md-4  about-item about-border">
			<i class="fa fa-search fa-5x"></i>
			<h1 class="about-title">
				BROWSE !
			</h1>
			<h3>Browse through our available cars.</h3>
		</div>
		<div class="col-md-4 about-item about-border ">
			<i class="fa fa-check-circle-o fa-5x"></i>
			<h1 class="about-title">
				SELECT !
			</h1>
			<h3>Select the car of your choice.</h3>
		</div>
		<div class="col-md-4 about-item">
			<i class="fa fa-shopping-cart fa-5x"></i>
			<h1 class="about-title">
				BUY !
			</h1>
			<h3>Buy the car from your nearest dealer.</h3>
		</div>
	
	</div>
		
	</section>
	
	<section id="new-car" class="new-cars">
	
	<div class="row" style="margin: 0;">
		<div class="col-md-12">
			<h1 class="title-text">NEWLY LAUNCHED</h1>
			<h3 class="caption-text">CarDekho is not just a web portal that lists cars in India, but is a rich automotive platform that brings to its readers to-the-minute insights from around the world. Be it a newbie, an auto freak, or a layman in terms of complex car engine and performance terminologies.</h3>
			
		</div>
	</div>
		<div class="row" style="margin: 0;">
			<div class="col-md-3 new-car-item">
				<img alt="" src="images/new-car-1.jpg">
				<h2>Volkswagen Vento</h2>
				<span id="car-info"><a href="vento.html">Click for more info</a></span>
			</div>
			<div class="col-md-3 new-car-item">
				<img alt="" src="images/new-car-2.jpg">
				<h2>Volkswagen Polo</h2>
				<span id="car-info"><a href="polo.html">Click for more info</a></span>
			</div>
			<div class="col-md-3 new-car-item">
				<img alt="" src="images/new-car-3.jpg">
				<h2>Range Rover</h2>
				<span id="car-info"><a href="range-rover.html">Click for more info</a></span>
			</div>
			<div class="col-md-3 new-car-item">
				<img alt="" src="images/new-car-4.jpg">
				<h2>Renault Kwid</h2>
				<span id="car-info"><a href="kwid.html">Click for more info</a></span>
			</div>
		
		</div>
	</section>
	
	<footer class="footer">
      <div class="container">
        <p>Copyright @ 2015 : Made By Sanjay Nainani</p>
      </div>
    </footer>
	

	
    


  
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
  </body>
</html>
