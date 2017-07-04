/**
   * file: labPRoblem1017.java
   * author: Daniel O'Brien
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 19th, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the 
   * labProblem1017 abstract data type.
   */


import java.math.BigInteger;


public class labProblem1017 {
  
  public static void main(String[] args) {
    
    long maxLongSquare= (long) Math.sqrt(Long.MAX_VALUE);

    for(int i = 1; i < 10; i++){
      getSquare(i, maxLongSquare);
      System.out.println("    ");
    }

  }

  public static void getSquare(long counter, long maxLongSquare){
    maxLongSquare += counter;
    BigInteger temp = BigInteger.valueOf(maxLongSquare);
    BigInteger square = temp.pow(2);
    String s = square.toString();
    System.out.print(s);
  }
}
