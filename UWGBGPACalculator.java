// Project 2
// KYU SEUNG SIM
// Dr. Elliot
// COMP SCI 256-0800
// JULY 02, 2020

import java.util.*; 

public class UWGBGPACalculator {

  public static void main(String[] args) {

    int Unit = 0;
    double A = 4.0;
    double B = 3.0;
    double C = 2.0;
    double D = 1.0;
    double F = 0.0;
    double GPApoints = 0;
    double GPAUnits = 0;
    double GPA;

    Scanner user_input = new Scanner(System.in);

    System.out.println("This is UW-Green Bay GPA Calculator ");
    System.out.println();    

    System.out.print("Please Enter Your Total Class Take this Semester: ");
    int newInputClass = user_input.nextInt();
    char[] userGrades = new char[newInputClass];
    System.out.println();        

    for(int userIndex = 0; userIndex < userGrades.length; userIndex += 0) {
      System.out.println("UW-Green Bay provide with A, B, C, D, and F");
      System.out.print("Enter Your Grade: ");

      char newInput = user_input.next().charAt(0);

      if(newInput == 'A'){
        System.out.print("Please Enter Your Class Unit: ");
        int newInputUnit = user_input.nextInt();
        userGrades[userIndex] = newInput;
        userIndex += 1;
        GPApoints += A * newInputUnit; 
        GPAUnits += newInputUnit;
      } else if(newInput == 'B') {
        System.out.print("Please Enter Your Class Unit: ");
        int newInputUnit = user_input.nextInt();
        userGrades[userIndex] = newInput;
        userIndex += 1;
        GPApoints += B * newInputUnit; 
        GPAUnits += newInputUnit;
      } else if(newInput == 'C') {
        System.out.print("Please Enter Your Class Unit: ");
        int newInputUnit = user_input.nextInt();
        userGrades[userIndex] = newInput;
        userIndex += 1;
        GPApoints += C * newInputUnit; 
        GPAUnits += newInputUnit;       
      } else if(newInput == 'D') {
        System.out.print("Please Enter Your Class Unit: ");
        int newInputUnit = user_input.nextInt();
        userGrades[userIndex] = newInput;
        userIndex += 1;
        GPApoints += D * newInputUnit; 
        GPAUnits += newInputUnit;   
      } else if(newInput == 'F') {
        System.out.print("Please Enter Your Class Unit: ");
        int newInputUnit = user_input.nextInt();
        userGrades[userIndex] = newInput;
        userIndex += 1;
        GPApoints += F * newInputUnit; 
        GPAUnits += newInputUnit;   
      } else {
        System.out.println("Wrong Input, Try Again!");       
      }
    }

    GPA = GPApoints / GPAUnits;

    System.out.println("\n\n\n\n");

    System.out.println("UW-Green Bay GPA Result");
    System.out.println("Your Current GPA is " + GPA);
  }
}