package net.hanas_cards.util;

public class TextUtils {
    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;
        boolean formattingCode = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '§') {
                titleCase.append(c);
                formattingCode = true;
                continue;
            }

            if (formattingCode) {
                titleCase.append(c);
                formattingCode = false;
                continue;
            }

            if (nextTitleCase && !Character.isWhitespace(c) && c != '(' && c != ')') {
                titleCase.append(Character.toTitleCase(c));
                nextTitleCase = false;
            } else {
                titleCase.append(Character.toLowerCase(c));
            }

            if (Character.isWhitespace(c) || c == '(' || c == ')') {
                nextTitleCase = true;
            }
        }

        return titleCase.toString();
    }
}
