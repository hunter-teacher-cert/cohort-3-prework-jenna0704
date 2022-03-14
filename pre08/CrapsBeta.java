import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

//users input the number of dice they want to use

public class CrapsBeta{

  public static Random random = new Random();
  
  public static int roll(int rollNumber){
    int randomInt = random.nextInt(rollNumber) + 1;
    return randomInt;
  }

  public static int shoot(int numberOfDice, int maximumOfDice){
    int shootResult = 0;
    for (int i = 0; i < numberOfDice; i++){
      shootResult += roll(maximumOfDice/numberOfDice);
    }
    return shootResult;
  }
  
  public static void round(){
    System.out.println("How many rounds do you want to play?");
    Scanner scanner = new Scanner(System.in);
    int totalRounds = scanner.nextInt();

    System.out.println("How many dice do you want to use?");
    int numberOfDice = scanner.nextInt();
    int maximumOfDice = numberOfDice * 6;
    
    boolean pointStatus = false;
    int pointRule = 0;
    String outcome = "You win!";
    List<Integer>array = new ArrayList<Integer> ();
    int newRoll = 0;
    
    for (int i = 0; i < totalRounds; i++){
      
      int firstShoot = shoot(2, 12); 
      array.add(firstShoot);
    
      if (firstShoot == 2 || firstShoot == 3 || firstShoot == 12){
        outcome = "You lose!";
      }
        
      else if (firstShoot == 7 || firstShoot == 11){
        outcome = "You win!";
      }
           
      else {
        pointRule = firstShoot;
        pointStatus = true;

        while (pointStatus == true){
          newRoll = shoot(numberOfDice, maximumOfDice);
          array.add(newRoll);

          if (newRoll == pointRule){
            outcome = "You win!";
            pointStatus = false;
          }

          else if (newRoll == 7){
            outcome = "You lose!";
            pointStatus = false;
          }
        }
      }

      System.out.println("Round " + (i + 1) + ": " + array + " " + outcome);
      array.clear();
      }
    
      scanner.close();
      }
        
  
  public static void main(String [] args){

    round();
    
  }

  }
  