package io.jatoms.osgi.dscmp.anno;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class SimpleCmp {

    @Activate
    void activate() {
        System.out.println("### Hello SimpleCmp! ###");
    }

    @Deactivate
    void deactivate(){
        System.out.println("### Bye SimpleCmp! ###");
    }
}