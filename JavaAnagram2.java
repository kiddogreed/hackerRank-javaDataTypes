/**
 * JavaAnagram2
 */
import java.util.Scanner;
public class JavaAnagram2 {

   static boolean isAnagram(String aa , String bb) {
    aa=aa.toLowerCase();
    bb=bb.toLowerCase();
    char[] ar = aa.toCharArray();
    java.util.Arrays.sort(ar);
    String a = String.valueOf(ar);

    char[] arh = bb.toCharArray();
    java.util.Arrays.sort(arh);
    String b = String.valueOf(arh);

    java.util.HashMap<Character, Integer> ahash  = new java.util.HashMap<>();
    java.util.HashMap<Character, Integer> bhash  = new java.util.HashMap<>();

     // Complete the function
     for(int i=0;i<a.length();i++){
      if (ahash.containsKey(a.charAt(i))){
          int temp = ahash.get(a.charAt(i))+1;
          ahash.put(a.charAt(i),temp);
      }
      else{
          ahash.put(a.charAt(i),1);
      }
  }
  for(int i=0;i<b.length();i++){
      if (bhash.containsKey(b.charAt(i))){
          int temp = bhash.get(b.charAt(i))+1;
          bhash.put(b.charAt(i),temp);
      }
      else{
          bhash.put(b.charAt(i),1);
      }
  }
  //System.out.println(ahash+" "+bhash);
  int flag=0;
  if (a.length()!=b.length()){
      return false;
  }
  
  for(int k=0;k<Math.min(a.length(),b.length());k++){
      if ((ahash.get(a.charAt(k))!=bhash.get(b.charAt(k))) || (a.charAt(k)!=b.charAt(k))){
          //System.out.println(ahash.get(a.charAt(k))+" "+bhash.get(b.charAt(k)));
          flag=1;
          return false;
      }
  }
  return true;


  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    
  }
}