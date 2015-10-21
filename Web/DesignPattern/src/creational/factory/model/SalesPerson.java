package creational.factory.model;
/**
 * this is employee type sales persons model class holding getter setter method
 * @author Sumitra
 *
 */

public class SalesPerson implements IEmployee {
	
		private String name;
		private String role;
		
		
		private SalesPerson() {

		}
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getRole() {
			return role;
		}
		
		
		public static IEmployee getInstance() {
			SalesPerson salesPerson = new SalesPerson();
			return salesPerson;
		}

		@Override
		public void setRole(String role) {
			this.role = role;
		}
		public String toString() {
			String salesPerson = "[Employee Type:-" + EmployeeType.salesPerson+ ",\nName:-" + name + ",  Role:-" + role + "]";
			return salesPerson;
		}
	}

