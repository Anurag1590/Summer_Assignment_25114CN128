 // Code to Count even and odd elements.
import java.util.*;
public class Question_52 {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the size of array : ");
        n = Sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.print("Enter arr["+i+"] : ");
            arr[i] = Sc.nextInt();
        }
        int NumberOfEven =0;
        int NumberOfOdd =0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]%2==0)
                NumberOfEven++;
            else 
                NumberOfOdd++;
        }
        System.out.println("The number of Even Elements are "+NumberOfEven);
        System.out.println("The number of Odd Elements are "+NumberOfOdd);
    }
}

