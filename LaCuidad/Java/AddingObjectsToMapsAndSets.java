import java.util.*;

class Person {
   private int id; 
   private String name; 
   
   public Person(int id, String name) {
      this.id = id;
      this.name = name;
   }
   
   public String toString() {
      return "[ id : " + id + " ; Name : " + name + " ]"; 
   }
}

class AddingObjectsToMapsAndSets {
   public static void main(String[] args) {
   
      Person p1 = new Person(0, "Bob");
      Person p2 = new Person(1, "Joe");
      Person p3 = new Person(2, "Jon");
      Person p4 = new Person(3, "Zac");
      
      Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
      
      map.put(p1, 1);
      map.put(p2, 2);
      map.put(p3, 3);
      map.put(p4, 4);
      
      
      // NOTE, duplicates will exist in sets/maps because they will not check the contents of objects even if they are the same 
      //Need to implement hashcode and equals methods to check for duplicates 
      for(Person key : map.keySet()) {
         System.out.println("Key : " + key + " : " + map.get(key));
      }
      
      
   }
}