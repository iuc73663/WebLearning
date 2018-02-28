class Thing {
   public String name;
   public int age;
   public static int count = 0;
   public final static String type = "Thing";
   
   public Thing(String name, int age) {
      count++;
      this.name = name;
      this.age = age;
   }
   
   public void getInfo(){
      System.out.println("Name : " + name + "\nAge: " + age + "\nDescription : " + type);
   }
}

class StaticTesting {
   public static void main(String[] args) {
      System.out.println(Thing.count);
      Thing thing1 = new Thing("Bob", 5);
      System.out.println(Thing.count);
      Thing thing2 = new Thing("Jared", 7);
      System.out.println(Thing.count);      
      
      
      thing1.getInfo();
      thing2.getInfo();
      
   }
}