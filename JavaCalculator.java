import java.util.Scanner;
import java.io.IOException;

/**
 * JavaCalculator
 */
public class JavaCalculator {

  



  public static void main(String[] args) {
  
    boolean isOn = true;
    introMsg();
  
     while (isOn) {
      Scanner scanr = new Scanner(System.in);
      System.out.println("input first number:");
      int a =  scanr.nextInt();
      System.out.println("input second number:");
      int b =  scanr.nextInt();
      System.out.println("Select Method 1:add, 2:sub, 3:mul, 4:div");
      int opt = scanr.nextInt();
    
      
      switch (opt) {
        case 1:
        System.out.println("answer:"+addMe(a, b));
        System.out.println("continue? please type 'true' or it will terminate");
        scanr.nextBoolean();
        clearScreen();
        
          break;
        case 2:
        System.out.println("answer:"+subMe(a, b));
        System.out.println("continue? please type 'true' or it will terminate");
        scanr.nextBoolean();
        clearScreen();
          break;
        case 3:
        System.out.println("answer:"+mulMe(a, b));
        System.out.println("continue? please type 'true' or it will terminate");
        scanr.nextBoolean();
        clearScreen();
          break;  
          
        case 4:
        System.out.println("answer:"+divMe(a, b));
        System.out.println("continue? please type 'true' or it will terminate");
        scanr.nextBoolean();
        clearScreen();
          break;  
      
        default:
        System.out.println("Unable to process :(");
        System.out.println("continue? please type 'true' or it will terminate");
        scanr.nextBoolean();
          break;
       }

      
     } 
     
    }

  public static int addMe(int num1, int num2) {
    return   num1 + num2;
  }
  public static int subMe(int num1, int num2) {
    return  num1 - num2;
  }
  public static int mulMe(int num1, int num2) {
    return  num1 * num2;
  }
  public static int divMe(int num1, int num2) {
    return  num1 / num2;
  }

  public static void introMsg(){
    System.out.println("Welcome");
    System.out.println("this is a calculator! ");
  }

  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
  


}