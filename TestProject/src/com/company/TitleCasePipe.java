package com.company;

public class TitleCasePipe implements TextPipe {
    @Override
    public String transform(String text) {
        StringUtil util = new StringUtil();
        text = util.transferText(new LowerCasePipe(), text);

        StringBuilder sb = new StringBuilder();
        var textArr =  text.split(" ");

        for (var word: textArr)
            sb.append(capitalize(word) + " ");

        return sb.substring(0, sb.length() - 1);
    }

    private String capitalize(String str) {
        var strArr = str.toCharArray();
        if (strArr[0] <= 'z' && strArr[0] >= 'a')
            strArr[0] = (char)(strArr[0] - 32);

        return new String(strArr);
    }

}
