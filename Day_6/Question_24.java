//Code to caluate power without using any predefined function.
import java.util.*;

public class Question_24 {
    
      public static void main(String[] args)
    {
        int x;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        x = Sc.nextInt();
        System.out.println("");
        int n;
        int result =1;
        System.out.print("Enter the Power: ");
        n =  Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
          result = result*x;
        }
        System.out.println(+x+" raised to the power "+n+" equals "+result);
}
}
