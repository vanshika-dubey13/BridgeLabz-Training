package com.oopsscenariobased.personalizedlearningplatform;

import java.util.Arrays;
import java.util.List;
public class PersonalizedLearningMain {
	 public static void main(String[] args) {

	     Learner l1 = new Learner("Aarav", "aarav@gmail.com", 101, true);
	     Learner l2 = new Learner("Meera", "meera@gmail.com", 102, false);

	     String[] questions = {
	         "What is Java?",
	         "What is OOP?"
	     };

	     int[] correctAnswers = {1, 2};

	     Quiz quiz = new Quiz(questions, correctAnswers, 2);

	     int[] userAnswers = {1, 2};
	     quiz.evaluate(userAnswers);

	     System.out.println("Quiz Score Percentage: " + quiz.getPercentage());

	     l1.generateCertificate();
	     l2.generateCertificate();
	 }
}
