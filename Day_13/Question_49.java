// Code to input and display array
import java.util.*;
public class Question_49 {
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
        System.out.println("The array elements are : ");
        for(int i=0;i<n;i++)
    {
      System.out.print(" "+arr[i]);
    }
}
}
