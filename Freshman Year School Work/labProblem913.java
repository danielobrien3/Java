/**
   * file: labPRoblem913.java
   * author: Daniel O'Brien
   * course: CMPT 220
   * assignment: Lab 6
   * due date: March 17th, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the 
   * labProblem913 abstract data type.
   */

import java.util.Scanner;
import java.util.Arrays;

class Location{
  public int row;
  public int column;
  public double maxValue;
  
}

public class labProblem913 {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    double[][] array = new double[input.nextInt()][input.nextInt()];

    System.out.print("Enter the array: ");
    for(int k = 0; k<array.length; k++){
      for(int a = 0; a<array[k].length; a++){
        array[k][a] = input.nextDouble();
      }
    }

    Location location = new Location();

    location.row = 0;
    location.column = 0;

    for(int i = 0; i<array.length; i++){
      for (int j = 0; j<array[i].length; j++){
        if(array[i][j] > array[location.row][location.column]){
          location.row = i;
          location.column = j;
        }
      }
    }

    System.out.print("The location of the largest element is " + array[location.row][location.column] + " at (" + location.row + ", " + location.column +")");

  }

}