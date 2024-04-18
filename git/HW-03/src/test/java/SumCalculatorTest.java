import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        //given
        calculator = new SumCalculator();
    }

    @Test
    void sumWorksCorrectlyTest() {
        //given
        int input = 3;
        int expected = 6;

        //when
        int result = calculator.sum(input);

        //then
        assertEquals(expected, result);
    }

    @Test
    void sumWorksCorrectlyWithOneTest() {
        //given
        int input = 1;
        int expected = 1;

        //when
        int result = calculator.sum(input);

        //then
        assertEquals(expected, result);
    }

    @Test
    void sumOfZeroThrowsExceptionTest() {
        //given
        int input = 0;

        //then
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(input));
    }

    @AfterEach
    public void afterEach() {
        calculator = null;
    }
}