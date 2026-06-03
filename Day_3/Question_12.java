//Code to find Lowest Common Multiple of two numbers
import java.util.*;
public class Question_12 {
    public static  void main(String[] args)
    {
        int n1;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = Sc.nextInt();
        System.out.println("");
        int n2;
        System.out.print("Enter second number : ");
        n2 = Sc.nextInt();
        int max = Math.max(n1, n2);
        int lcm = max;

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM of "+n1+" & "+n2+" is "+lcm);
    }
}
