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
    for(i = 0; i < numDice; i++){
      shootDice += roll(maxOfDice/numDice);
    }
    return shootDice;
  }

  



  
  public static void main(String[] args) {
   
    } 
}