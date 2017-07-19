//class
function Person(first, last, age, color) {
  this.first = first;
  this.last = last;
  this.age = age;
  this.color = color;
}


//adding method to a class
Person.prototype.name = function() {
  return this.first + ' ' + this.last;
};


//objects
var dad = new Person("Bob", "Odenkirk", 50, "Blue");
var mom = new Person("Mona", "Lisa", 200, "Red");

//add method to objects 
dad.instructions = function() {
  return "clean your room";
}

console.log(dad.name());

console.log(dad.instructions());
