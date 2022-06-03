import java.io.*;
import java.util.*;

public class Data{

  public static void main(String[] args){

    String day = "Tuesday";
    String month = "March";
    int year = 2022;
    int date = 8;
   
    System.out.println("Day:" + day);
    System.out.println("Month:" + month);
    System.out.println("Date:" + date);
    System.out.println("Year:" + year);
    
    System.out.println("American format:");
    System.out.println(day + "," + month +" " + date + "," + year);

    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);

  }
  
}