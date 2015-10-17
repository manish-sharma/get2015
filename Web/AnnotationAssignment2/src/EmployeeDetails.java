
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * annotation to create employee details
 * @author Ankur
 *
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeDetails {

	String date_Of_Birth() default "[null]";
	String date_Of_Joining() default "[null]";
	int ctcPerAnnum() default 20000;

}
