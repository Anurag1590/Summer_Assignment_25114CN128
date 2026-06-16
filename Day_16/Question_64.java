// Code to remove duplicates from array.
import java.util.*;
public class Question_64 {
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
            System.out.println("New Array is : ");
            for(int i=0;i<n;i++) 
                {
             int count = 0;
            for(int j=0;j<i;j++) 
                {
                if(arr[i] == arr[j]) 
                {
                    count++;
                    break;
                }
            }
            if(count == 0) 
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

