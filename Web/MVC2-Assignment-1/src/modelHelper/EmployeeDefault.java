package modelHelper;



public class EmployeeDefault {
	
	 private static EmployeeDefault Instance = new EmployeeDefault();
	 
	 private EmployeeDefault() {
		 
	
		EmployeeCache.add(EmployeeHelper.createEmployee( 1,"suman", 21,
				"10/10/2015", "suman@gmail.com"));
		
		EmployeeCache.add(EmployeeHelper.createEmployee(2,"chetna", 21,
				"14/10/2015", "chetna@gmail.com"));
		
		EmployeeCache.add(EmployeeHelper.createEmployee(3,"nidhi", 22,
				"10/9/2015", "nidhi@gmail.com"));
	
		EmployeeCache.add(EmployeeHelper.createEmployee(4,"richa", 29,
				"13/10/2015", "richa@gmail.com"));
	
		EmployeeCache.add(EmployeeHelper.createEmployee(5,"anjita", 19,
				"10/11/2015", "anjita@gmail.com"));

	}
	
	 public static EmployeeDefault getInstance( ) {
	      return Instance;
	   }
}
