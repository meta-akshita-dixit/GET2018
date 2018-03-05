/*Script for removing duplicates*/

/**
 *method show optimized string after removing duplicates 
 * by invoking the method remove
 */
function removeDuplicate() {
	//variable to store the input string
	var inputString = document.getElementById('string').value;
	//variable to store the output string returned by method remove
	var outputString = remove(inputString);
	//to get tag using id
	var tag = document.getElementById('print');
	tag.innerHTML = outputString;
}

/**
 *method to remove continuous duplicates from the string
 *param-string having duplicates
 *return-returns updated string
 */
function remove(string) {
    //variable to count the position in the string
    var count = 0;
    //loop to check characters of the strings
    for(i = 0;i < string.length; i++) {
        if(string[i] == string[i+1]) {
		count++;
		continue;
	}
	if(count > 0) {
		string = string.slice(0 ,i - count) + string.slice(i + 1 , string.length);
		count = 0;
		//to check if the new optimized string has duplicates
		string = remove(string);
	}
	}
  return string;
}
