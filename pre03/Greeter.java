import java.io.*;
import java.util.*;

public class Greeter{

public static void namedGreet(String name){
  System.out.println("Good morning " + name);
}

public static void greet(){
System.out.println("Hey!");
}

  public static void main (String[]args){
    //System.out.println("Hello world!");

    greet();
    greet();
    namedGreet("Alicia");
  }
}