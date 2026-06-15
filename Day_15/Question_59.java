// Code to rotate array right.
import java.util.*;
public class Question_59 {
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
            int t = arr[n-1];
            for(int i =n-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0] = t;
            for(int i =0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
}
}
