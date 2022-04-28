import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Craps {
public static Random randomNumbers = new Random();
  
 //roll dice to get random number
  public static int roll (int numRoll){
   int randomNum = randomNumbers.nextInt(numRoll) + 1;
   return randomNum;

 }

  //
  public static int shoot (int numDice, int maxOfDice){
    int shootDice = 0;
    for(int i = 0; i < numDice; i++){
      shootDice += roll(maxOfDice/numDice);
    }
    return shootDice;
  }

  public static void round(){
     int point = shoot(2, 6);
    if (point == 2 || point == 3 || point == 12){
      System.out.println("   You rolled a " + point + " Craps so you lose");
    }else if (point == 7 || point == 11){
      System.out.println("   You rolled a " + point + " that is a Natural so you win");
    } 
    else {
      System.out.println("   You rolled a " + point + " so that is the Point");
      int point2 = shoot(2, 6);
      while (point2 != point && point2 != 7){
        System.out.println("   You rolled a " + point2 + " which is not the Point or 7 so you must roll again");
        point2 = shoot(2, 6);
      }
      
      if (point2 == point ){
        System.out.println("   You rolled an " + point2 + " which is the Point so you win");
      }
      else if( point2 == 7){
        System.out.println("   You rolled a 7 so you lose");
      }
    }

    }
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    System.out.println("How many rounds would you like to play?");
    int numRounds = in.nextInt();
    for (int i = 0; i < numRounds; i++){
      System.out.println("round " + (i+1) + ":");
      round();
    } 
}
}