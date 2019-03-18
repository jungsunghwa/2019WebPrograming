package kr.hs.dgsw.web_01_318;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name) {
        return "Hello " + name;
    }
}
