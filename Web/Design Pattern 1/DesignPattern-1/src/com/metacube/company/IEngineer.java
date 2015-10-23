package com.metacube.company;
/**
 * Interface for engineers all type of engineer should implement this
 * has getRole and getName method
 * @author Sanjay
 * @since 10/21/2015
 */
public interface IEngineer {

	String getRole();
	String getName();
	void setRole(String role);
	void setName(String name);
}
