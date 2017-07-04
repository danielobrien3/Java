import java.util.Scanner;


/** This file contains the declaration of the 
   * Employee abstract data type.
   */
class Employee{

  public Employee(){}

  private double monthlyCost;
  private double hourlyCost;
  private double totalYearlyCost;
  private String name;

  public String getName(){
    return name;
  }
  
  public double getMonthlyCost(){
    return monthlyCost;
  }

  public double getHourlyCost(){
    return hourlyCost;
  }
  
  public double getTotatYearlyCost(){
    return totalYearlyCost;
  }
  
  public void setTotalYearlyCost(double tYear){
    totalYearlyCost = tYear;    
  }
  
  public void setmonthlyCost(double s){
    s = monthlyCost;
  }
  
  public void setHourlyCost(double s){
    s = hourlyCost;
  }

  public void setName(String n){
    name = n;
  }

  public void hourlyToYearly(double hourly){
    totalYearlyCost = hourly * 2080;
  }

  public void monthlyToYearly(double monthly){
    totalYearlyCost = monthly * 12;
  }

  public void yearlyToHourly(double yearly){
    hourlyCost = totalYearlyCost/2080;
  }

  public void yearlyToMonthly(double monthly){
    monthlyCost = totalYearlyCost/12;
  }

  public void addToYearly(double add){
    totalYearlyCost += add;
  }

}

/**
   * file: finalProject.java
   * author: Daniel O'Brien
   * course: CMPT 220
   * assignment: Final Project
   * due date: May 10th, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the 
   * finalProject abstract data type.
   */

public class finalProject {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

    System.out.print("How many employees do you have?: ");
    int numEmployees = input.nextInt();
    //verify number of employees
    while(numEmployees<0){
      System.out.print("You must enter a positive number: ");
      numEmployees = input.nextInt();
    }

    Employee[] crew = new Employee[numEmployees];

    //for loop to gain Employees Information
    for(int i=0; i<crew.length; i++){
      crew[i] = new Employee();
      System.out.print("What is Employee #" + (i+1) +"'s name?: ");
      crew[i].setName(input.next());

      System.out.print("How will " + crew[i].getName() + " be paid? (Enter 1 for Hourly. 2 for Monthly. 3 for Yearly): ");

      // Switch Statement for how the employee will be paid
      int control = input.nextInt();
      System.out.print("How much will " + crew[i].getName() + " be paid?: ");
      double pay = input.nextDouble();
      //verification
      while(pay<0){
        System.out.print("You must enter a positive number. ");
        pay = input.nextDouble();
      }
      switch (control) {
        case 1: 
          crew[i].hourlyToYearly(pay);
          break;

        case 2:
          crew[i].monthlyToYearly(pay);
          break;

        case 3: 
          crew[i].setTotalYearlyCost(pay);
          break;
      }

      //get the employers location, add cost accordingly
      System.out.println("What state does " + crew[i].getName() + " work in? (1 for CT. 2 for ME. 3 for MA. 4 for NH. 5 for NY. 6 for PA. 7 for Rhode island. If the state is temporarily unavailable enter 0) ");
      int state = input.nextInt();
      //verification
      while(state<0 || state>7){
        System.out.println("The number you entered is not listed. Please try again: ");
        state = input.nextInt();
      }
        

      switch(state){
        case 0:
          break;
        case 1: 
          crew[i].addToYearly(1652);
          break;
        
        case 2: 
          crew[i].addToYearly(1279);
          break;

        case 3: 
          crew[i].addToYearly(1590);
          break;

        case 4: 
          crew[i].addToYearly(1575);
          break;

        case 5: 
          crew[i].addToYearly(1503);
          break;

        case 6: 
          crew[i].addToYearly(1174);
          break;

        case 7: 
          crew[i].addToYearly(1499);
          break;
      }

    }

    //for loop to get total hourly and monthly costs
    for(int k=0; k<crew.length; k++){
      crew[k].yearlyToMonthly(crew[k].getTotatYearlyCost());
      crew[k].yearlyToHourly(crew[k].getTotatYearlyCost());
    }

    //for loop to print information
    for(int j=0; j<crew.length; j++){
      System.out.println("The total hourly cost of " + crew[j].getName() + " is $" + Math.round(crew[j].getHourlyCost() * 100.0)/100.0);
      System.out.println("The total monthly cost of " + crew[j].getName() + " is $" + Math.round(crew[j].getMonthlyCost()*100.0)/100.0);
      System.out.println("The total yearly cost of " + crew[j].getName() + " is $" + Math.round(crew[j].getTotatYearlyCost() *100.0)/100.0);
    }

  }
}