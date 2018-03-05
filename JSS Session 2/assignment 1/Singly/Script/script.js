var first = null; // initializing the
var last = null; // linked list

/*Method to create and add nodes to the list*/
function createNode() 
{
	var data = document.getElementById('data').value;
	//if the user has entered the data
	if(data != "") 
	{
		//creating new object 
		var node = new Object();
		//initializing node values
		node.data = data;
		node.next =  null;
		//for the first node
		if(first == null) 
		{
			first = node;
		} else {
			last.next = node;
		}
		last = node;
		document.getElementById('data').value = "";
	} else {
		alert("data can't be empty");
	}
}

/*Method to create a div and add elements to it*/
function printList() 
{
	var temp = first;
	//to get element having id print
	var tag = document.getElementById("print");
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
		temp = temp.next;
	}
}
