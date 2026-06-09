// Code to print reverse number
import java.util.*;
class Question_34 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        { 
            int k = 1;
            for(int j =n;j>=i;j--)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
