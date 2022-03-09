import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celsius{

  public static void main(String[] args){

    Scanner in = new Scanner (System.in);

    double celcius;
    double fahrenheit;
    
    System.out.print("What is the temperature in degrees Celsius?");
    celcius = in.nextInt();

    fahrenheit = celcius * 9 / 5 + 32;

    System.out.print(celcius + " C = ");
    System.out.println(fahrenheit + " F");

  
    
  }
}