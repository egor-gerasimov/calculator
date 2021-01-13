package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    private static final String floatRegex = "\\d+(\\.\\d+)?";

    public static float getFirstFloat(String text) {
        float result = 0;
        Pattern p = Pattern.compile(floatRegex);
        Matcher m = p.matcher(text);
        if (m.find()) {
            result = Float.parseFloat(m.group());
        }
        return result;
    }
}
