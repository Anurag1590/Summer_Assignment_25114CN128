import java.util.*;
public class Question_2 {
 public static void main(String [] args)
 {
    int n ;
    int product =1;
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    n = Sc.nextInt();
    for(int i =1;i<=10;i++)
    {
     product = n*i;
     System.out.println(+n+"*"+i+"="+product);
    }
 }   
}
