// Code to search number using binary search.
import java.util.*;
public class Question_71 {
    public static void main(String[] args)
    {
        int n ;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array is ascending order ");
        for(int i =0;i<n;i++)
        {
        System.out.print("Enter arr["+i+"] : ");
        arr[i] = sc.nextInt();
        }
        System.out.print("Enter Searching element : ");
        key = sc.nextInt();
        int pos =-1;
        int beg =0;
        int end = n-1;
        int mid ;
        while(beg<=end)
        {
            mid = (beg+end)/2;
         if(key == arr[mid])
         {
            pos = mid;
            break;
         }
         else if(key>arr[mid])
         {
            beg = mid+1;
         }
         else
         {
            end = mid-1;
         }
        }
        if(pos!=-1)
        {
          System.out.println("Searching element found at "+pos+" position");
        }
        else 
            System.out.println("Searching element not found");
    }
}
