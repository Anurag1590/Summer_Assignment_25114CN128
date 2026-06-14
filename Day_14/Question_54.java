// Code  to print Frequency of an element.
import java.util.*;
public class Question_54 {
    public static void main(String[] args) {
            int n;
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            n = Sc.nextInt();
            int count =0;
           int[] arr = new int[n];
           for(int i=0;i<n;i++)
            {
                System.out.print("Enter arr["+i+"] : ");
                arr[i] = Sc.nextInt();
            } 
            System.out.print("Enter element : ");
            int key = Sc.nextInt();
            for(int i=0;i<n;i++) 
            {
                if(arr[i]==key)
                    count++;
            }
            System.out.println("Frequency of "+key+" is "+count);
    }
}
