import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celsius{

  public static void main(String[] args){

    double celsius, fahrenheit;
    
    Scanner in = new Scanner (System.in);

    //prompt the user for input
    System.out.print("Enter a temperature in Celsius: ");
    celsius = in.nextDouble();
    in.nextLine(); //flushes out the previous input 
        
    //convert degree celsius to degree fahrenheit
    fahrenheit = celsius * (9.0/5.0) + 32;

    System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);

  
    
  }
}