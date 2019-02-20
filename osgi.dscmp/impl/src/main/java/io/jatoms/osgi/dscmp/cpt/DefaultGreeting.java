package io.jatoms.osgi.dscmp.cpt;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component
@GreetingText
public class DefaultGreeting {

    @Activate
    void activate(GreetingText greeting){
        System.out.println("### Activate DEFAULTGREETING Start ###");
        System.out.println("\t" + greeting.value());
        System.out.println("### Activate DEFAULTGREETING End ###");
    }
}