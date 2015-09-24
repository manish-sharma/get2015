/*
 * This is mechanic class which contains information about mechanics
 * @author Banwari
 */
 class Mechanics{
	 String name;
	 String mechanicId;
	 String specificationInCarModel;
	boolean isAvailable;
	/*
	 * Parameterized constructor
	 * @param name is the name of mechanic
	 * @param mechanicId is the Id of mechanic
	 * @param role is the specification of mechanics
	 */
	Mechanics(String name, String mechanicId, String role ) {
		 this.name=name;
		 this.mechanicId=mechanicId;
		 this.specificationInCarModel=role;
		 this.isAvailable=true;
	}
}
