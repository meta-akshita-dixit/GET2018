		/**
		*Script for the contact page validations
		*/
		
		
		//variable to store status of name field
		var name = false;
		//variable to store status of email field
		var email = false;
		//variable to store status of organization field
		var organization = false;
		//variable to store status of contact field
		var contact = false;
		
		/**
		 *function to be called when submit button is clicked
		 */
		function validateSubmit(){
			//returns true if all fields have valid entry
			return (name && email && orgnization && contact);
		}
		
		/**
		 *function to validate the name field
		 *@param - text in the name field
		 */
		function validateName(value){
			/*name entered should contain only chars and should 
			be less than 20 char*/
			var pattern = /^[a-zA-Z\s]{0,20}$/;
			//if input in name field follows the pattern
			if(pattern.test(value)){
				//displays nothing as a message
				document.getElementById('name').innerHTML = "";
				//sets name as true
				name = true;
			}
			else{
				//sets name as false
				name = false;
				//displays error message
				document.getElementById('name').innerHTML = "enter only characters and should not be more than 20 characters";
			}
		}

		/**
		 *function to validate the email field
		 *@param - text in the email field
		 */
		function validateEmail(value){
			
			//email entered should follow the pattern given below
			var pattern = /^([a-zA-Z\.-]+)(@)([a-zA-Z]+)([\.])([a-zA-Z\.]+)$/;
			
			//if input in email field follows the pattern
			if(pattern.test(value)){
				//displays nothing as a message
				document.getElementById('email').innerHTML = "";
				//sets email as true
				email = true;
			}
			else{
				//sets email as false
				email = false;
				//displays error message
				document.getElementById('email').innerHTML = "enter valid email id!";
			}
		}

		/**
		 *function to validate the option field
		 *@param - selected option from the list
		 */
		function validateSelect(value){
			
			//if any option has been selected
			if(value.length > 0){
				//displays the selected city along with the message
				document.getElementById('city').innerHTML = "you have selected this city : "+value;
			}
		}

		/**
		 *function to validate the organization name field
		 *@param - text in the organization name field
		 */
		function validateOrganization(value){
			//organization name entered should follow the pattern given below(all chars only)
			var pattern = /^[a-zA-Z\s]+$/;
			//if input in organization name field follows the pattern
			if(pattern.test(value)){
				//displays nothing as a message
				document.getElementById('organization').innerHTML = "";
				//sets organization as true
				organization = true;
			}
			else{
				//sets organization as false
				organization = false;
				//displays error message
				document.getElementById('organization').innerHTML = "enter only characters";
			}
		}
		
		/**
		 *function to validate the contact field
		 *@param - text in the contact field
		 */
		function validateContact(value){
			//contact entered should follow the pattern given below(all digits only)
			var pattern = /^([1-9]{1})([0-9]{9})$/;
			//if input in contact field follows the pattern
			if(pattern.test(value)){
				//displays nothing as a message
				document.getElementById('contact').innerHTML = "";
				//sets contact as true
				contact = true;
			}
			else{
				//sets contact as false
				contact = false;
				//displays error message
				document.getElementById('contact').innerHTML = "enter valid phone number";
			}
		}
		/**
		 *function to validate the text area field
		 *@param - text in the text area field
		 */
		function validateTextarea(value){
			//checks the length of string in text area
			if(value.length > 250) {
				//fetches first 250 chars of string only in case of copy-paste text
				value = value.substring(0,250);
				//adds text in the text area
				document.getElementById('textarea').value = value;

			}
		}