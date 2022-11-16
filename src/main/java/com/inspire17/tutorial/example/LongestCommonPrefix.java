package com.inspire17.tutorial.example;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public String longestCommonPrefix(List<String> strings) {
        StringBuffer stringBuffer = new StringBuffer();
        String refString = strings.get(0);
        int pos = 0;
        int maxPos = findMinLen(strings);
        while (pos < maxPos) {
            char c = refString.charAt(pos);
            boolean charCommon = true;
            for (int i = 1; i < strings.size(); i++) {
                if (strings.get(i).charAt(pos) != c) {
                    charCommon = false;
                }
            }
            if (charCommon == true) {
                stringBuffer.append(c);
            }
            pos++;
        }
        return stringBuffer.toString();
    }

    private int findMinLen(List<String> strings) {
        int len = Integer.MAX_VALUE;
        for (String s : strings) {
            if (len > s.length()) {
                len = s.length();
            }
        }
        return len;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        List<String> strings = Arrays.asList("Mr Code", "Mr Cody", "Mr Coder");
        List<String> strings1 = Arrays.asList("geeksforgeeks", "geeks", "geek", "geekzer");
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings1));
    }
}