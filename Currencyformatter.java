/**
 * Currencyformatter
 */

 import java.util.Scanner;
 import java.util.Locale;
 import java.text.DecimalFormat;
 import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class Currencyformatter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double payment = sc.nextDouble();
    String us, india, china, france;

    Locale u = new Locale("en", "US");
    Locale i = new Locale("en", "IN");
    Locale c = new Locale("zh", "CN");
    Locale f = new Locale("fr", "FR");

    NumberFormat usfmt = NumberFormat.getCurrencyInstance(u);
    NumberFormat indfmt = NumberFormat.getCurrencyInstance(i);
    NumberFormat chifmt = NumberFormat.getCurrencyInstance(c);
    NumberFormat frafmt = NumberFormat.getCurrencyInstance(f);

    us = usfmt.format(payment);
    india = indfmt.format(payment);
    china = chifmt.format(payment);
    france = frafmt.format(payment);
   
    


    
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}