package io.jatoms.osgi.dscmp;

import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
@MyConfig
public class SuperDuperFancyCmp {

    // Acitvate is used on a consturctor instead of a method!
    @Activate
    public SuperDuperFancyCmp(BundleContext ctx, ComponentContext cmpCtx, Map<String, Object> props, MyConfig config) {
        System.out.println("### Hello SuperDuperFancyCmp! ###");
        System.out.println("\tBundleContext: " + ctx);
        System.out.println("\tComponentContext: " + cmpCtx);
        System.out.println("\tProperties: " + props);
        System.out.println("\tConfiguration: " + config.value());
    }

    @Deactivate
    void deactivate(BundleContext ctx, ComponentContext cmpCtx, Map<String, Object> props, MyConfig config){
        System.out.println("### Bye SuperDuperFancyCmp! ###");
        System.out.println("\tBundleContext: " + ctx);
        System.out.println("\tComponentContext: " + cmpCtx);
        System.out.println("\tProperties: " + props);
        System.out.println("\tConfiguration: " + config.value());
    }
}