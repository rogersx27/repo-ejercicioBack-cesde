package org.example.helpers.generals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

    public boolean validateRegex(String input, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (!matcher.matches()) {
            return false;
        } else {
            return true;
        }
    }
}
