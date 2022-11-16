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

    public String longestCommonPrefix2(List<String> strings) {
        String s = new String();
        String refString = strings.get(0);
        int pos = 0;
        int maxPos = findMinLen(strings);
        int i = 1;
        while (pos < maxPos && i < strings.size() && refString.charAt(pos) == strings.get(i).charAt(pos)) {
            i++;
            if (i == strings.size()) {
                s = refString.substring(0, pos + 1);
                pos++;
                i = 1;
            }
        }
        return s;
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
        List<String> strings1 = Arrays.asList("geeksforgeeks", "geeks", "geek", "geezer");
        List<String> strings2 = Arrays.asList("ssss", "ssss", "ssse", "ssss");
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings2));
        System.out.println("========");
        System.out.println(longestCommonPrefix.longestCommonPrefix2(strings));
        System.out.println(longestCommonPrefix.longestCommonPrefix2(strings1));
        System.out.println(longestCommonPrefix.longestCommonPrefix2(strings2));
    }
}
