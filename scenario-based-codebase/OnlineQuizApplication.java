//Creating a class to Ask 5 questions (MCQs) from a user.

import java.util.Scanner;
public class OnlineQuizApplication {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Creating questions array
        	String[] questions = {
            	"1. Java does not allows which of the feature of Object oriented Programming?",
            	"2. Which keyword is used to inherit a class in Java?",
            	"3. What is the size of int in Java?",
            	"4. Which method is the entry point of a Java program?",
            	"5. Which of these is not a Java feature?"
        	};

 		//Creating a 2d array for storing options
        	String[][] options = {
            	{"A. Encapsulation", "B. Multiple Inheritance", "C. Polymorphism", "D. Abstraction"},
            	{"A. this", "B. super", "C. extends", "D. implements"},
            	{"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. Depends on OS"},
            	{"A. start()", "B. main()", "C. run()", "D. init()"},
            	{"A. Object-oriented", "B. Platform independent", "C. Use of pointers", "D. Secure"}
        	};

        	// Creating an array to store correct answers
        	char[] answers = {'B', 'C', 'B', 'B', 'C'};
		//tracking score 
        	int score = 0;
        	System.out.println("Welcome to the Java Online Quiz!\n");
        	// Looping through questions
        	for (int i = 0; i < questions.length; i++) {
            		System.out.println(questions[i]);
            	for (int j = 0; j < 4; j++) {
                	System.out.println(options[i][j]);
            	}

            	System.out.print("Enter your answer (A/B/C/D): ");
            	char userAnswer = sc.next().toUpperCase().charAt(0);

            	// Switch for answer checking
            	switch (userAnswer) {
                	case 'A':
                	case 'B':
                	case 'C':
                	case 'D':
                    	if (userAnswer == answers[i]) {
                        	System.out.println(" Correct!\n");
                        	score++;
                    	} else {
                        	System.out.println("Wrong! Correct answer: " + answers[i] + "\n");
                    	}
                    	break;

                	default:
                    		System.out.println("Invalid choice! No marks awarded.\n");
            		}
        	}

        	System.out.println("Quiz Completed!");
        	System.out.println("Your Score: " + score + " / " + questions.length);

        	sc.close();
    	}
}
