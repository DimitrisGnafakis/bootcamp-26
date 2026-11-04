public class binary_search {
   public static void main(String... args) {


      int[] array = {5, 7, 10, 12, 14, 16, 19};

      int[] test_cases = {1, 5, 13,14,19,20};
      for (int key : test_cases)
         System.out.println(key +" "+ binary_search(array,key));
   }

   public static int binary_search(int[] array, int key){

      int start=0;
      int stop=array.length - 1;
  
      if (array[start] == key)
         return 1;
      if (array[stop] == key)
         return 1;
  
      int midpoint = ( start + stop ) / 2;

      while ( array[midpoint] != key ){

         if (array[midpoint] > key )
            stop = midpoint;
         else
            start = midpoint;

         midpoint = ( start + stop ) / 2;

         if ((midpoint == start) || (midpoint == stop))
            return 0;

      }

      return 1;

   }

}
