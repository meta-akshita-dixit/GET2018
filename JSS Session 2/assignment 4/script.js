/*Script for stack implementation*/

//array to perform stack operation
var stack = new Array(100);
//variable to store top position of stack
var topElement = -1;

/**
 *method to push new element in the stack
 */
function push() {
  document.getElementById('show').innerHTML = "";
  //if stack is full
  if(topElement < 100){
    var data = document.getElementById('data').value;
    topElement = topElement + 1;
    stack[topElement] = data;
  } else{
    alert("stack is full");
  }
  document.getElementById('data').value = "";
}

/**
 *method to pop an element from the stack
 */
function pop(){
  document.getElementById('show').innerHTML = "";
  //if stack is not empty
  if(topElement > -1){
    var data = stack[topElement];
    topElement = topElement - 1;
    document.getElementById('show').innerHTML = data;
  } else{
    document.getElementById('show').innerHTML = "";
    alert("no element in stack");
  }
}

function showStack() {
	document.getElementById('show').innerHTML = "";
	//loop to display the elements
	for(var loopCounter = topElement; loopCounter >= 0; loopCounter--){
		document.getElementById('show').innerHTML += stack[loopCounter]+"   ";
	}
	
}