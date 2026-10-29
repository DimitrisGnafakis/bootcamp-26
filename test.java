public class test{
	public static void main(String... args){
        
      int input = 5;
      int output = factorial(input);
      System.out.println(output);
      
	}
   public static int factorial(int n){
      int result=1;
      for (int i=1;i<=n;i++){
         result = result * i;
      }
      return result;
   }
}

