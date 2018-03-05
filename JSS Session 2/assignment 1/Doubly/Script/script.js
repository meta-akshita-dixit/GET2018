// initializing the pointer to point first node of linked list
var first = null;
// initializing the pointer to point last node of linked list
var last = null; 

/**
 *Method to create and add nodes to the list
 */
function createNode() 
{
    var data = document.getElementById('data').value;
    if(data != "") {
	var node = new Object();
	node.data = data;
	document.getElementById('data').value = "";
	node.next =  null;
	node.previous = last;
	if(first == null) 
	{
		first = node;
	} else {
		last.next = node;
	}
	last = node;
    } else {
	alert("data can't be empty");
        }
 }

/*Method to create a div and add elements to it using next pointer*/
function printForward() 
{
	var temp = first;
	var tag = document.getElementById('print');
	tag.innerHTML = "";
	while(temp != null)
	{
	   var div = document.createElement("div");
	   //styling for the div created 
	   div.style.border = "solid 1px black";
	   div.style.display = "inline-block";
	   div.style.margin = "10px";
	   div.style.padding = "10px";
	   var tempNode = document.createTextNode(temp.data);
	   div.appendChild(tempNode);
	   tag.appendChild(div);
	   temp = temp.next;
	  }
	}
 
/*Method to create a div and add elements to it using previous pointer*/
function printBackward() 
{
    var temp = last;
	var tag = document.getElementById('print');
	tag.innerHTML = "";
    while(temp != null)
	{
	  var div = document.createElement("div");
	  div.style.border = "solid 1px black";
	  div.style.display = "inline-block";
	  div.style.margin = "10px";
	  div.style.padding = "10px";
	  var tempNode = document.createTextNode(temp.data);
	  div.appendChild(tempNode);
	  tag.appendChild(div);
	  temp = temp.previous;
    }
}
