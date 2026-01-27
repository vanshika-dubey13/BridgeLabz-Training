package src.com.collections.scenariobased.examscanner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ScoreCalculator {

    public static <T extends AnswerSheet<String>> Map<String, Integer> calculateScores(
            List<T> sheets, List<String> answerKey) {
        Map<String, Integer> scores = new HashMap<>();

        for (T sheet : sheets) {
            List<String> answers = sheet.getAnswers();
            int score = 0;
            for (int i = 0; i < answers.size() && i < answerKey.size(); i++) {
                if (answers.get(i).equalsIgnoreCase(answerKey.get(i))) {
                    score++;
                }
            }
            scores.put(sheet.getStudentName(), score);
        }

        return scores;
    }

    // Sort scores using PriorityQueue
    public static void printSortedScores(Map<String, Integer> scores) {
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue() // descending
        );
        pq.addAll(scores.entrySet());

        System.out.println("Sorted Scores:");
        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
