import java.io.*;
import java.util.*;

public class Array{

  public static double[] powArray(double[] a){
    double[] b = new double [a.length];
    for (int i = 0; i < a.length; i = i + 1){ 
      a[i] = Math.pow(a[i], 2.0);
      b = Arrays.copyOf(a,a.length);
    }
    return b;
    }

  public static double[] powArrayBeta(double[] a, int n){
    double[] b = new double [a.length];
    for (int i = 0; i < a.length; i = i + 1){ 
      a[i] = Math.pow(a[i], n);
      b = Arrays.copyOf(a,a.length);
    }
    return b;
    } 

  public static int histogram(int [] scores, int n){
    int count = 0;
    for (int i = 0; i < scores.length; i++){
      if (scores[i] == n){
        count++;
      }
    }
    System.out.println("Number of " + n + "=" + count);
    return count;
  }
  
  public static void main (String [] args){

    double [] number = new double [3];
    number[0] = 1;
    number[1] = 2;
    number[2] = 3;

    powArrayBeta(number, 3);

    System.out.println(Arrays.toString(number));

    int [] scores = new int [100];
    for (int i = 0; i < scores.length; i++){
      scores[i] = (int) (Math.random()*100);
      System.out.print(scores[i] + " ");
    }
    System.out.println();
    histogram(scores,7);
    
  }
  
  }