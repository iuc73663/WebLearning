import java.util.*; 

public class LinkedListExample {
   public static void main(String[] args) {
      List<Integer> arrayList = new ArrayList<Integer>();
      List<Integer> linkedList = new LinkedList<Integer>();
      
      doTiming("Array List", arrayList);
      doTiming("Linked List", linkedList);
   }
   
   private static void doTiming(String type, List<Integer> list) {
      for(int i =0; i < 1e5; i++){
         list.add(i);
      }
         
      long start = System.currentTimeMillis();
      
      /*
      //add items at end of list
      for(int j = 0; j < 1e5; j++){
         list.add(j);
      }*/
      
      
      //add items starting at index i of list
      for(int j = 0; j < 1e5; j++){
         list.add(0,j); //add in front
      }      
      
      long end = System.currentTimeMillis();
         
      System.out.println("Time taken : " + (end-start) + " ms for " + type);
      
      
      
      
      
   }
}