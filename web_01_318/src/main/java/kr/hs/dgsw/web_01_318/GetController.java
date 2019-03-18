package kr.hs.dgsw.web_01_318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private GreetingService gs;

    //REQUEST : hostname:port/greeting?name=DGSW
    //RESPONSE : Hello : DSGW
    @GetMapping("/greeting")
    public String sayHi(@RequestParam String name) {
        return "Hello : "+ name;
    }

    //REQUEST : hostname:port/greeting/DGSW
    //RESPONSE : Hello : DSGW
    @GetMapping("/greeting/{name}")
    public String sayHi1(@PathVariable String name) {
        return gs.sayHi(name);
    }

}
