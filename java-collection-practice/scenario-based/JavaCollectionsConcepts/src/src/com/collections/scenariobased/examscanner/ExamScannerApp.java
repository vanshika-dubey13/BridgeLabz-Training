package src.com.collections.scenariobased.examscanner;

import java.util.List;

import java.util.List;

public class ExamScannerApp {
    public static void main(String[] args) {
        // Example CSV file: math_answers.csv
        // John Doe,A,B,C,D,A,B
        // Jane Smith,B,C,D,A,B,C
        // Invalid line: Mike,A,B,C,D,E,F

        List<String> mathAnswerKey = List.of("A", "B", "C", "D", "A", "B");

        // Read Math answer sheets
        List<MathAnswerSheet> sheets = ExamScanner.readAnswerSheets("math_answers.csv", MathAnswerSheet.class);

        // Calculate scores
        var scores = ScoreCalculator.calculateScores(sheets, mathAnswerKey);

        // Print sorted scores
        ScoreCalculator.printSortedScores(scores);
    }
}




