// Code to print reverse star pattern
import java.util.*;
class Question_33 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}