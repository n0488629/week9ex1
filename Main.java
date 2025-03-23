import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner object
      System.out.println("Interest Calculator Program");
      System.out.println("What is the principal amount of the loan in dollars?");
      int loan = myObj.nextInt(); // read user input
      System.out.println("What is the interest rate (input 0.05 for 5%)?");
      double interest = myObj.nextDouble(); // read user input
      System.out.println("What is period of loan in years?");
      int years = myObj.nextInt(); // read user input

      double total = loan * interest * years; // calculate total
      System.out.println("Total interest of Loan: " + total + " dollars."); // output total to user

      myObj.close(); // close scanner object
    }
  }
