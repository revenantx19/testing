package calc.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTester {

    CalcService calcService = new CalcService();

    @Test
    public void plus() {
        assertEquals(10, calcService.plus(2, 8));
    }

    @Test
    public void minus() {
        assertEquals(-6, calcService.minus(2, 8));
    }
    @Test
    public void multiply() {
        assertEquals(16, calcService.multiply(2, 8));
    }
    @Test
    public void devide() {
        assertEquals(0.25, calcService.devide(2, 8));
    }
    @Test
    public void devideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calcService.devide(5, 0);
        });
        assertEquals("Error", exception.getMessage());
    }

}
