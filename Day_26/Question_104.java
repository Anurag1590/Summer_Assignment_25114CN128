// Code to create quiz application.
import java.util.*;
public class Question_104 {
    public static void main(String[] args) 
        {
            System.out.println("Welcome to the Quiz application");
            Scanner sc = new Scanner(System.in);
           String[] questions = {
            "1. What is the capital of India?",
            "2. Which keyword is used to create an object in Java?",
            "3. Which method is the entry point of a Java program?",
            "4. Which package contains the Scanner class?",
            "5. Which data type stores whole numbers?"     };
        String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. Chennai", "D. Kolkata"},
            {"A. class", "B. new", "C. static", "D. object"},
            {"A. start()", "B. run()", "C. main()", "D. execute()"},
            {"A. java.io", "B. java.util", "C. java.lang", "D. java.net"},
            {"A. float", "B. double", "C. int", "D. char"}
        };
        char[] answers = {'B', 'B', 'C', 'B', 'C'};
        int score =0;
        for(int i=0;i<5;i++)
        {
            System.out.println("\n" + questions[i]);
            for (int j=0;j<4;j++) 
        {
                System.out.println(options[i][j]);
        }
        
        System.out.print("Enter your answer (A/B/C/D) : ");
        char useranswer = sc.next().charAt(0);
        if (useranswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }
        System.out.println("\n====================");
        System.out.println("Quiz Completed");
        System.out.println("Your Score: " + score + "/" + 5);
        System.out.println("====================");
}
}
