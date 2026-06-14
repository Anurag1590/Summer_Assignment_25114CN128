// Code to perform Linear search.
import java.util.*; 
public class Question_53 {
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
            System.out.print("Enter Key element to be searched : ");
            int key = Sc.nextInt();
            for(int i=0;i<n;i++) {
                if(arr[i]==key)
                 {
                      pos = i;
                 }
            }
            if(pos==-1)
                System.out.println("Key element not found");
            else
                System.out.println("Key element is  found at "+pos+" index");
        }
    }
