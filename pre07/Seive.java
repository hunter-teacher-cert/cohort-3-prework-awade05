public class Seive{
public static boolean[] sieve(int n){
      boolean[] prime = new boolean[n];
      for (int i=2;i<n;i++)
         prime[i] = true;
      for (int number=2;number<=(int)Math.sqrt(n);number++){
         if (prime[number] == true){
            for (int index = number*number;index < n;index += number){
               prime[index] = false;
            }
         }
      }
      return prime;
   }
}

 
    