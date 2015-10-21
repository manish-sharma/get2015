package mvcSession2.assignment2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Name :Employee Details
 * @author Gaurav Saini
 * Since: 16-10-2015
 * Description: Employee Details Annotation
 **/

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface EmployeeDetails {
	
	// To Store Employee Date of birth
	String date_Of_Birth() default "[null]";
	
	// To Store Employee date Of joining
	String date_Of_Joining() default "[null]";
	
	// To store ctc Per Annum
	int ctcPerAnnum() default 250000;
}