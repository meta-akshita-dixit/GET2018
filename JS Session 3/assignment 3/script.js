/*script for radio and select combinations*/

//to get the list of all radio buttons
var optn=document.getElementsByName("selectOption");  

/**
 *the method displays the alert box according to the choice 
 */           
function display(){
  for(var i = 0; i < optn.length; i++){
	if(optn[i].checked){
	  //get the value of the respective select field
	  var res = document.getElementById(optn[i].value).value; 
	  // to check if user has selected any value other than default		  
	  if(res != "-1"){                                          
		alert(res);
	  } else {
		alert("Please select an option from the list!");
	  }
	}
  }
}
    //to reset radio buttons on change of the select options
    
	document.getElementById("option1").addEventListener("change",function(){
    document.getElementById("select1").checked=false;
    document.getElementById("select2").checked=false;
    });
	
    document.getElementById("option2").addEventListener("change",function(){
    document.getElementById("select1").checked=false;
    document.getElementById("select2").checked=false;
    });