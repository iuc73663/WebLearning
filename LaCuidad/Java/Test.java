class Test {
	public static void main(String [ ] args) {
		//int random = (int )(Math.random() * 50 + 1);
      for(int i = 0; i < 500; i++) {
         System.out.print((int )(Math.random() * 3) + " ");
         if(i %10 == 0){
            System.out.println();
         }
      }
      
      
      
	}
   

}