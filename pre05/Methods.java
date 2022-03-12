import java.io.*;
import java.util.*;

public class Methods{

  public static boolean isDivisible(int n, int m){

    if (n % m == 0){
      
      System.out.println("True.");
      return true;
      
    }
    else {
      
      System.out.println("False.");
      return false;
      
    }
  }

  public static boolean isTriangle(int x, int y, int z){

    if (x + y <= z){
      System.out.println("Not a triangle.");
      return false;
      
    }
    else if (x + z <= y){
      System.out.println("Not a triangle.");
      return false;
      
    }
    else if (y + z <= x){
      System.out.println("Not a triangle.");
      return false;
      
    }
    else {
      System.out.println("It is a trianlge.");
      return true;
      
    }
  }

  public static int ack(int m, int n){
    if (m == 0){
      return n+1;
    }
    else if (m > 0 && n == 0){
      return ack(m-1, 1);
    }
    else{
      return ack(m-1, ack(m, n-1)); 
    }
  }
  public static void main (String [] args){

    System.out.println("A(1,2)= " + ack(1,2));
  }
}