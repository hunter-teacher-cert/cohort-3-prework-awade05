import java.io.*;
import java.util.*;

public class Array {
  public static double[] powArray(double[] a, double power){
  double[] aa = new double [a.length];
    for (int i = 0; i < a.length; i = i + 1){ 
      a[i] = Math.pow(a[i], 2.0);
      aa = [i] = Math.pow(a[i], power);
    }
    return aa;
    }
   public static int[] histogram(int[] scores, int count){
     int[] counting = new int[count];
      for (int score : scores) {
      counting[score]++;
}
}
     return counting;
}
  

   
      
    