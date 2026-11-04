public class test {
  public static void main(String... args) {
    int[] numbers = { 2, 5, 8, 12, 16, 23, 38, 56 };
    int key = 8;

    int left = 0;
    int right = numbers.length - 1;
    int index = -1;

    while (left <= right) {
      int middle = left + (right - left) / 2;

      if (numbers[middle] == key) {
        index = middle;
        break;
      } else if (numbers[middle] < key) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }

    if (index >= 0) {
      System.out.println("Key found at index " + index);
    } else {
      System.out.println("Key not found");
    }

  }
}
