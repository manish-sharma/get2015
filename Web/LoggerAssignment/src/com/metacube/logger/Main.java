package com.metacube.logger;


import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Office office = new Office();
		Developer developer1 = new Developer();
		developer1.setName("Avinash1");
		developer1.setRollNumber(1);
		office.setEnginner(developer1);
		Developer developer2 = new Developer();
		developer2.setName("Avinash2");
		developer2.setRollNumber(2);
		office.setEnginner(developer2);
		Developer developer3 = new Developer();
		developer3.setName("Avinash3");
		developer3.setRollNumber(3);
		office.setEnginner(developer3);
		List<Developer> list = office.getEngineer();
		Iterator<Developer> ite = list.iterator();
		while(ite.hasNext()) {
			Developer developer = ite.next();
			System.out.println(developer.getName()+"-"+developer.getRollNumber()+"\n");
		}
	}
}
