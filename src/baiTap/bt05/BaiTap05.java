package baiTap.bt05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaiTap05 {
    public static void main(String[] args) {
        try {
            String filePath = "src/baiTap/bt05/text.txt";
            String content = readFileContent(filePath);

            String[] words = content.split("\\s+");

            List<String> maxLengthWords = findMaxLengthWords(words);

            for (String word : maxLengthWords) {
                System.out.println(word + " có độ dài là: " + word.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileContent(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        }
        return content.toString();
    }

    private static List<String> findMaxLengthWords(String[] words) {
        int maxLength = 0;
        List<String> maxLengthWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxLengthWords = new ArrayList<>();
                maxLengthWords.add(word);
            } else if (word.length() == maxLength) {
                maxLengthWords.add(word);
            }
        }

        return maxLengthWords;
    }
}
