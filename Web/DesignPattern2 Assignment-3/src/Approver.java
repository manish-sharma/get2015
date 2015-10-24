/**
 * Approver class to call processRequest method according to conditions
 * @author Ankur
 * @since 23-10-2015
 */
abstract  class Approver
{
	protected Approver successor;

	public void SetSuccessor(Approver successor)
	{
		this.successor = successor;
	}

	public abstract void ProcessRequest(int noOfDays);
}