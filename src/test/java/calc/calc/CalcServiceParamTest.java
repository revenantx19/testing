package calc.calc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcServiceParamTest {
    private CalcService calcService = new CalcService();

    public static Stream<Arguments> paramPlusTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(15, 5, 20),
                Arguments.of(5, -5, 0)
        );
    }
    public static Stream<Arguments> paramMinusTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(15, 5, 10),
                Arguments.of(5, -5, 10)
        );
    }
    public static Stream<Arguments> paramMultiplyTest() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(1, 5, 5),
                Arguments.of(5, -5, -25)
        );
    }
    public static Stream<Arguments> paramDevideTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(15, 5, 3),
                Arguments.of(5, -5, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("paramPlusTest")
    public void plus(float num1, float num2, double result) {
        assertEquals(result, calcService.plus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("paramMinusTest")
    public void minus(float num1, float num2, double result) {
        assertEquals(result, calcService.minus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("paramMultiplyTest")
    public void multiply(float num1, float num2, double result) {
        assertEquals(result, calcService.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("paramDevideTest")
    public void devide(float num1, float num2, double result) {
        assertEquals(result, calcService.devide(num1, num2));
    }


}
