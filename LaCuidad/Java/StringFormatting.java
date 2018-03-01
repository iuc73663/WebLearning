class StringFormatting {
   public static void main(String[] args) {
        //not efficient 
      String info = "";
      info += "Bob";
      info +="is";
      info +="my";
      info +="name";
      
      StringBuilder sb = new StringBuilder();
      
      //More efficient for memory
      sb.append("Bob");
      sb.append("is");
      sb.append("my");
      sb.append("name");
      
      System.out.println(sb.toString());
   }
}