package com.inspire17.tutorial.ds.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public Boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public void setEndOfWord(Boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    private Map<Character, TrieNode> children;
    private Boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}
