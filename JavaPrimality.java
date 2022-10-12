import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * JavaPrimality
 */
public class JavaPrimality {

  public static void main(String[] args)throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(
      new InputStreamReader(System.in));

    String n = bufferedReader.readLine();
    bufferedReader.close();
    
    // if(Integer.parseInt(n)<= 1){
    //   System.out.println("not prime");
    // }
    // else{
    //   for (int i = 2; i <=Integer.parseInt(n)/2 ; i++) {
    //       if ((Integer.parseInt(n) % i)==0) {
    //           System.out.println("not prime");
    //           break;
    //       }
         
    //   }

      // System.out.println("prime");




      boolean result;
        BigInteger num = new BigInteger(n);
        result = num.isProbablePrime(1);
        
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
      
    }
    
  }
