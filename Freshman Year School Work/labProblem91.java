/**
   * file: labProblem91.java
   * author: Daniel O'Brien
   * course: CMPT 220
   * assignment: Lab 6
   * due date: March 15th, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the 
   * labProblem91 abstract data type.
   */

import java.util.Scanner;
import java.util.Arrays;

class Rectangle{
  double width = 1;
  double height = 1;

  public double getArea(){
    return (width * height);
  }

  public double getPerimeter(){
    return (2*(width * height));
  }
  

  public Rectangle(double w, double h){
    width = w;
    height = h;
  }

  }

public class labProblem91 {
  
  public static void main(String[] args) {

    Rectangle rectangleOne = new Rectangle(4, 40);
    Rectangle rectangleTwo = new Rectangle(3.5, 35.9);

    System.out.println("The width, height, area, and perimeter of rectangle one is " + rectangleOne.width + 
      " " + rectangleOne.height + " " + rectangleOne.getArea() + " " + rectangleOne.getPerimeter());

    System.out.println("The width, height, area, and perimeter of rectangle two is " + rectangleTwo.width + 
      " " + rectangleTwo.height + " " + rectangleTwo.getArea() + " " + rectangleTwo.getPerimeter());
    

  }

}