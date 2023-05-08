import java.util.Scanner;

public class PlusMinus {

public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        plusMinus(arr);
        scanner.close();
  
}

public static void plusMinus(int[] arr) {
  int n = arr.length;
  int positive = 0;
  int negative = 0;
  int zero = 0;
  for (int i = 0; i < n; i++) {
      if (arr[i] > 0) {
          positive++;
      } else if (arr[i] < 0) {
          negative++;
      } else {
          zero++;
      }
  }
  System.out.printf("%.6f\n", (double) positive / n);
  System.out.printf("%.6f\n", (double) negative / n);
  System.out.printf("%.6f\n", (double) zero / n);
}
  
}
