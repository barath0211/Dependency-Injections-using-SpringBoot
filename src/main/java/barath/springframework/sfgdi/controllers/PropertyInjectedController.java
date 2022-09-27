package barath.springframework.sfgdi.controllers;

import barath.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
