package tests;

import com.company.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

    @Test
    public void transformLowerTextToUpperCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "ala ma kota";
        String result = util.transferText(StringUtil.upperCasePipe, testText);

        assertEquals("ALA MA KOTA", result);
    }

    @Test
    public void transformUpperTextToUpperCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "ALA MA KOTA";
        String result = util.transferText(StringUtil.upperCasePipe, testText);

        assertEquals("ALA MA KOTA", result);
    }

    @Test
    public void transformMixedTextToUpperCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA kOta";
        String result = util.transferText(StringUtil.upperCasePipe, testText);

        assertEquals("ALA MA KOTA", result);
    }

    @Test
    public void transformLowerTextToLowerCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "ala ma kota";
        String result = util.transferText(StringUtil.lowerCasePipe, testText);

        assertEquals("ala ma kota", result);
    }

    @Test
    public void transformUpperTextToLowerCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "ALA MA KOTA";
        String result = util.transferText(StringUtil.lowerCasePipe, testText);

        assertEquals("ala ma kota", result);
    }

    @Test
    public void transformMixedTextToLowerCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA kOta";
        String result = util.transferText(StringUtil.lowerCasePipe, testText);

        assertEquals("ala ma kota", result);
    }

    @Test
    public void transformLowerTextToTitleCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "ala ma kota";
        String result = util.transferText(StringUtil.titleCasePipe, testText);

        assertEquals("Ala Ma Kota", result);
    }

    @Test
    public void transformUpperTextToTitleCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "ALA MA KOTA";
        String result = util.transferText(StringUtil.titleCasePipe, testText);

        assertEquals("Ala Ma Kota", result);
    }

    @Test
    public void transformMixedTextToTitleCaseTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA kOta";
        String result = util.transferText(StringUtil.titleCasePipe, testText);

        assertEquals("Ala Ma Kota", result);
    }

    @Test
    public void countWordsInSpaceSeparatedTextTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA kOta";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInSpaceAndEndlineSeparatedTextTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA\n kOta";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInSpaceAndTabSeparatedTextTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA\t kOta";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInMultiSpaceSeparatedTextTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA     mA      kOta";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInTextWithLeadingSpacesTest() {
        StringUtil util = new StringUtil();

        String testText = "      AlA mA kOta";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInTextWithTrailingSpacesTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA mA kOta       ";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInTextWithLeadingAndTrailingSpacesTest() {
        StringUtil util = new StringUtil();

        String testText = "     AlA mA kOta       ";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

    @Test
    public void countWordsInMultiEndlineSeparatedTextTest() {
        StringUtil util = new StringUtil();

        String testText = "AlA\n\n\n mA kOta";
        Integer result = util.getNumberOfWords(testText);

        assertEquals(3, result);
    }

}
