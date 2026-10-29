public class test{
	public static void main(String... args){
        
      int input = 5;
      int output = factorial(input);
      System.out.println(output);
      
	}
   public static int factorial(int n){
      if (n == 1){
         return 1;
      }
      return n * factorial(n-1);
   }
}

