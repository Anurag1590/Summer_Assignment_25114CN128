// Code to find pairs with given sum.
import java.util.*;
public class Question_63 {
     public static void main(String[] args) {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            n = Sc.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++)
            {
                System.out.print("Enter arr["+i+"] : ");
                arr[i] = Sc.nextInt();
            } 
            System.out.print("Enter target sum: ");
            int sum = Sc.nextInt();
            System.out.println("Pairs with sum " + sum + " are:");
            for(int i=0;i<n;i++) 
                {
            for(int j=i+1;j<n;j++)
                 {
                if(arr[i]+arr[j]==sum) 
                {
                System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }
}

