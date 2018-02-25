import java.util.*;

public class ArrayListExample {

   public static void printArrayList(ArrayList<Integer> n){
      for(int i =0; i < n.size(); i++){
         System.out.println(n.get(i));
      }
   }
      
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();  
      numbers.add(5);
      numbers.add(20);
      numbers.add(100);
      
      /* Alternative to printing array list 
      for(Integer value: numbers){
         System.out.println(value);
      }
      */
      
      //removing an item
      numbers.remove(0);
      printArrayList(numbers);
      
      
      
      //NOTE removing items in the front in large lists is slow b/c it shifts all items forward. Not ideal.
      
   }
   

}