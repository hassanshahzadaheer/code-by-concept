package HashMap;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "Java is an oop programming language. Java is an amazing";
        String[] words = input.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {

            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }

        }



        for (String word: wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word) );
        }
    }
}