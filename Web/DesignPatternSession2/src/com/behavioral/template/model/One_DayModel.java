package com.behavioral.template.model;

/**
 * @name OneDay
 * @author Sumitra
 *@description this class provide a type of cricket that is one day match and override over method
 */

public class One_DayModel extends CricketMentor{
	public static CricketMentor getOneDayInstance() {//returning object of One Day class
		return new One_DayModel();
	}
	@Override
	protected void over() {
		System.out.println("This is One Day Match and number of overs are 50::");
	}

}
