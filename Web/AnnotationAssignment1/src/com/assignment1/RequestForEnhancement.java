package com.assignment1;

public @interface RequestForEnhancement {

	int id();

	String synopsis();

	String engineer() default "[unassigned]";

	String date() default "[unknown]";

}

