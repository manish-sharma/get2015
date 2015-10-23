package com.designpattern.assignment3;
/**main class which uses the method to show the template design working 
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public class MainClass {
	public static void main(String args[]){
		Cricket cricket = new TwentyTwenty();//setting 20-20 class object in cricket reference
		cricket.start();
		cricket = new OneDayInternational();//setting one day international class object in cricket reference
		cricket.start();
		cricket = new TestCricket();//setting test cricket class object in cricket reference
		cricket.start();
	}
}
