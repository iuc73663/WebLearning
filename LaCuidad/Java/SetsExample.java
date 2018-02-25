import java.util.*;

class SetsExample {
   public static void main(String[] args) {
      Set<String> set1 = new HashSet<String>();
      
      set1.add("dog");
      set1.add("cat");
      set1.add("mouse");
      set1.add("snake");
      set1.add("bear");
      
      //iteration through a set
      /*
      for(String element : set1) {
         System.out.println(element);
      }
      */
      
      Set<String> set2 = new HashSet<String>();
      
      set2.add("dog");
      set2.add("cat");
      set2.add("giraffe");
      set2.add("monkey");
      set2.add("ant");
      
      //Intersection
      
      Set<String> intersection = new HashSet<String>(set1);
      
      intersection.retainAll(set2);
      
      //System.out.println(intersection);
      
      //difference 
      Set<String> difference = new HashSet<String>(set2);
      difference.removeAll(set1);
      System.out.println(difference);
      
   }
}