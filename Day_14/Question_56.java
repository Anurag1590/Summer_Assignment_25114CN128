// Code to o Find duplicates in array.
import java.util.*;
public class Question_56 {
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
             boolean[] visited = new boolean[n];
            for(int i=0;i<n;i++) 
            {
                if (visited[i]) {
                continue;
            }
              int count =1;
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            if(count>1)
            {
           System.out.println("There are "+count+" duplicates of "+arr[i]);
            }
            }
}
}
