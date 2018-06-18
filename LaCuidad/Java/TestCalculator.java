import java.util.Scanner;

class TestCalculator {
   public static void main(String[] args) {
      int myList[] = new int[5];
      for(int i = 0; i < myList.length; i++) {
         myList[i] = i;
      }
      
      printList(myList);
   }
   public static void printList(int someList[]){
         for(int i =0; i < someList.length; i++) {
            System.out.println(someList[i]);
         }
   }

}