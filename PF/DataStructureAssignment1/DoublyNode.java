/**
 * @author Sumitra----Class node doubly
 *
 */
public class DoublyNode {

	protected int data;
	protected DoublyNode nlink;
	protected DoublyNode plink;

	/* Constructor */
	public DoublyNode() {
		nlink = null;
		data = 0;
		plink = null;
	}

	/* Constructor */
	public DoublyNode(int data, DoublyNode n, DoublyNode p) {
		this.data = data;
		nlink = n;
		plink = p;
	}

	/**
	 * @return the value
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setdata(int data) {
		this.data = data;
	}

	/**
	 * @return the nlink
	 */
	public DoublyNode getNlink() {
		return nlink;
	}

	/**
	 * @param nlink
	 *            the nlink to set
	 */
	public void setNlink(DoublyNode nlink) {
		this.nlink = nlink;
	}

	/**
	 * @return the plink
	 */
	public DoublyNode getPlink() {
		return plink;
	}

	/**
	 * @param plink
	 *            the plink to set
	 */
	public void setPlink(DoublyNode plink) {
		this.plink = plink;
	}

}
