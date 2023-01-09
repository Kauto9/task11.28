package ru.vsu.cs.menshikovnik;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String findElement(String text) {
        String[] str1 = text.split(" ");
        int i = 0;
        List<String> listResult = new ArrayList<>();
        for (String element : str1) {
            char[] ch = element.toCharArray();
            for (char cyrillic : ch) {
                if ((cyrillic >= 'А' && cyrillic <= 'Я') || (cyrillic >= 'а' && cyrillic <= 'я')){
                    for (char latin : ch) {
                        if ((latin >= 'A' && latin <= 'Z') || (latin >= 'a' && latin <= 'z')) {
                            String result = new String(ch);
                            listResult.add(i, result);
                            i++;
                            break;
                        }
                    }
                }
                break;
            }
        }
        String delim = " ";
        return String.join(delim, listResult);
    }
}