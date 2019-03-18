package kr.hs.dgsw.test00;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Optional;

@RestController
public class GetController {

    @GetMapping("/greeting")
    public int greeting(
            @RequestParam String num1,
            @RequestParam String equation,
            @RequestParam String num2
    ) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        String temp = num1 + equation + num2;

        try {
            return (int) engine.eval(temp);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return 0;
    }
}

