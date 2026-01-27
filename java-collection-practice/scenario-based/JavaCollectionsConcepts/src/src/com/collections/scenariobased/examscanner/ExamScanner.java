package src.com.collections.scenariobased.examscanner;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ExamScanner {

    // Regex: student name followed by comma-separated options A-D
    private static final Pattern MATH_PATTERN = Pattern.compile("^[^,]+(,[A-D])+$");
    private static final Pattern SCIENCE_PATTERN = Pattern.compile("^[^,]+(,[A-E])+$");

    public static <T extends AnswerSheet<String>> List<T> readAnswerSheets(String filename, Class<T> type) {
        List<T> sheets = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                // Check for formatting issues
                Pattern pattern = type == MathAnswerSheet.class ? MATH_PATTERN : SCIENCE_PATTERN;
                if (!pattern.matcher(line).matches()) {
                    System.out.println("Formatting error at line " + lineNum + ": " + line);
                    lineNum++;
                    continue;
                }

                String[] parts = line.split(",");
                String studentName = parts[0];
                List<String> answers = Arrays.asList(Arrays.copyOfRange(parts, 1, parts.length));

                T sheet;
                if (type == MathAnswerSheet.class) {
                    sheet = type.cast(new MathAnswerSheet(studentName, answers));
                } else {
                    sheet = type.cast(new ScienceAnswerSheet(studentName, answers));
                }

                sheets.add(sheet);
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sheets;
    }
}
