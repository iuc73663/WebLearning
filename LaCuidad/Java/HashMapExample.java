import java.util.*;

public class HashMapExample {
   public static void main(String[] args) {
      HashMap<Integer,String> map = new HashMap<Integer, String>();
      
      map.put(5, "five");
      map.put(8,"eight");
      map.put(6, "six");
      map.put(4,"four");
      map.put(2,"two");
      
      //iterating through map 
      for(Map.Entry<Integer,String> entry : map.entrySet()) {
         int key = entry.getKey();
         String value = entry.getValue();
         
         System.out.println("Key : "+ key +" ; " + " Value : " + value);
      }
   }
}