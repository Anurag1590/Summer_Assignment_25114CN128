// Code to  Find largest and smallest element. 
import java.util.*;
public class Question_51 {
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
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i =0;i<n;i++)
        {
            if(arr[i]<smallest)
                smallest = arr[i];
        }
           for (int i =0;i<n;i++)
        {
            if(arr[i]>largest)
                largest = arr[i];
        } 
        System.out.println("The largest element of array is : "+largest);
        System.out.println("The smallest element of array is : "+smallest);
        }
        }

