package com.company;

public class LowerCasePipe implements TextPipe {
    @Override
    public String transform(String text) {
        StringBuilder sb = new StringBuilder();
        for (var letter: text.toCharArray())
            sb.append((char)((letter <= 'Z' && letter >= 'A') ? letter + 32 : letter));

        return sb.toString();
    }
}
