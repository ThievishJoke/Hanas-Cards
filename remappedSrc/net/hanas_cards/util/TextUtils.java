package net.hanas_cards.util;

import net.minecraft.util.Formatting;

public class TextUtils {
    /**
     * Converts a string to Title Case while preserving Minecraft formatting codes.
     */
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

    /**
     * Extracts the first Minecraft color code (e.g., §a) from the given string.
     * If no color code is found, defaults to white (§f).
     */
    public static String extractColorCode(String input) {
        if (input.startsWith("§")) {
            return input.substring(0, 2); // Get the color code (e.g., §a)
        }
        return "§f"; // Default to white if no color code is found
    }

    /**
     * Removes all Minecraft formatting codes (e.g., §a, §l) from the input string.
     */
    public static String removeFormatting(String input) {
        return input.replaceAll("§[0-9a-fk-or]", "");
    }

    public static Formatting byCode(char code) {
        return switch (code) {
            case '0' -> Formatting.DARK_GRAY;
            case '1' -> Formatting.DARK_BLUE;
            case '2' -> Formatting.DARK_GREEN;
            case '3' -> Formatting.DARK_AQUA;
            case '4' -> Formatting.DARK_RED;
            case '5' -> Formatting.DARK_PURPLE;
            case '6' -> Formatting.GOLD;
            case '7' -> Formatting.GRAY;
            case '8' -> Formatting.DARK_GRAY;
            case '9' -> Formatting.BLUE;
            case 'a' -> Formatting.GREEN;
            case 'b' -> Formatting.AQUA;
            case 'c' -> Formatting.RED;
            case 'd' -> Formatting.LIGHT_PURPLE;
            case 'e' -> Formatting.YELLOW;
            case 'f' -> Formatting.WHITE;
            default -> Formatting.RESET;
        };
    }

}
