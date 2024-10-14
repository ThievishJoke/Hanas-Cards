package net.hanas_cards.util;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class GradingSystem {
    private static final NavigableMap<Float, String> gradeDescriptions = new TreeMap<>();

    static {
        gradeDescriptions.put(1.0f, "Trash");
        gradeDescriptions.put(1.5f, "Soggy");
        gradeDescriptions.put(2.0f, "Fair");
        gradeDescriptions.put(3.0f, "Good");
        gradeDescriptions.put(3.5f, "Really Good");
        gradeDescriptions.put(4.0f, "Excellent");
        gradeDescriptions.put(4.5f, "Mint");
        gradeDescriptions.put(5.0f, "Perfectly Mint");
    }

    /**
     * Retrieves the description for a specific grade.
     * If the grade is 5.0f, returns "Perfectly Mint".
     * If the grade is above 4.5f but below 5.0f, returns "Mint".
     * Otherwise, rounds down to the closest lower or equal grade.
     */
    public static String getGradeDescription(float grade) {
        // Handle special case where grade is exactly 5.0f.
        if (grade == 5.0f) {
            return "Perfectly Mint";
        }

        if (grade < 1.5F)  {
            return "Trash";
        }

        // Handle Mint if grade is above 4.5f.
        if (grade > 4.5f) {
            return "Mint";
        }

        // Use floorEntry to get the closest lower or equal grade.
        var entry = gradeDescriptions.floorEntry(grade);
        return (entry != null) ? entry.getValue() : "Unknown Grade";
    }

    /**
     * Checks if the given grade exists in the predefined map.
     *
     * @param grade the grade to check.
     * @return true if the grade exists, false otherwise.
     */
    public static boolean isValidGrade(float grade) {
        return gradeDescriptions.containsKey(grade);
    }

    /**
     * Adds or updates a grade description.
     *
     * @param grade       the grade to add or update.
     * @param description the description associated with the grade.
     */
    public static void addGradeDescription(float grade, String description) {
        gradeDescriptions.put(grade, description);
    }

    /**
     * Generates a random grade between 1.0 and 5.0 (inclusive),
     * rounded up to the next highest tenth.
     *
     * @return the generated grade as a float.
     */
    public static float generateRandomGrade() {
        float randomGrade = 1.0f + (float) (Math.random() * 4.0);
        return (float) Math.ceil(randomGrade * 10) / 10;
    }
}