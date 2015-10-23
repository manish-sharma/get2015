package com.behavioral.template.model;

/**
 * @name -20-20
 * @author Sumitra
 *@description this class provide a type of cricket that is 20-20 match and override over method
 */
public class _20_20Model extends CricketMentor{
	public static CricketMentor get_20_20Instance() {//method to returning object of 
		return new _20_20Model();
	}
	@Override//overriding over method of Cricket class
	protected void over() {
		System.out.println("This is 20-20 Match and number of overs are 20::");
	}

}