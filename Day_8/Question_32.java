// Code to print repeated number pattern
import java.util.*;
class Question_32 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
