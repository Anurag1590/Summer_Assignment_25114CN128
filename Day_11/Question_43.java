// Code  to Write function to check prime.
import java.util.*; 
public class Question_43 {
    public static void main(String[] args)
    {
        int n1;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n1 = Sc.nextInt();
        boolean result = prime(n1);
        if(result==true)
        {
        System.out.println(+n1+" is a prime number"); 
        }
        else
        {
            System.out.println(+n1+" is not a prime number");
        }
}
public static boolean prime(int x)
{
 int c =0;
 for(int i =2;i<=x/2;i++)
 {
    if(x%i==0)
    {
        c++;
        break;
    }
 }
 if(c==0)
    return true;
else
    return false;
}
}
