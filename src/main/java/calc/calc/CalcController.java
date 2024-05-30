package calc.calc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping(path = "/plus")
    public float plus(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return calcService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public float minus(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return calcService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public float multiply(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return calcService.multiply(num1, num2);
    }
    @GetMapping(path = "/devide")
    public float devide(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return calcService.devide(num1, num2);
    }

}
