function setModals() {
			var make = document.getElementById("make");
			var modal = document.getElementById("modal");
			switch(make.value) {
			case "mahindra":
				modal.innerHTML = "<Option>Select Modal</Option><Option>Thar</Option><Option>e2o</Option><Option>Verito Vibe cs</Option><Option>Verito Vibe xs</Option><Option>Bolaro</Option>";
				break;
			case "tata":
				modal.innerHTML = "<Option>Select Modal</Option><Option>Nano GenX</Option><Option>Nano</Option><Option>Indica eV2</Option><Option>Bolt</Option><Option>Sumo Gold</Option><Option>Manza</Option><Option>Zest</Option>";
				break;
			case "toyoto":
				modal.innerHTML = "<Option>Select Modal</Option><Option>Etios Gold</Option><Option>Innova</Option><Option>Fortuner</Option><Option>Camry</Option><Option>Corrola</Option><Option>Land Cruiser</Option><Option>Prius</Option>";
				break;
			case "honda":
				modal.innerHTML = "<Option>Select Modal</Option><Option>Brio</Option><Option>Amaze</Option><Option>Jazz</Option><Option>Mobilio</Option><Option>CR-V</Option><Option>Honda City</Option>";
				break;
			case "bmw":
				modal.innerHTML = "<Option>Select Modal</Option><Option>BMW 1-Series</Option><Option>BMW 2-Series</Option><Option>BMW X1</Option><Option>BMW 5-Series</Option>";
				break;
			case "audi":
				modal.innerHTML = "<Option>Select Modal</Option><Option>A3 Sedan</Option><Option>A3 Cabriolate</Option><Option>A8-L</Option><Option>Q7</Option>";
				break;
			}
	}