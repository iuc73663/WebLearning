var numOne = document.getElementById("num-one");
var numTwo = document.getElementById("num-two");
var addSum = document.getElementById("add-sum");


numOne.addEventListener("input", add);
numTwo.addEventListener("input", add);

function add(){
  var one = parseFloat(numOne.value);
  var two = parseFloat(numTwo.value);

  if(isNaN(parseFloat(one))){
    one = 0;
  }
  if(isNaN(parseFloat(two))){
    two = 0;
  }

  addSum.innerHTML = one + " + " + two + "= " + (one + two);
}
