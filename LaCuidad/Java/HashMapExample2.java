import java.util.*;

class HashMapExample2 {
   public static void main(String [] args){
      Map<Integer, String> hashMap = new HashMap<Integer, String>();
      Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
      Map<Integer, String> treeMap = new TreeMap<Integer, String>();
      
      
      testMap("Hash Map",hashMap);
      testMap("Linked Hash Map", linkedHashMap);
      testMap("Tree Map", treeMap);
   
   }
   
   public static void testMap(String type, Map<Integer, String> map) {
      map.put(8,"eight");
      map.put(12,"twelve");
      map.put(15,"fifteen");
      map.put(88,"eighty eight");
      map.put(69,"sixty nine");
      map.put(31,"thirty one");
      map.put(13,"thirteen");
      
      System.out.println("\n\t" + type + " : ");
      for(Integer key : map.keySet() ) {
         String value = map.get(key);
         System.out.println("key : " + key + " && Value : " + value);
      }
   }
}