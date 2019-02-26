package io.jatoms.osgi.dscmp;

import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class FancyCmp {

    @Activate
    void activate(BundleContext ctx, ComponentContext cmpCtx, Map<String, Object> props) {
        System.out.println("### Hello FancyCmp! ###");
        System.out.println("\tBundleContext: " + ctx);
        System.out.println("\tComponentContext: " + cmpCtx);
        System.out.println("\tProperties: " + props);
    }

    @Deactivate
    void deactivate(BundleContext ctx, ComponentContext cmpCtx, Map<String, Object> props){
        System.out.println("### Bye FancyCmp! ###");
        System.out.println("\tBundleContext: " + ctx);
        System.out.println("\tComponentContext: " + cmpCtx);
        System.out.println("\tProperties: " + props);
    }
}