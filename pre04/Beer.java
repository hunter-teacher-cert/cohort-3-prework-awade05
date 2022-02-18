import java.io.*;
import java.util.*;

public class beer{
  public static void main(String args[])
    {
    String s = "s";
    for (int beers = 99; beers > -1;)
      {
      System.out.print(beers + " bottle" + s + " of beer on the wall, ");
      System.out.println(beers + " bottle" + s + " of beer, ");
      if (beers==0)
        {
        System.out.print("No bottles of beer on the wall, no bottles of beer,\n ");
        System.out.println(" ya’ can’t take one down, ya’ can’t pass it around,\n ’cause there are no more bottles of beer on the wall!.\n");
        System.exit(0);
        }
      else
        System.out.print("Take one down, pass it around, ");
      s = (--beers == 1)?"":"s";
      System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
      }
    }
}