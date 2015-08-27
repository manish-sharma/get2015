package com.queue.array;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CollegeCounseling {
	static Scanner scan =new Scanner(System.in);
	/*
	 * main method using Queue implemented 
	 */
 public static void main(String []args) { 
	 int noOfCandidate = 0;
	 String selectedCollege;
	 ArrayList<String> listOfColleges = new ArrayList<String>();
	 ArrayList<Integer> seatsAvailable = new ArrayList<Integer>();
	Queue queueObject=  new Queue();                        // initialize queue
	
	try{
		System.out.println("Enter no of candidate");
	
	 noOfCandidate = scan.nextInt();
	System.out.println("Enter name of candidate according to rank");
	for(int i =0; i<noOfCandidate ; i++){
		queueObject.enQueue(scan.next());                    //enter element into queue using enQueue method
	}
	//queueObject.display();
	System.out.println("Enter  no of available college");          // information about colleges
	int noOfCollege=scan.nextInt();
	System.out.println("Enter name of available colleges ");
	
	for(int j =0; j<noOfCollege ; j++){
		listOfColleges.add(scan.next());
		
	}
	
	for(int k =0; k<noOfCollege ; k++){
	System.out.println("Enter available seats in college "+listOfColleges.get(k));
	seatsAvailable.add(scan.nextInt());
}
	int counselingcount=0;
	while(counselingcount < noOfCandidate){                   // ask about college from candidate
	
	for(int k =0; k<noOfCollege ; k++){
		System.out.println("College Name: "+listOfColleges.get(k)+"  no of seats available: "+seatsAvailable.get(k));
	}
	System.out.println("select college from list " );
	selectedCollege = scan.next(); 
	int flag=0;
	for(int count =0; count < noOfCollege; count++){
		flag=1;
		if(selectedCollege.equalsIgnoreCase(listOfColleges.get(count))){
			if(seatsAvailable.get(count)>0){
				queueObject.deleteItem();
				
				System.out.println(selectedCollege +" seat  allocated");
				int seat =seatsAvailable.get(count);
				seatsAvailable.set(count, seat-1);
				counselingcount++;
			}
			else {
				System.out.println("seats not available try in next round");
				queueObject.deleteItem();
				System.out.println(selectedCollege +" seat not  allocated ,counseling over ,try in next time");
				counselingcount++;
			}
		}
		
			
		
	}
	if(flag==0){
		System.out.println("Enter valid college name");
	}}
	System.out.println("no candidate remains in list \n Exit");
	}catch(InputMismatchException ip){
		System.out.println("enter integer value\n Exit");
		
	}
}
}
