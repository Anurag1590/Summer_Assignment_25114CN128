// Code to print character triangle 
import java.util.*;
class Question_31 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            char ch = 'A';
            for(int j =1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
