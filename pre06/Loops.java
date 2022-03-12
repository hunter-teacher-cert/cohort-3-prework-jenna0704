import java.io.*;
import java.util.*;

public class Loops{

  public static double squareRoot(double a){

    double guess = a / 2;
    double guessSecond = (guess + a / guess) / 2;

    while (Math.abs(guess - guessSecond) > 0.0001){

      guess = guessSecond;
  
      guessSecond = (guess + a / guess) / 2;
    }

    return guessSecond;
    
  }

  public static double power(double x, int n){
    int i;
    double y = x;
    
    for (i = 1; i < n; i = i + 1){

    x = x * y;

    }
    
    return x;
  }

  public static int factorial(int x){

    int y = x;
    int i;
    
    for (i = 1; i < y; i = i + 1){

      x = x * i;
      
    }

    return x;
  }
  public static void main (String [] args){
  
    System.out.println(squareRoot(15));
    System.out.println(power(3.14,5));
    System.out.println(factorial(9));
  }
}