package barath.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("H")
@Service("i18nService")
public class I18nHindiService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Namaste Duniya - H";
    }
}
