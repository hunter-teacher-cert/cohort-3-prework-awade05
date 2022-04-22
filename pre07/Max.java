import java.io.*;
import java.util.*;

public class Max{

   public static int indexOfMax(int[] num){
      int index = 0;
      for (int i=1;i<num.length;i++){
         if (num[i] > num[index]){
            index = i;
         }
      }
      return index;
   }

   public static int indexOfMaxWrittenInEnhancedForLoop(int[] num){
      int index = 0;
      int i = 0;
      for (int number:num){
         if (num[i] > num[index]){
            index = i;
         }
         i++;
      }
      return index;
   }
  
}



