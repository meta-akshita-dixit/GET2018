 /*Script for radio button combinations*/
 
 // to get the list of all radio buttons of type gender
var gender= document.getElementsByName("gender");   
 // to get the list of all radio buttons of type foodType  
var foodType= document.getElementsByName("food-type");   
 //to get the tag to display result
var res = document.getElementById("display");

/**
 *this method print the selected options in both groups
 */
function printRes(){
  res.innerHTML="";
  //loop to get the selected option in gender
  for( var i = 0; i < gender.length; i++){
    if(gender[i].checked){
      res.innerHTML += "gender is:- " + gender[i].value;
    }
  }
  //loop to get the selected option in food-type
  for( var i =0; i < foodType.length; i++){
    if(foodType[i].checked){
      res.innerHTML +=" and foodType is:- " + foodType[i].value;
    }
 }
}