package com.company;

public class UpperCasePipe implements TextPipe {
    @Override
    public String transform(String text) {
        StringBuilder sb = new StringBuilder();
        for (var letter: text.toCharArray())
            sb.append((char)((letter <= 'z' && letter >= 'a') ? letter - 32 : letter));

        return sb.toString();
    }
}
