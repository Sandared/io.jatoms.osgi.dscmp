package io.jatoms.osgi.dscmp.cpt;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component
@GreetingText("Hello old school")
public class OldSchoolGreeting {

    @Activate
    void activate (Map<String, Object> props){
        System.out.println("### Activate OLDSCHOOL Start ###");
        props.forEach((key, value) -> System.out.println("\t" + key + " // " + value));
        System.out.println("### Activate OLDSCHOOL End ###");
    }

}