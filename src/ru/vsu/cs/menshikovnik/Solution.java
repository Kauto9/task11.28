package ru.vsu.cs.menshikovnik;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String findElement(String text) {
        String[] str1 = text.split(" ");
        int i = 0;
        char[] ch;
        List<String> end = new ArrayList<>();
        for (String element : str1) {
            ch = element.toCharArray();
            for (char c : ch) {
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                    String result = new String(ch);
                    end.add(i, result);
                    i++;
                }
            }
        }
        String delim = " ";
        return String.join(delim, end);
    }
}