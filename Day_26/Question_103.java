// Code to create ATM simulation.
import java.util.*;
public class Question_103 {
    public static void main(String[] args) 
        {
            System.out.print("      Welcome to the ATM ");
            System.out.println();
            System.out.print(" 1.Check Balance               2.Cash Withdrawal");
            System.out.println();
            System.out.print(" 3.Cash Deposit                4.Exit");
            int n ;
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter your choice : ");
            n = sc.nextInt();
            switch(n)
            {
             case 1 : System.out.print("Please enter your 4 digit atm pin : ");
             int pin = sc.nextInt();
             System.out.print("Your Current Savings Account balance is ......rupees");
             break;
             case 2 : System.out.print("Please enter your 4 digit atm pin : ");
             pin = sc.nextInt();
             System.out.print("Enter the amount to be withdrawn : ");
             int with = sc.nextInt();
             System.out.print("Amount withdrawn successfully .");
             System.out.println();
             System.out.print("Thank you for using the ATM .");
             break;
             case 3 : System.out.print("Please enter your 4 digit atm pin : ");
             pin = sc.nextInt();
             System.out.print("Enter amount to be deposited : ");
             int depo = sc.nextInt();
             System.out.print("Your cash has been deposited successfully .");
             System.out.println();
             System.out.print("Thank you for using the ATM .");
             break;
             case 4 : System.out.print("Thank you for using our ATM .");
             break;
             default:
             System.out.println("Invalid choice. Please try again.");
            }

        }
    
}
