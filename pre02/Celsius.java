
import java.util.Scanner;
public class Celsius {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    //Input temperature 
System.out.print("What is the temperature in Celsius: ");
double temperature = in.nextDouble();
double temperatureInF = temperature * 9 / 5 + 32;
System.out.printf("%.1f C = %.1f F", temperature, temperatureInF);   
  }
}
