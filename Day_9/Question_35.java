// Code to print repeated character pattern
import java.util.*;
class Question_35 {
    public static void main(String[] args) {
        int n ;
        System.out.print("Enter n : ");
        Scanner Sc= new Scanner(System.in);
        n = Sc.nextInt();
        char ch = 'A';
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
