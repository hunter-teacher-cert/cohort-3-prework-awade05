import java.io.*;
import java.util.*;

//#2
public class Loops{
   public static double squareRoot(double a){
     double x0;
     double x1 = a/2;
     do{
       x0 = x1;
       x1 = (x0 + a/x0)/2;
     } while (Math.abs(x1-x0)>=0.0001);
     return x1;
     }
 public static double power(double x, int n){
      double result = 1;
      for (int i=0;i<n;i++){
         result *= x;
      }
      return result;
   }

  
public static void main (String[]args){

     squareRoot(9);
  
  }
}

//#3

public static double power(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		else if (n > 0) {
			return x*power(x, n - 1);
		}
		else {
			return 1.0/x * power(1.0/x, -n - 1); 
		}
	}


//#4
 public static int factorial(int n){
      int result = 1;
      for (int i=1;i<=n;i++){
         result *=i;
      }
      return result;
   }