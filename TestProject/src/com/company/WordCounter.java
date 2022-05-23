package com.company;

public class WordCounter {
    public Integer getWordCount(String text) {
        return text.split("[ \n\t]").length;
    }
}
