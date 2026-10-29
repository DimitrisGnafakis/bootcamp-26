public class test {
  public static void main(String... args) {

    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    for (int i = 0; i < arr.length - 1; i += 2) {
      System.out.println("every second element: " + arr[i + 1]);
    }

  }
}
