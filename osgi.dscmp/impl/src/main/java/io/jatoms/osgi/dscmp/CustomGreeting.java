package io.jatoms.osgi.dscmp;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component
@GreetingText("Hello Custom World!")
public class CustomGreeting {

    @Activate
    void activate (GreetingText greeting){
        System.out.println("### Activate CUSTOMGREETING Start ###");
        System.out.println("\t" + greeting.value());
        System.out.println("### Activate CUSTOMGREETING End ###");
    }

}
