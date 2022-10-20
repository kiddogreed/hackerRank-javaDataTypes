/**
 * JavaToken
 */

import java.io.*;
 import java.util.*;

public class JavaToken {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    String[] tokens = s.trim().split("[!,?._'@ ]+");

    if (s.trim().isEmpty()) {
        System.out.println("0");
    } else {
        System.out.println(Arrays.asList(tokens).size());

        for (int i = 0; i < Arrays.asList(tokens).size(); i++) {
            System.out.println(tokens[i]);
        }
    }
    
    scan.close();


  }
}