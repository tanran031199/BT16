package baiTap.bt03;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BaiTap03 {
    public static void main(String[] args) {
        try {
            FileReader textFile = new FileReader("src/baiTap/bt03/text.txt");
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

        String[] splitStr = str.trim().split("\\s+");
        System.out.println(Arrays.toString(splitStr));

        Map<String, Integer> map = new HashMap<>();

        for (String s: splitStr) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }

        System.out.println();
        System.out.println("Các phần tử có số lần lặp nhiều hơn 1 là:");
        for (String key: map.keySet()) {
            if(map.get(key) > 1) {
                System.out.println(key + ": " + map.get(key) + " lần");
            }
        }
    }
}
