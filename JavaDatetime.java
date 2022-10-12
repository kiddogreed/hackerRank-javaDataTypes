import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * JavaDatetime
 */
public class JavaDatetime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("add day (31):");
    int day = sc.nextInt();
    System.out.println("add month (12):");
    int month = sc.nextInt();
    System.out.println("add year(20xx):");
    int year = sc.nextInt();

     // Set a local date whose day is found 

     System.out.println(findDay(month, day, year));
   
  }

  public static String findDay(int month, int day, int year) {
    LocalDate localDate = LocalDate.of(year, month, day);

    // Find the day from the local date 
    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

    return "day:"+dayOfWeek.name();
  
  }
}