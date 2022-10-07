/**
 * JavaSubstring
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstring {
public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  System.out.println("enter string:");
  String S = in.nextLine();
  int start = in.nextInt();
  System.out.println("enter begining :");
  int end = in.nextInt();
  System.out.println("enter ending:");
  //answer
  System.out.println(S.substring(start,end));
  

  
  
  }
  
}