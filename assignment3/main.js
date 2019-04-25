    /**
	 *Script for the gallery page
	 */


	//calling the function to display the images
	displayThumbnail ();

	//reference to button in the html 
	var btn = document.querySelector ('.dark');

	/*method to change the text content of the button and appearance of the
	  the displayed image on clicking the button */
	btn.onclick = function () {
		//if the text on button is darken
		if ( btn.getAttribute ('class') == 'dark') {
			
			//changes the class of button to light
			btn.setAttribute ('class', 'light');
			
			//changes the textcontent of button to lighten
			btn.textContent = 'Lighten';
			
			//darkens the displayed image
			document.querySelector ('.overlay').style.background = 'rgba(0,0,0,.5)';
		} else {
			
			//changes the class of button to dark
			btn.setAttribute ('class', 'dark');
			
			//changes the textcontent of button to darken
			btn.textContent = 'Darken';
			
			//removes the darken effect on displayed image
			document.querySelector ('.overlay').style.background = 'rgba(0,0,0,0)';
		}
	}

	/*looping for thumb-bar*/
	function displayThumbnail () {
		
		//var to store id of div
		var div = document.querySelector ('#thumb-bar');
		
		//loop to get all thumbnails displayed
		for (var i = 1;i <= 5; i++) {
			
			//creating the img element
			var image = document.createElement ("img");
			
			//setting source to the created tag
			image.setAttribute ('src', 'images/pic'+i+'.jpg');
			
			//appending the element to the div
			div.append (image);
			
			//onclick function for each thumbnail
			image.onclick = function (e) {
				
				//get the source of image and display on the displayed img div
				showImage ( e.target.getAttribute ('src'));
			}
		}
	}

	/*to display image on the displayed image div*/
	function showImage (source) {
		
		//displaying image on the displayed image div
		document.querySelector ('#displayed-img').setAttribute ('src',source);
	}
