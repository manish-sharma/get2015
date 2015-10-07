package com.ds2.queue;
/*Class containing student details and its getter setter methods 
 * @author Shishir Pareek
 * Date 26th August 2015
 */
public class Student {
	  private String name;
	    private int rank;
	    private String collegeName;
	    //getter for college name
	    public String getCollegeName() {
			return collegeName;
		}
	    //setter for college name
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		//getter for name
		public String getName() {
	        return name;
	    }
		//setter for name
	    public void setName(String name) {
	        this.name = name;
	    }
	    //getter for rank
	    public int getRank() {
	        return rank;
	    }
	    //setter for rank
	    public void setRank(int rank) {
	        this.rank = rank;
	    } 
}
