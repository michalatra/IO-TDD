package com.company;

public class WordCounter {
    public Integer getWordCount(String text) {
        var textLines = text.split("\n");
        int wordCount = 0;
        for (var line: textLines) {
            var l = line.trim();
            if (l.length() > 0) {
                var wordArr = l.split("[ \t]");
                for (var word: wordArr) {
                    if (word.length() > 0) {
                        wordCount++;
                    }
                }
            }
        }

        return wordCount;
    }
}
