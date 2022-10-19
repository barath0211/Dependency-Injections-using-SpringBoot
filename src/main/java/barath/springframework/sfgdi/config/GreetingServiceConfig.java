package barath.springframework.sfgdi.config;

import barath.springframework.sfgdi.services.ConstructorGreetingService;
import barath.springframework.sfgdi.services.PropertyInjectedGreetingService;
import barath.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();

            }
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
