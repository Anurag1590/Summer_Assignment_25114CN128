// Code to sort name alphabetically.
import java.util.*;
public class Question_99 {
     public static void main(String[] args) 
        {
       int n1 ;
         Scanner sc = new Scanner (System.in);
         System.out.print("Enter the number of names : ");
         n1 = sc.nextInt();
         sc.nextLine();
         String[] name = new String[n1];
         for (int i = 0; i<n1;i++) 
        {
         System.out.print("Enter name "+(i+1)+": ");
         name[i] = sc.nextLine();
        }
         for(int i=0;i<n1 -1;i++)
         {
            for(int j=i+1;j<n1;j++)
            {
            if(name[i].compareToIgnoreCase(name[j])>0)
            {
                String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
            }
            }         
         }
         System.out.print("Names in sorted order are : ");
         for(int i=0;i<n1;i++)
         {
            System.out.println(name[i]);
         }
        }
    }
