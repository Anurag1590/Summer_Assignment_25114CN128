// code to created a number guessing game.
import java.util.*;
public class Question_101 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int n =0;
        int count =0;
         while(n!=number)
        {
        System.out.print("Guess the number : ");
        n = sc.nextInt();
        count++;
        if(n>number)
        {
            System.out.println("OOPS!! you guessed it too high ");
        }
        else if(n<number)
        {
            System.out.println("OOPS!! you guessed it too low ");
        }
        else
        {
            System.out.println("YAY!! you guessed it correctly in "+count+" attempts");
        }
        }
}
}
