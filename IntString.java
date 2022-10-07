import java.util.*;

/**
 * IntString
 */
public class IntString {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter numbers ");
    int n =  sc.nextInt();
   

    String s=Integer.toString(n);

    if (n == Integer.parseInt(s)) {
      System.out.println("Good job");
     } else {
      System.out.println("Wrong answer.");
     }

    
  }
  
}