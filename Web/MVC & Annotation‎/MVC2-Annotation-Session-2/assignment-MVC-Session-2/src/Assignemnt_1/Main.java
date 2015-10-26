package Assignemnt_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main 
{
	/*****************
	 * Main method
	 * @param args
	 ****************/
	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
	{
		parse(AnnotationRunner.class);
	}
	
	private static void parse(Class<?> tempClass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
	{
		Method[] methods = tempClass.getMethods();
		for(Method m : methods)
		{
			if(m.isAnnotationPresent(CanRun.class))
			{
				System.out.print("Annotation Successfully running in ");
				m.invoke(AnnotationRunner.class.newInstance());
			}
		}
	}
}
