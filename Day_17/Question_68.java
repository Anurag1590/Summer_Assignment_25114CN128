// Code to print common elements in arrays.
import java.util.*;
public class Question_68 {
        public static void main(String[] args) 
            {
              int n1 ;
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter the size of 1st array : ");
              n1=sc.nextInt();
              int n2;
              System.out.print("Enter the size of 2nd array : ");
              n2=sc.nextInt();
              int [] arr1 = new int[n1];
              int [] arr2 = new int[n2];
              for(int i =0;i<n1;i++)
              {
                System.out.print("Enter arr1["+i+"] : ");
                arr1[i] = sc.nextInt();
              }
              for(int i =0;i<n2;i++)
              {
                System.out.print("Enter arr2["+i+"] : ");
                arr2[i] = sc.nextInt();
              }
                for(int i =0;i<n1;i++)
                { 
                    for(int k =0;k<n2;k++)
                    {
                        if(arr1[i]==arr2[k])
                        {
                           System.out.print(" "+arr1[i]);
                        }
                    }
                }
              }
            }