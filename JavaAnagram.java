/**
 * JavaAnagram
 */

 import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {

  
static boolean isAnagram(String a, String b) {

  a.toLowerCase();
  b.toLowerCase();

  char[] A = a.toCharArray();
  char[] B = b.toCharArray();

  Arrays.sort(A);
  Arrays.sort(B);

  String sortedA = String.valueOf(A);
  String sortedB = String.valueOf(B);

  if(sortedA.equals(sortedB)) {
    return true;
} else return false;
    
 }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    //scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}