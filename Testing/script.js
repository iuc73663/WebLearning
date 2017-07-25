var theNav = document.getElementById('nav');


theNav.addEventListener("click", getElementProps(), false);


var getElementProps = function (){
  this.innerHTML = "Id: " + this.id;
}
