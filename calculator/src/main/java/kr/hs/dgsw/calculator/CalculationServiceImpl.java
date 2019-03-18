package kr.hs.dgsw.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculatingService {
    @Override
    public int calculation(int num1, String operator, int num2) {
        if      ("add".equals(operator)) return num1 + num2;
        else if ("sub".equals(operator)) return num1 - num2;
        else if ("div".equals(operator)) return num1 * num2;
        else if ("mul".equals(operator)) return num1 / num2;

        return 0;
    }
}
