
import java.util.*;

public class College extends Organization   {
    
   
	
public College(String name, String email, String phone, String description, String address) {
		
		               this.name=name;
		               this.email=email;
		               this.phone=phone;
		               this.description=description;
		               this.address=address;
	}

	
  @Override
public void placementRecord() {
		
	    if(super.flag==0){
		
	    	          Scanner scan=new Scanner(System.in);
		              System.out.println("How Many Placements are there :");
		              int n=scan.nextInt();
		              System.out.println("Enter name of company with cnadidate name and package");
		
	   for(int i=0;i<n;i++){
			         placementsList.add(scan.nextLine()+" "+scan.nextLine()+" "+scan.nextLine());
		}
		             scan.close();
		}
		
	}

	
  @Override
public void coursesOrStandardRecords() {
		
		if(super.flag == 0){
		            Scanner scan=new Scanner(System.in);
		            System.out.println("How many Courses are there");
		            int n = scan.nextInt();
		            System.out.println("Enter names of courses");

	   for(int i=0;i<n;i++){
			        coursesList.add(scan.nextLine());
		}
		            scan.close();
		}
	
	}
	
 public void AddCollege() {
		    AddEntity1( name, email, phone, description, address,placementsList,coursesList);
	}

	

	@Override
  public void schoolOrCollegeRecords() {
		
		
	}

	@Override
	public void interestRecords() {
		// TODO Auto-generated method stub
		
	}

}
