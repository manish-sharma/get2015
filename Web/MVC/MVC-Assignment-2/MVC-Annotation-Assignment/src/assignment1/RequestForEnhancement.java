package assignment1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestForEnhancement {

	int id();
	String synopsis();
	String engineer() default "[unassigned]";
	String date() default "[unknown]";
}
