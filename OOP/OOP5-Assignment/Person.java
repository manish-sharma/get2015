

import java.util.ArrayList;
import java.util.Scanner;

public class Person extends Entities implements Records {
	               String schoolOrCollegeName,subOrStandard;
	               ArrayList<String> interest;
	
public Person(String name, String email, String phone, String description, String address) {
		           this.name=name;
		           this.email=email;
		           this.phone=phone;
		           this.description=description;
		           this.address=address;
		           super.addNodes(name,email,phone,description,address);
		
	}

	@Override
	public void schoolOrCollegeRecords() {
	if(super.flag == 0 ){
		
		            Scanner scan=new Scanner(System.in);
		            System.out.println("Enter your school or College Name");
		            schoolOrCollegeName=scan.nextLine();
		            System.out.println("Enter your subject or Standard");
		            subOrStandard=scan.nextLine();
		           
		}
		
	}

	
@Override
public void interestRecords() {
	if(super.flag==0){
		          Scanner scan=new Scanner(System.in);
		          interest=new ArrayList<String>();
		          System.out.println("Your Hobbies or interests");
		          interest.add(scan.nextLine());
		          interest.add(scan.nextLine());
		         
		}
	}
public void AddPerson(){
		       
	           AddEntity(1,name,email,phone,description,address,schoolOrCollegeName,subOrStandard,interest);
		
	}
	
@Override
public void placementRecord() {
	}

	@Override
	public void coursesOrStandardRecords() {
	}
}
