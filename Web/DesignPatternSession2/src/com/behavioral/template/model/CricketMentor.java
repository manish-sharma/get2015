package com.behavioral.template.model;
/**
 * @name Cricket
 * @author Sumitra
 *@description this class provide a skeleton to the cricket match which may be 20-20 or one day or Test match
 */
public abstract class CricketMentor {
	public void play() {
		start();
		over();
		end();
	}
	 protected void start() {
		 System.out.println("Match has started:::");
	}
	 protected void end() {
		 System.out.println("Match has end:::");
	}
	 abstract protected void over();//abstract method used by child classes
}