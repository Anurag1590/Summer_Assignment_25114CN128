//Code to print reverse star pyramid
import java.util.*;
public class Question_38 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                 System.out.print(" ");
            }
            for(int j =0;j<2*(n-i)+1;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
}
}