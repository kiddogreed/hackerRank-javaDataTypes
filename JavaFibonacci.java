import java.util.Scanner;

/**
 * JavaFibonacci
 */
public class JavaFibonacci {

  public static void main(String[] args) {
    
    int a = 0,b =1;

    System.out.println(a);
    System.out.println(b);

    Scanner sc = new Scanner(System.in);
    System.out.println("FIBONACCI SEQUENCE Enter max limit:");
    int limit = sc.nextInt();

    
    for (int i = 0; i <= limit; i++) {
      
      System.out.print(a +" ");
      int sum = a + b;
      a = b;
      b = sum;

      
    }

  }
}