package attendence;
/**
 * @author Suman
 *
 */
public abstract class Approver {
	protected Approver successor;
	//Super class to  approve leave request
	
    public void setSuccessor(Approver successor)
    {
    	//method for set successor
      this.successor = successor;
    }
 
    public abstract void processRequest(int days);
}
