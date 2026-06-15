// Code to move zeros to end.
import java.util.*;
public class Question_60 {
     public static void main(String[] args) {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            n = Sc.nextInt();
            int pos =0;
           int[] arr = new int[n];
           for(int i=0;i<n;i++)
            {
                System.out.print("Enter arr["+i+"] : ");
                arr[i] = Sc.nextInt();
            }
            int end =n;
            for(int i =0;i<end;i++)
            {
                if(arr[i]==0)
                {
                 pos = arr[i];
                for(int j =i;j<end-1;j++)
                {
                arr[j]=arr[j+1];
                }
                arr[end-1]=pos;
                end--;
                i--;
            }
        }

                System.out.println("The new array is : ");
                for(int i=0;i<n;i++) 
                {
                  System.out.print(" "+arr[i]);
                }  
    } 
} 
