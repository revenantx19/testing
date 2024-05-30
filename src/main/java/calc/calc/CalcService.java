package calc.calc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {


    public float plus(float num1, float num2) {
        return num1 + num2;
    }

    public float minus(float num1, float num2) {
        return num1 - num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public float devide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Error");
        }
        return num1 / num2;
    }

}
