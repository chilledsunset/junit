import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testPlus() {
        int a = 7, b = 12, expected = 19;
        int result = calculator.plus(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        int a = 211, b = 52, expected = 159;
        int result = calculator.minus(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testYmn() {
        int a = 5, b = 12, expected = 60;
        int result = calculator.ymn(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDelenie() {
        int a = 11, b = 2, expected = 5;
        int result = calculator.delen(a, b);
        assertEquals(expected, result);
    }

}
