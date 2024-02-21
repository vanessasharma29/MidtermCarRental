/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermcarrental;

import java.util.Scanner;

/**
 * A class that models a car rental portal.
 * Users can sign up to rent a car but must meet minimum 
 * requirements in order to rent the car.
 * Do not worry about the functionality (it does not have full functionality)
 * Only worry about the design for the exam.
 * @author dancye, 2023
 * @modifier Vanessa Sharma
 */
public class MidtermCarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the Software Fundamentals Car Rental System");
       System.out.println("Please enter the following questions to proceed with creating an account:");
       System.out.println("Please enter your last name: ");
       String lastName = sc.nextLine();
       System.out.println("Please enter your first name: ");
       String firstName = sc.nextLine();
       System.out.println("Please enter your year of birth:");
       int birthYear = sc.nextInt();
       if(2023-birthYear <21)
       {
           System.out.println("I'm sorry but you must be at least 21 in order to create an account");
       }
       else
       {
           Customer newCustomer = new Customer(lastName, firstName, birthYear);
           System.out.println("Account cerated, let's get a car for you...");
           //note that this is as far as the code is meant to go for the midterm question!
       }
       
    }
    
}
