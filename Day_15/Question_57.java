// Code to reverse an array.
import java.util.*;
public class Question_57 {
    public static void main(String[] args) {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            n = Sc.nextInt();
           int[] arr = new int[n];
           int pos =-1;
           for(int i=0;i<n;i++)
            {
                System.out.print("Enter arr["+i+"] : ");
                arr[i] = Sc.nextInt();
            }
             for(int i=0;i<n/2;i++)
             {
               
              int t = arr[i];
              arr[i]= arr[n-i-1];
              arr[n-i-1] = t;
               }
               System.out.println("The reversed array is : ");
             for(int i =0;i<n;i++)
             {
             System.out.print(" "+arr[i]);
             }
    }
}

