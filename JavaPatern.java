/**
 * JavaPatern
 */

 import java.util.Scanner;
 import java.util.regex.*;

import javax.sound.midi.Soundbank;
public class JavaPatern {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    while (testCases>0) {
      String pattern = in.nextLine();

      try {
        Pattern p = Pattern.compile(pattern);
        System.out.println("Valid");
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Invalid");
      }

      testCases--;
    }
  }
}