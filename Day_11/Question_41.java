// Code to print sum of two numbers using function.

import java.util.Scanner;

public class Question_41 {

    public static void main(String[] args)
    {
        double n1;
        double n2;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = Sc.nextDouble();
        System.out.println();
        System.out.print("Enter second number : ");
        n2 = Sc.nextDouble(); 
        double s =0.0;
        s = sum(n1,n2);
        System.out.println("Sum of "+n1+" and "+n2+" is "+s);
    }
    public static double sum(double x1,double x2)
    {
      return x1+x2;
    }

}