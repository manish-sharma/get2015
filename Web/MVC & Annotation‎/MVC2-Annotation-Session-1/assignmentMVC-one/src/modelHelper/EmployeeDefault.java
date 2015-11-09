package modelHelper;

public class EmployeeDefault 
{
	private static EmployeeDefault instance = new EmployeeDefault();
	
	private EmployeeDefault()
	{
		EmployeeCache.addEmployee(EmployeeHelper.createEmployee("Neha", 23, "6/6/2015", "neha.bansal@metacube.com", 1));
		EmployeeCache.addEmployee(EmployeeHelper.createEmployee("Nidhi", 22, "6/6/2015", "nidhi.sharma@metacube.com", 2));
		EmployeeCache.addEmployee(EmployeeHelper.createEmployee("Chetna", 21, "6/6/2015", "chetna.sharma@metacube.com", 3));
		EmployeeCache.addEmployee(EmployeeHelper.createEmployee("Suman", 22, "6/6/2015", "suman.sharma@metacube.com", 4));
		EmployeeCache.addEmployee(EmployeeHelper.createEmployee("Richa", 23, "7/8/2015", "richa.mittal@metacube.com", 5));
		
	}
	
	public static EmployeeDefault getInstance()
	{
		return instance;
	}

}
