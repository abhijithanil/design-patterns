package com.inspire17.tutorial.ds.trie;

import com.inspire17.tutorial.common.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TrieNodeCreator {
    private final TrieNode root;

    public TrieNodeCreator() {
        root = new TrieNode();
    }

    public void insert(char[] arr) {
        TrieNode currentNode = root;
        for (char c : arr) {
            TrieNode node = currentNode.getChildren().get(c);
            if (node == null) {
                node = new TrieNode();
                currentNode.getChildren().put(c, node);
            }
            currentNode = node;
        }
        currentNode.setEndOfWord(true);
    }

    public void recursiveInsert(char[] arr, int index, TrieNode parent) {
        if (index >= arr.length) {
            parent.setEndOfWord(true);
            return;
        }
        char c = arr[index];
        TrieNode node = parent.getChildren().get(c);
        if (node == null) {
            node = new TrieNode();
            parent.getChildren().put(c, node);
        }
        index++;
        recursiveInsert(arr, index, node);
    }

    public static void main(String[] args) throws IOException {
        TrieNodeCreator trieNodeCreator = new TrieNodeCreator();
        final List<String> words = FileReader.readFile("words.txt");
        final List<String> firstHalf = words.subList(0, (words.size() / 2));
        final List<String> secondHalf = words.subList((words.size() / 2) + 1, words.size() - 1);

        for (String w : firstHalf
        ) {
            trieNodeCreator.insert(w.toCharArray());
        }
        for (String w : secondHalf
        ) {
            trieNodeCreator.recursiveInsert(w.toCharArray(), 0, trieNodeCreator.root);
        }

        System.out.println("Processing word completed");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1: Prefix Search \t 2: Word search \t 3: Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter prefix");
                    String inputString = scanner.next();
                    List<String> possibleWords = trieNodeCreator.searchThis(inputString.toCharArray());
                    for (String s : possibleWords) {
                        System.out.println(s);
                    }
                    System.out.println("Total suggest words found - " + possibleWords.size());
                    break;
                case 2:
                    System.out.println("Enter word");
                    String word = scanner.next();
                    Boolean wordExist = trieNodeCreator.searchThis(word);
                    if (wordExist) {
                        System.out.println("Searched word exits");
                    } else {
                        System.out.println("Searched word not found");
                    }
                    break;
                case 3:
                    System.out.println("Thanks for using Trie searcher..");
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private List<String> searchThis(char[] input) {
        return this.search(input, true);
    }

    private Boolean searchThis(String inputString) {
        final List<String> search = search(inputString.toCharArray(), false);
        if (search.size() == 1) {
            return true;
        }
        return false;
    }

    private List<String> search(char[] input, boolean isPrefixSearch) {
        TrieNode currentNode = root;
        StringBuffer stringBuffer = new StringBuffer();
        List<String> possibleWord = new ArrayList<>();
        for (char c : input) {
            stringBuffer.append(c);
            final TrieNode trieNode = currentNode.getChildren().get(c);
            if (trieNode != null) {
                currentNode = trieNode;
            } else {
                return Collections.emptyList();
            }
        }

        if (isPrefixSearch) {
            extractWords(currentNode, stringBuffer, possibleWord);
        } else {
            if (currentNode.isEndOfWord()) {
                possibleWord.add(stringBuffer.toString());
            }
        }
        return possibleWord;
    }

    private void extractWords(TrieNode currentNode, StringBuffer chars, List<String> possibleWord) {
        if (currentNode.isEndOfWord() == true) {
            possibleWord.add(chars.toString());
        }
        if (currentNode.getChildren() == null || currentNode.getChildren().isEmpty()) {
            return;
        }

        final Map<Character, TrieNode> children = currentNode.getChildren();
        children.forEach((k, v) -> {
            extractWords(v, chars.append(k), possibleWord);
            chars.setLength(chars.length() - 1);
        });
    }

}
