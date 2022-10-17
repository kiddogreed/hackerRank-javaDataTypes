/**
 * JavaString
 */

 import java.util.Scanner;

public class JavaString {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    String B = sc.next();
    
    System.out.println(A.length()+B.length());
    

    if (A.compareTo(B) > B.compareTo(A)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    String firstA = A.substring(0, 1);
    String remA = A.substring(1);
    String firstB = B.substring(0, 1);
    String remB = B.substring(1);

    firstA = firstA.toUpperCase();
    firstB = firstB.toUpperCase();
    System.out.println(firstA+remA+" "+firstB+remB);
  }
}