package io.jatoms.osgi.dscmp.cpt;

import org.osgi.service.component.annotations.ComponentPropertyType;

@ComponentPropertyType
public @interface GreetingText {
  String value() default "Hello Component Property Types!";
}