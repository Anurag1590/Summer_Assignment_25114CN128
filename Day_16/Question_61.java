// Code  to Find missing number in array. 
import java.util.*;
public class Question_61 {
    public static void main(String[] args) {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            n = Sc.nextInt();
           int[] arr = new int[n];
           int pos =-1;
           System.out.println("Enter the array in Ascending order");
           for(int i=0;i<n;i++)
            {
                System.out.print("Enter arr["+i+"] : ");
                arr[i] = Sc.nextInt();
            }
        System.out.print("Missing number : ");
        for(int i = 0; i<n -1; i++) 
            {
            if(arr[i + 1] - arr[i] > 1)
                 {
                for(int j =arr[i] +1; j<arr[i + 1]; j++) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}