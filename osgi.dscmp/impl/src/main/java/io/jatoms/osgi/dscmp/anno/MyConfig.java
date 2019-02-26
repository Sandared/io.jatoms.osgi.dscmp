package io.jatoms.osgi.dscmp.anno;

import org.osgi.service.component.annotations.ComponentPropertyType;

@ComponentPropertyType
public @interface MyConfig {
    String PREFIX_ = "io.jatoms.";
    String value() default "Mindblown!";
}