package mvcSession2.assignment1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Name: RequestForEnhancement
 * @author Gaurav Saini
 * Since: 16-10-2015
 * Description: annotations are created in this class
 **/

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestForEnhancement {
	// To store id
    int id();
    // To store Synposis
    String synopsis();
    // To store Engineer
    String engineer() default "[unassigned]";
    // To store Date
    String date() default "[unknown]";
}
