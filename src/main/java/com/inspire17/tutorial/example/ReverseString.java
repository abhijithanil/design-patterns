package com.inspire17.tutorial.example;

public class ReverseString {
    class Stack {
        char[] stack;
        int stackLength;

        public Stack(int size) {
            stack = new char[size];
            stackLength = 0;
        }

        public void push(char c) throws Exception {
            if (stackLength > stack.length - 1) {
                throw new Exception("Stack size exceeded");
            } else {
                stack[stackLength] = c;
                stackLength++;
            }
        }

        public char pop() throws Exception {
            if (stackLength <= 0) {
                throw new Exception("No more element in stack");
            }
            char poppedChar = stack[stackLength - 1];
            stackLength--;
            return poppedChar;
        }
    }


    public String reverseString(String s) throws Exception {
        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.toString();
    }


    public String simpleReverse(String s) throws Exception {
        char[] rev = new char[s.length()];
        for (int i = s.length(), j = 0; i > 0; i--, j++) {
            rev[j] = s.charAt(i - 1);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < rev.length; i++) {
            stringBuffer.append(rev[i]);
        }
        return stringBuffer.toString();
    }

    public String recursiveReverse(String s) {
        StringBuffer revBuffer = new StringBuffer();
        recursiveReverse(s.length() - 1, s, revBuffer);
        return revBuffer.toString();
    }

    public void recursiveReverse(int pos, String s, StringBuffer revBuffer) {
        if (pos > -1) {
            revBuffer.append(s.charAt(pos));
            recursiveReverse(pos - 1, s, revBuffer);
        } else {
            return;
        }
    }

    public String inbuiltStackForReverse(String s) {
        java.util.Stack<Character> stack = new java.util.Stack();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) throws Exception {
        ReverseString reverseString = new ReverseString();
        System.out.println("Reserve using stack");
        System.out.println(reverseString.reverseString("hello world, this is my stack example"));
        System.out.println(reverseString.reverseString("amma"));
        System.out.println("Reserve using two pointers");
        System.out.println(reverseString.simpleReverse("hello world, this is my stack example"));
        System.out.println(reverseString.simpleReverse("amma"));
        System.out.println("Reserve using recursion");
        System.out.println(reverseString.recursiveReverse("hello world, this is my stack example"));
        System.out.println(reverseString.recursiveReverse("amma"));
        System.out.println("Reserve using java util stack");
        System.out.println(reverseString.inbuiltStackForReverse("hello world, this is my stack example"));
        System.out.println(reverseString.inbuiltStackForReverse("amma"));
    }
}
