package InterviewBit.src.Courses.Programming.Level3_Strings.Problems.StringMath.IntegerToRoman.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {
    
    Solution solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void TrivialCase1() {
        int input = 14;
        assertTimeout(Duration.ofMillis(500), () -> {
            String expected = "XIV";
            String actual = Solution.intToRoman(input);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        int input = 5;
        assertTimeout(Duration.ofMillis(500), () -> {
            String expected = "V";
            String actual = Solution.intToRoman(input);
            assertEquals(expected, actual);
        });
    }
}