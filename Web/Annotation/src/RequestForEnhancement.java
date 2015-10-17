import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * class to create annotation
 * @author Ankur
 *
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestForEnhancement {
	int id();
	String synopsis();
	String engineer() default "[unassigned]";
	String date() default "[unknown]";
}
