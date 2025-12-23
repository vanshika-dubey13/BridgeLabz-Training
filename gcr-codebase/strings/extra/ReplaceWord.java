public class ReplaceWord {

	// Method to replace a word in a sentence
	public static String replaceAWord(String sentence, String oldWord, String newWord) {
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(oldWord)) {
				result.append(newWord);
			} else {
				result.append(words[i]);
			}

			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String sentence = "Java is easy and Java is powerful";
		String modified = replaceAWord(sentence, "Java", "Python");

		System.out.println(modified);
	}
}
