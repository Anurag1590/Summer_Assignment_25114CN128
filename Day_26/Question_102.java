// Code to create voting eligibility.
import java.util.*;
public class Question_102 {
    public static void main(String[] args) 
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("Congratulations , you are eligible for voting");
        }
        else
        {
             System.out.println("Sorry , you are not eligible for voting . But you can vote after "+(18-age)+" years or "+(216-(age*12))+" months or "+(6570-(age*365))+" days.");
        }
    }
}
