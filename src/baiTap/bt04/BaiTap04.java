package baiTap.bt04;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaiTap04 {
    public static void main(String[] args) {
        try {
            FileReader textFile = new FileReader("src/baiTap/bt04/text.txt");
            readFile(textFile);
            textFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(FileReader textFile) throws IOException {
        int c;
        String str = "";

        while ((c = textFile.read()) != -1) {
            str += (char) c;
        }

        List<String> list = new ArrayList<>(Arrays.asList(str.trim().split("\\s+")));
        list.sort(String::compareToIgnoreCase);
        list.forEach(e -> System.out.print(e + " | "));
    }
}
