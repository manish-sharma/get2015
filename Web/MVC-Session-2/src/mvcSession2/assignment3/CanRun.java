package mvcSession2.assignment3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// marker Annotation
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface CanRun {

}