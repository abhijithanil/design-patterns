package com.inspire17.tutorial.example;

public class FindLastWordLength {
    public int findLastWordLength(final String s) {
        int count = 0;
        int len = s.length();
        int i = 0;
        boolean encounteredNonAlpha = false;
        while (i < len) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (encounteredNonAlpha == true) {
                    count =0;
                    encounteredNonAlpha = false;
                }
                count++;
            } else {
                encounteredNonAlpha = true;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        FindLastWordLength findLastWordLength = new FindLastWordLength();
        System.out.println(findLastWordLength.findLastWordLength("Hello world"));
        System.out.println(findLastWordLength.findLastWordLength("Helloworld"));
        System.out.println(findLastWordLength.findLastWordLength("               Hello world"));
        System.out.println(findLastWordLength.findLastWordLength("               Hello world      "));
        System.out.println(findLastWordLength.findLastWordLength("               Hello world      "));
        System.out.println(findLastWordLength.findLastWordLength("Hello                world      i"));
        System.out.println(findLastWordLength.findLastWordLength("Hello                world     i "));
        System.out.println(findLastWordLength.findLastWordLength("Hello                world     i ****"));
        System.out.println(findLastWordLength.findLastWordLength("Hello                world     i **** test %"));
        System.out.println(findLastWordLength.findLastWordLength("###################abc###########"));
    }
}
