package modelHelper;

/**
 * @author Anjita
 * Singleton class EmployeeDefault for initially setting values in map.
 */
public class EmployeeDefault {
	 private static EmployeeDefault Instance = new EmployeeDefault();
	 private EmployeeDefault() {
		EmployeeCache.add(EmployeeHelper.createEmployee( 1,"Anjita", 20,
				"10/10/2015", "Anjita@gmail.com"));
		
		EmployeeCache.add(EmployeeHelper.createEmployee(2,"Manish", 21,
				"14/10/2015", "mainsh@gmail.com"));
		
		EmployeeCache.add(EmployeeHelper.createEmployee(3,"Chetna", 22,
				"10/9/2015", "Chetna@gmail.com"));
	
		EmployeeCache.add(EmployeeHelper.createEmployee(4,"Suman", 29,
				"13/10/2015", "Suman@gmail.com"));
	
		EmployeeCache.add(EmployeeHelper.createEmployee(5,"Nidhi", 19,
				"10/11/2015", "Nidhi@gmail.com"));
	}
	
	 public static EmployeeDefault getInstance( ) {
	      return Instance;
	 }
	 
}
