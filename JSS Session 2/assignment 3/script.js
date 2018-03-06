/*Script for queue implementation*/

//array to perform queue operation
var queue = new Array(100);
//variable to store start of queue
var front = -1;
//variable to store end of queue
var rear = -1;

/**
 *method to enqueue new element in the queue
 */
function enqueue() {
    var data = document.getElementById("data").value;
    if(data != "" && rear <= 100) {
    if(front == -1 && rear == -1) {
	  front = 0;
	  rear = 0;
    } else {
          rear++;
    }
    queue[rear] = data;
    document.getElementById("data").value="";
  } else { //error in adding new element
    alert("Element can't be enqueued either because of data is empty or queue is full");
  }
}
/**
 *method to dequeue an element from the queue
 */
function dequeue() {
    if(front == rear+1) {
      alert("queue is empty");
    } else {
      data = queue[front++];
      document.getElementById("show").innerHTML = data;
    }
  }
/**
 *method to show the elements of the queue
 */
function showQueue() {
     document.getElementById("show").innerHTML = "";
     //loop to display the elements
     for(var loopCounter = front; loopCounter <= rear; loopCounter++){
		document.getElementById("show").innerHTML += queue[loopCounter] + "   ";
     }
}
