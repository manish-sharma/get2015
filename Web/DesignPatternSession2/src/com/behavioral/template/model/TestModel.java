package com.behavioral.template.model;
/**
 * @name Test
 * @author Sumitra
 *@description this class provide a type of cricket that is test match and override over method
 */
public class TestModel extends CricketMentor{
	public static CricketMentor getTestInstance() {//returning object of test class
		return new TestModel();
	}
	@Override
	protected void over() {
		System.out.println("This is Test Match::");
	}

}
