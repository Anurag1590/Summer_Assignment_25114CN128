//Code  Find sum and average of array. 
import java.util.*;
public class Question_50 {
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
      int sum =0; 
      for(int i =0;i<n;i++)
      {
        sum = sum + arr[i];
      }
       System.out.println("Sum of array elements is "+sum);   
      
}
}
