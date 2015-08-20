/*
 * This is mechanic class which contains information about mechanics
 * @author Banwari
 */
 class Mechanics extends Person{
	String mechnicId;
	String specificationInCarModel;
	boolean isAvailable;
	/*
	 * Parameterized constructor
	 * @param name is the name of mechanic
	 * @param mechanicId is the Id of mechanic
	 * @param role is the specification of mechanics
	 */
	Mechanics(String name, String mechnicId, String role ) {
		 super(name);
		 this.mechnicId=mechnicId;
		 this.specificationInCarModel=role;
		 this.isAvailable=true;
	}
}
