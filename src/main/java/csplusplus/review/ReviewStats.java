package csplusplus.review;

/**
 * CS++ Units 1–4 Review Lab — ReviewStats
 *
 * Implement each method below. All methods are static utility methods
 * exercising Units 1–4 CED topics (primitives, expressions, Math & String
 * methods, selection, iteration).
 *
 * Replace every `throw new UnsupportedOperationException(...)` with your
 * solution and run `mvn test` to check your work.
 */
public final class ReviewStats {

    private ReviewStats() { /* utility class — no instances */ }

    /**
     * Return the mean of the given star ratings as a double.
     * Ratings are 1..5. An empty array returns 0.0.
     * CED 1.1, 2.6
     */
    public static double averageRating(int[] ratings) {
        throw new UnsupportedOperationException("averageRating not implemented");
    }

    /**
     * Return the number of 5-star ratings in the array.
     * CED 2.7
     */
    public static int countFiveStar(int[] ratings) {
        throw new UnsupportedOperationException("countFiveStar not implemented");
    }

    /**
     * Return the highest rating in the array. An empty array returns -1.
     * CED 2.7
     */
    public static int topRating(int[] ratings) {
        throw new UnsupportedOperationException("topRating not implemented");
    }

    /**
     * Return a label for a 1..5 rating:
     *   1 → "Poor", 2 → "Fair", 3 → "Good", 4 → "Great", 5 → "Excellent".
     * Any other input returns "Invalid".
     * CED 2.3, 2.4
     */
    public static String describeRating(int rating) {
        throw new UnsupportedOperationException("describeRating not implemented");
    }

    /**
     * Return true if the review text contains the word (case-insensitive).
     * CED 1.8, 1.9
     */
    public static boolean containsWord(String review, String word) {
        throw new UnsupportedOperationException("containsWord not implemented");
    }

    /**
     * Return the total length of every review string combined.
     * CED 2.7, 1.9
     */
    public static int totalLength(String[] reviews) {
        throw new UnsupportedOperationException("totalLength not implemented");
    }

    /**
     * Return a NEW array containing the reviews in reverse order.
     * The original array should not be modified.
     * CED 2.7, 2.8
     */
    public static String[] reverseReviewOrder(String[] reviews) {
        throw new UnsupportedOperationException("reverseReviewOrder not implemented");
    }
}
