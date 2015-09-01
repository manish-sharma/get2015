package com.ds2.queue;
/*College class initializing college details and containing getter setter methods 
 * @author Shishir Pareek
 * Date 26th August 2015
 */
public class College {
	/*variable to hold college name and number of seats*/
	protected String collegeName;
	protected int seatsAvilabel;
	//getter for college name
	public String getCollegeName() {
		return collegeName;
	}
	//setter for college name 
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	//getter for seats available
	public int getSeatsAvilabel() {
		return seatsAvilabel;
	}
	//setter for seats available
	public void setSeatsAvilabel(int seatsAvilabel) {
		this.seatsAvilabel = seatsAvilabel;
	}
}
