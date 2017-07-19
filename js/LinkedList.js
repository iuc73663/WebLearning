function Node(val, next){
  this.val = val;
  this.next = next;
}

function LinkedList(){
  this.head = null;
  this.size = 0;

  this.push = function(val) {
    someNode = new Node(val, null);
    if(!this.head){
      this.head = someNode;
    }
    else{
      current = this.head;
      while(current.next){
        current = current.next;
      }
      current.next = someNode;
    }
    this.size++;
  };

  this.print = function() {
    current = this.head;
    while(current.next){
      console.log(current.val);
      current = current.next;
    }
    console.log(current.val);
  };

  this.getSize = function() {
    console.log("Current size of list: " + this.size);
  }

  this.contains = function(val) {
    current = this.head;
    does = false;
    while(current.next){
      if(current.val === val){
        does = true;
      }
      current = current.next;
    }
    console.log(does);
  };

}


var myList = new LinkedList();

myList.push(1);
myList.push(2);
myList.push(3);

myList.print();

myList.getSize();
myList.contains(0);
myList.contains(1);
