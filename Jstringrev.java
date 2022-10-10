import java.util.Scanner;

/**
 * Jstringrev
 */
import java.util.Scanner;

public class Jstringrev {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a, holder;
    char ch;
     a = sc.next();
     holder = "";
    

    for (int i = 0; i < a.length(); i++) {
      //System.out.println(a.charAt(i));
      ch = a.charAt(i);
      holder = ch+holder;


    }
        if(a.equals(holder)){
          System.out.println("yes");
        }
        else{
          System.out.println("No");
        }
    System.out.println(a);
    System.out.println(holder);
   

    

  }
  
}