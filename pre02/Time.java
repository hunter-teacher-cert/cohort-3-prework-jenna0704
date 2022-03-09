import java.io.*;
import java.util.*;

public class Time{

  public static void main(String[] args) {

    int hour = 19;
    int minute = 7;
    int second = 30;

    System.out.println("The current time is " + hour + ":" + minute + ":" + second + ".");

    int x = hour * 60 * 60 + minute * 60 + second;
    
    System.out.println("Number of seconds since midnight: " + x);

    int y = 86400 - x;
    
    System.out.println("Number of seconds remaining in the day: " + y);

    double percentage = (x * 100) / 86400.0;
    
    System.out.println("Percentage of the day that has passed: " + percentage + "%");

    int hourCurrent = 20;
    int minuteCurrent = 17;
    int secondCurrent = 45;

    System.out.println("The current time is " + hourCurrent + ":" + minuteCurrent + ":" + secondCurrent + ".");
    
    System.out.println("The elapsed time since I started working on this exercise is " + (hourCurrent - hour) + " hour, " + (minuteCurrent - minute) + " minutes, and " + (secondCurrent - second) + " seconds.");

    int z = (hourCurrent - hour) * 3600 + (minuteCurrent - minute) * 60 + (secondCurrent - second);

    System.out.println("Number of seconds since I started working on this exercise: " + z);
  
  }
}