package dsa.scenariobased;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import java.util.*;

public class ExamProctor {

    //creating a stack to track question navigation
    static Stack<Integer> navigationStack = new Stack<>();
    // creating a hashmap to store answers
    static HashMap<Integer, String> answersMap = new HashMap<>();
    // HashMap for correct answers (for evaluation)
    static HashMap<Integer, String> correctAnswers = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {

        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");

        //displaying menu
        while (true) {
            System.out.println("\n--- Online Exam Proctor ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. Go Back to Previous Question");
            System.out.println("4. Submit Exam");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    visitQuestion();
                    break;
                case 2:
                    answerQuestion();
                    break;
                case 3:
                    goBack();
                    break;
                case 4:
                    submitExam();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // creating a method to visit a question
    public static void visitQuestion() {
        System.out.print("Enter Question ID: ");
        int qid = sc.nextInt();
        navigationStack.push(qid);
        System.out.println("Visited Question " + qid);
    }

    // creating a method to answer a question
    public static void answerQuestion() {
        System.out.print("Enter Question ID: ");
        int qid = sc.nextInt();
        System.out.print("Enter Answer: ");
        String ans = sc.next();
        answersMap.put(qid, ans);
        System.out.println("Answer saved!");
    }

    // creating a method to go back to previous question
    public static void goBack() {
        if (navigationStack.size() > 1) {
            navigationStack.pop();
            System.out.println("Back to Question " + navigationStack.peek());
        } else {
            System.out.println("No previous question!");
        }
    }

    // creating a method to evaluate and submit exam
    public static void submitExam() {
        int score = calculateScore();
        System.out.println("\nExam Submitted!");
        System.out.println("Your Score: " + score + "/" + correctAnswers.size());
    }

    // creating a method to calculate score
    public static int calculateScore() {
    	
        int score = 0;
        for (int qid : correctAnswers.keySet()) {
            if (answersMap.containsKey(qid)) {
                if (answersMap.get(qid).equalsIgnoreCase(correctAnswers.get(qid))) {
                    score++;
                }
            }
        }
        return score;
    }
}
