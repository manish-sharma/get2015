package com.metacube.logger;

import java.util.ArrayList;
import java.util.List;
public class Office implements WorkStation{
	List<Developer> engineerList = new ArrayList<Developer>(); 
	@Override
	public void setEnginner(Developer developer) {
		engineerList.add(developer);
	}
	@Override
	public List<Developer> getEngineer() {
		return engineerList;
	}
}
