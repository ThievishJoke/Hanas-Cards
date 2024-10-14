package net.hanas_cards.util;

import java.util.HashMap;
import java.util.Map;

public class GradingSystem {
    private static final Map<Integer, String> gradeDescriptions = new HashMap<>();

    static {
        gradeDescriptions.put(1, "Poor");
        gradeDescriptions.put(2, "Fair");
        gradeDescriptions.put(3, "Good");
        gradeDescriptions.put(4, "Very Good");
        gradeDescriptions.put(5, "Excellent");
    }

    public static String getGradeDescription(int grade) {
        return gradeDescriptions.getOrDefault(grade, "Unknown Grade");
    }

    public static boolean isValidGrade(int grade) {
        return gradeDescriptions.containsKey(grade);
    }

    public static void addGradeDescription(int grade, String description) {
        gradeDescriptions.put(grade, description);
    }
}