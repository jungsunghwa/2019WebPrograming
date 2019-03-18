package kr.hs.dgsw.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    CalculatingService cs;

    @GetMapping("/calculating/{num1}/{operator}/{num2}")
    public int sayHi1(
            @PathVariable int num1,
            @PathVariable String operator,
            @PathVariable int num2) {
        return cs.calculation(num1, operator, num2);
    }
}
