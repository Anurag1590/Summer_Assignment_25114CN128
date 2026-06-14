// Code to find Second largest element of array .
import java.util.*;
public class Question55 {
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
           int greatest = Integer.MIN_VALUE;
           int second_greatest = Integer.MIN_VALUE;
           for(int i =0;i<n;i++) 
           {
            if(arr[i]>greatest)
            {
                greatest = arr[i];
            }
            if(arr[i]>second_greatest&&arr[i]!=greatest)
            {
                second_greatest = arr[i];
            }
           }
           System.out.println("The Second greatest element is "+second_greatest);
}
}
