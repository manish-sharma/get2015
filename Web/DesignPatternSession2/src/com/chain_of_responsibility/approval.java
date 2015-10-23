package com.chain_of_responsibility;
/**
 * @name Approval
 * @author Sumitra
 *@description this class has method set successor 
 * according to leave
 */
abstract class Approval {
	protected Approval successor;
    public void setSuccessor(Approval successor)
    {
      this.successor = successor;
    }
    public abstract void ProcessRequest(int leave);
}