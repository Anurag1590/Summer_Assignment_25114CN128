// Code to sort arry using bubble sorting.
import java.util.*;
public class Question_69 {
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
        for(int i =1;i<=n-1;i++)
        {
            for(int j =0;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("The sorted array is : ");
        for(int i =0;i<n;i++)
        {
         System.out.print(" "+arr[i]);
        }
}
}
