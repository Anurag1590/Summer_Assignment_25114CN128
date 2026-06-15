// Code to rotate array left.
import java.util.*;
public class Question_58 {
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
            int t = arr[0];
            for(int i =1;i<n;i++)
            {
                arr[i-1]=arr[i];
            }
            arr[n-1] = t;
            for(int i =0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
}
}