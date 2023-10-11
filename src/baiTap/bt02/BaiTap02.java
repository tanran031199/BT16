package baiTap.bt02;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class BaiTap02 {
    public static void main(String[] args) {
        try {
            FileReader textFile = new FileReader("src/baiTap/bt02/text.txt");
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

        String[] splitStr = str.trim().split("\n");
        System.out.println(Arrays.toString(splitStr));
        System.out.println("Số lượng dòng trong file text là: " + splitStr.length);
    }
}
