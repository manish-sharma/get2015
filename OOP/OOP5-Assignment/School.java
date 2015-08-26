

import java.util.Scanner;

public class School extends Organization {

	
public School(String name, String email, String phone, String description, String address) {
		           this.name=name;
		           this.email=email;
		           this.phone=phone;
		           this.description=description;
		           this.address=address;
	}
@Override
public void placementRecord() {
	}

	
@Override
public void coursesOrStandardRecords() {
	if(super.flag == 0){
		          Scanner scan=new Scanner(System.in);
		          System.out.println("This School is from nursary to :");
	              standardFromTo=scan.nextLine();
		}
	}
	
public void AddSchool(){
	   
	            AddEntity(2, name, email, phone, description, address,null,standardFromTo,null);
	}


	@Override
	public void schoolOrCollegeRecords() {
	}

	@Override
	public void interestRecords() {
	}
    

}
