/**
 * Eof
 */

 import java.io.*;
 import java.util.*;

public class Eof {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int x = 0;
    while (sc.hasNext()) {
      System.out.println(++x+ " "+ sc.nextLine());
    }
  }
}