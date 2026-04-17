package csplusplus.review;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReviewStatsTest {

    @Test
    void averageRating_basic() {
        assertEquals(3.0, ReviewStats.averageRating(new int[]{1, 2, 3, 4, 5}), 1e-9);
    }

    @Test
    void averageRating_empty() {
        assertEquals(0.0, ReviewStats.averageRating(new int[]{}), 1e-9);
    }

    @Test
    void averageRating_single() {
        assertEquals(4.0, ReviewStats.averageRating(new int[]{4}), 1e-9);
    }

    @Test
    void countFiveStar_some() {
        assertEquals(3, ReviewStats.countFiveStar(new int[]{5, 3, 5, 2, 5}));
    }

    @Test
    void countFiveStar_none() {
        assertEquals(0, ReviewStats.countFiveStar(new int[]{1, 2, 3, 4}));
    }

    @Test
    void topRating_normal() {
        assertEquals(5, ReviewStats.topRating(new int[]{1, 3, 5, 2}));
    }

    @Test
    void topRating_empty() {
        assertEquals(-1, ReviewStats.topRating(new int[]{}));
    }

    @Test
    void describeRating_labels() {
        assertEquals("Poor", ReviewStats.describeRating(1));
        assertEquals("Fair", ReviewStats.describeRating(2));
        assertEquals("Good", ReviewStats.describeRating(3));
        assertEquals("Great", ReviewStats.describeRating(4));
        assertEquals("Excellent", ReviewStats.describeRating(5));
    }

    @Test
    void describeRating_invalid() {
        assertEquals("Invalid", ReviewStats.describeRating(0));
        assertEquals("Invalid", ReviewStats.describeRating(6));
        assertEquals("Invalid", ReviewStats.describeRating(-1));
    }

    @Test
    void containsWord_caseInsensitive() {
        assertTrue(ReviewStats.containsWord("The product is AMAZING", "amazing"));
        assertTrue(ReviewStats.containsWord("terrible value", "Terrible"));
        assertFalse(ReviewStats.containsWord("good product", "bad"));
    }

    @Test
    void totalLength_basic() {
        assertEquals(3 + 5 + 1, ReviewStats.totalLength(new String[]{"abc", "hello", "x"}));
    }

    @Test
    void totalLength_empty() {
        assertEquals(0, ReviewStats.totalLength(new String[]{}));
    }

    @Test
    void reverseReviewOrder_basic() {
        String[] in = {"a", "b", "c"};
        String[] out = ReviewStats.reverseReviewOrder(in);
        assertArrayEquals(new String[]{"c", "b", "a"}, out);
        // original untouched
        assertArrayEquals(new String[]{"a", "b", "c"}, in);
    }

    @Test
    void reverseReviewOrder_empty() {
        assertArrayEquals(new String[]{}, ReviewStats.reverseReviewOrder(new String[]{}));
    }
}
