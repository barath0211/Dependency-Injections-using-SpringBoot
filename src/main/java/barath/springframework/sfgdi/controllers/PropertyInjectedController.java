package barath.springframework.sfgdi.controllers;

import barath.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;
    @Autowired
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
