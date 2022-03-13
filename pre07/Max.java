import java.io.*;
import java.util.*;

public class Max{

  public static int indexOfMax(int[] a){
    int max = a[0];
    for (int i = 0; i < a.length; i++){ 
      if (a[i] > max){
        max = a[i];
      }
    }
    System.out.println("Maximum = "+ max);
    return max;
    
    //You can write this method using an enhaced for loop becasue we are focusing on the value of each index of the array.
  }

  public static int indexOfMaxEnhancedForLoop(int[] a){
    int max = a[0];
    for (int i : a){ 
      if (a[i] > max){
        max = a[i];
      }
    }
    System.out.println("Maximum = "+ max);
    return max;

  }
  
  
  public static void main (String [] args){

    int [] randoms = new int [20];
    for (int i = 0; i < randoms.length; i++){
      randoms[i] = (int) (Math.random()*20);
      System.out.print(randoms[i] + " ");
    }
    System.out.println();
    indexOfMax(randoms);
    System.out.println();
    indexOfMaxEnhancedForLoop(randoms);
  }
}
