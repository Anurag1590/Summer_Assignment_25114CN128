// Code to sort array using selection sorting.
import java.util.*;
public class Question_70 {
    public static void main(String[] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
        System.out.print("Enter arr["+i+"] : ");
        arr[i] = sc.nextInt();
        }
        for(int i =0;i<n-1;i++)
        {
            int min =i;
            for(int j = i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min =j;
                }
            }
            if(min !=i)
            {
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
        System.out.println("The sorted array is : ");
        for(int i =0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
}
}
