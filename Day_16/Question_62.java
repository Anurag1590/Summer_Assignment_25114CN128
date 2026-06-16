// Code  to find Maximum Frequency element.
import java.util.*;
public class Question_62 {
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
            int max=Integer.MIN_VALUE;
        int element =arr[0];

        for(int i=0;i<n;i++) 
            {
           int count = 0;
            for(int j=0;j<n;j++)
                 {
                if(arr[i] == arr[j])
                     {
                    count++;
                }
            }

            if(count > max) 
                {
                max = count;
                element = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element = " +element+" with frequency "+max);
    }
}

