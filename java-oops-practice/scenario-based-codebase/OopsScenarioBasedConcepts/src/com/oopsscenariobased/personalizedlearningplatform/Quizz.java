package com.oopsscenariobased.personalizedlearningplatform;

class Quiz {
	
	 //attributes
	 private String[] questions;
	 private final int[] answers;
	 private int score;
	 private int difficulty; 

	 // Constructor
	 public Quiz(String[] questions, int[] answers, int difficulty) {
	     this.questions = questions;
	     this.answers = answers;
	     this.difficulty = difficulty;
	 }

	 // calculating score
	 public void evaluate(int[] userAnswers) {
	     score = 0;
	     for (int i = 0; i < answers.length; i++) {
	         if (userAnswers[i] == answers[i]) {
	             score++;
	         }
	     }
	 }

	 // Percentage calculation
	 public double getPercentage() {
	     return (double) score / answers.length * 100;
	 }
}