import java.util.*;

class Testing {
   public static void main(String[] args){
      Set<String> set1 = new HashSet<String>();
      Set<String> set2 = new HashSet<String>();
      
      
      set1.add("Mouse");
      set1.add("Dog");
      set1.add("horse");
      set1.add("cat");

      set2.add("Mouse");
      set2.add("CAT");
      set2.add("rat");
      set2.add("Bird");
      
      Set<String> intersection = new HashSet<String>(set1);
      Set<String>difference = new HashSet<String>(set2);
      intersection.retainAll(set2);
      
      difference.removeAll(set1);
      System.out.println(set1);
      
      
   }
}
