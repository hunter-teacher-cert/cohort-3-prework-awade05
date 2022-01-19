import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        
      Scanner console = new Scanner(System.in);
      System.out.println("I'm thinking of a number between 1 and 100");
      System.out.println("(including both). Can you guess what it is?");
      System.out.print("Type a number: ");
        
  
        // pick a random number
    
      int guess = console.nextInt();
      Random random = new Random();
      int answer = random.nextInt(100) + 1;
      
      System.out.printf("Your guess is: %d\n", guess);
      System.out.printf("The number I was thinking of is: %d\n", answer);
      System.out.printf("You were off by: %d\n", Math.abs(guess - answer));
    }
}