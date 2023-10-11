package baiTap.bt01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BaiTap01 {
    public static void main(String[] args) throws IOException {
        FileReader textFile = new FileReader("src/baiTap/bt01/text.txt");
        readFile(textFile);
        textFile.close();
    }

    public static void readFile(FileReader textFile) throws IOException {
        int c;
        String str = "";

        while ((c = textFile.read()) != -1) {
            str += (char) c;
        }

        String[] splitStr = str.trim().split("\\s+");
        System.out.println(Arrays.toString(splitStr));
        System.out.println("Số lượng từ trong file text là: " + splitStr.length);
    }
}
