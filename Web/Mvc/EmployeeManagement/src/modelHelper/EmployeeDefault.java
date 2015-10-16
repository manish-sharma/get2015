package modelHelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class EmployeeDefault {
	
	 private static EmployeeDefault Instance = new EmployeeDefault();
	 
	 private EmployeeDefault() {
		 Date date=new Date();
		 DateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");
		 EmployeeCache.clear();
		 System.out.println( formatter.format(date));
		 EmployeeCache.add(EmployeeHelper.createEmployee( 1,"Jignesh", 21,
				 formatter.format(date), "jmistry94@gmail.com"));
		
		EmployeeCache.add(EmployeeHelper.createEmployee(2,"Manish", 21,
				formatter.format(date), "mainsh@gmail.com"));
		
		EmployeeCache.add(EmployeeHelper.createEmployee(3,"Nikhil", 22,
				formatter.format(date), "nikhil@gmail.com"));
	
		EmployeeCache.add(EmployeeHelper.createEmployee(4,"Subhash", 29,
				formatter.format(date), "subhash@gmail.com"));
	
		EmployeeCache.add(EmployeeHelper.createEmployee(5,"Udit", 19,
				formatter.format(date), "udit@gmail.com"));

	}
	
	 public static EmployeeDefault getInstance( ) {
	      return Instance;
	   }
}
