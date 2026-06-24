// Code to check string rotation.
import java.util.*;
public class Question_93 {
    public static void main(String[] args)
    {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        s1 = sc.nextLine();
        System.out.print("Enter second string : ");
        s2 = sc.nextLine();
        boolean isRotation =(s1.length()==s2.length()&&(s1 + s1).contains(s2));

        System.out.println(isRotation);
        }
    }

