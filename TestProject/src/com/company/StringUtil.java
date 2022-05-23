package com.company;

public class StringUtil {
    public static LowerCasePipe lowerCasePipe = new LowerCasePipe();
    public static UpperCasePipe upperCasePipe = new UpperCasePipe();
    public static TitleCasePipe titleCasePipe = new TitleCasePipe();
    private WordCounter counter;

    public StringUtil() {
        counter = new WordCounter();
    }

    public String transferText(TextPipe pipe, String text) {
        return pipe.transform(text);
    }

    public Integer getNumberOfWords(String text) {
        return counter.getWordCount(text);
    }
}
