$(document)
		.ready(
				function() {
					var title = window.location.href.slice(window.location.href
							.indexOf('=') + 1);
					var table = $('#movieSearchData');
					var flag = false;
					var str = "<tr><th>Title</th><th>genre</th><th>Director</th><th>Writer</th><th>Producer</th><th>Composer</th><th>Website</th><th>Trailer</th><th>Review</th></tr>";
					for (var i = 0; i < movieData.length; i++) {
						if (title === (movieData[i].title)) {
							str += "<tr><td>" + movieData[i].title
									+ "</td><td>" + movieData[i].genre
									+ "</td><td>" + movieData[i].director
									+ "</td><td>" + movieData[i].writer
									+ "</td><td>" + movieData[i].producer
									+ "</td><td>" + movieData[i].composer
									+ "</td><td>" + movieData[i].website
									+ "</td><td>" + movieData[i].trailer
									+ "</td><td>" + movieData[i].review
									+ "</td></tr>";
							table.html(str);
							flag = true;
							break;
						}
					}
					if (flag == false) {
						table.html("No Movie Found");
					}
				});