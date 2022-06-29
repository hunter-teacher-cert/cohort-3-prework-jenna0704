import java.util.Scanner;
import java.util.Random;

public class Guess{
  
  public static void main(String[] args) {

    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

    Scanner in = new Scanner(System.in);

    int guess;

    System.out.print("Type a number: ");

    guess = in.nextInt();
    in.nextLine();
    
    System.out.println("Your guess is: " + guess);
    
    //pick a random number
    Random random = new Random();
    int number = random.nextInt(100)+1;
  
    System.out.println("The number I was thinking of is: " + number);

    int difference = Math.abs(guess - number);
    
    System.out.println("You were off by: " + difference);
  
}
}

