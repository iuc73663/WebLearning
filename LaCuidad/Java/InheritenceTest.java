class InheritenceTest {
   public static void main(String[] args) {
      //Machine mach1 = new Machine();
      
      Car car1 = new Car();
      car1.start();
      car1.stop();
      car1.windShieldToggle();
      car1.windShieldToggle();
   
   }
}

class Machine {
   public void start() {
      System.out.println("Machine on");
   }
   public void stop() {
      System.out.println("Machine off");
   }
}

class Car extends Machine {
   
   boolean windShield = false;
   
   @Override //Checks parent class to make sure the method exists before overriding 
   public void start() {
      System.out.println("Car has started");
   }
   
   
   public void windShieldToggle() {
      if(!windShield) {
         windShield = true;
         System.out.println("WindShield on");
      }
      else {
         windShield = false; 
         System.out.println("WindShield off");
      }
   }
   
}