$(document)
		.ready(
				function() {
					var table = $('#movieReviewData').children();
					var totalDataLength = movieData.length;
					var perPage = 5;
					var totalPages = totalDataLength / perPage;
					var str = "";
					for (i = 0; i < perPage; i++) {
						str += "<tr><td>" + movieData[i].title + "</td><td>"
								+ movieData[i].genre + "</td><td>"
								+ movieData[i].director + "</td><td>"
								+ movieData[i].writer + "</td><td>"
								+ movieData[i].producer + "</td><td>"
								+ movieData[i].composer + "</td><td>"
								+ movieData[i].website + "</td><td>"
								+ movieData[i].trailer + "</td><td>"
								+ movieData[i].review + "</td></tr>";
					}
					table.append(str);
					var str = "";
					for (i = 0; i < totalPages; i++)
						str += "<li value='" + (i + 1) + "'><a href='#' id='"
								+ (i + 1) + "'>" + (i + 1) + "</a></li>";
					document.getElementById("pagination").innerHTML = str;

					$(".pagination li").first().addClass("active");

					$(".pagination li")
							.on(
									'click',
									function() {
										$(".pagination li").removeClass(
												'active');
										$(this).addClass('active');
										var page = $(this).attr('value');
										var j = 5 * (page - 1);
										var table = $('#movieReviewData')
												.children();
										var str = "<tr><th>Title</th><th>genre</th><th>Director</th><th>Writer</th><th>Producer</th><th>Composer</th><th>Website</th><th>Trailer</th><th>Review</th></tr>";
										for (var i = j; i < j + perPage; i++) {
											if (i == movieData.length) {
												break;
											}
											str += "<tr><td>"
													+ movieData[i].title
													+ "</td><td>"
													+ movieData[i].genre
													+ "</td><td>"
													+ movieData[i].director
													+ "</td><td>"
													+ movieData[i].writer
													+ "</td><td>"
													+ movieData[i].producer
													+ "</td><td>"
													+ movieData[i].composer
													+ "</td><td>"
													+ movieData[i].website
													+ "</td><td>"
													+ movieData[i].trailer
													+ "</td><td>"
													+ movieData[i].review
													+ "</td></tr>";
										}
										table.html(str);
									});

				});
